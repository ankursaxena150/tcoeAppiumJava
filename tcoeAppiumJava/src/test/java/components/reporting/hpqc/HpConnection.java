package components.reporting.hpqc;

import com4j.*;
import components.testbase.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class HpConnection extends TestBase {


    static DDDD.ITestSet testSet;
    static DDDD.ITestSetTreeManager testSetFolderFactory;
    static DDDD.ITestSetFolder testSetFolder;
    static DDDD.ITestSetFactory testSetFactory;
    DDDD.ITDConnection connection;
    DDDD.IBaseFactory testCaseF;
    String logFilePath = "\\target\\failureLog.txt";


    public void connectionToQC() {
        //QC url
        String url = "https://hpalm.srv.volvo.com/qcbin/";
        //username for login
        String username = "A020905";
        //password for login
        String password = "";
        //domain
        String domain = "DVP";
        //project
        String project = "GLM";
        connection = DDDD.ClassFactory.createTDConnection();
        connection.initConnectionEx(url);
        connection.connectProjectEx(domain, project, username, password);

        testSetFactory = (connection.testSetFactory()).queryInterface(DDDD.ITestSetFactory.class);
        //TestSetFactory testSetF = (TestSetFactory)connection.TestSetFactory;
        //readAllProjectsInVolvo(connection)
    }

    private void readAllProjectsInVolvo(DDDD.ITDConnection10 connection) {
        DDDD.IList domains = connection.domainsList();
        DDDD.IList projectList = connection.projectsList();
        List<String> domainList = new ArrayList<String>();
        for (int i = 1; i < domains.count(); i++) {
            domainList.add((String) domains.item(i));
            logger.info("DOmains: " + domains.item(i));
        }
        for (int i = 1; i < projectList.count(); i++) {
            logger.info("Projects : " + projectList.item(i));
        }
        connection.connectProject("Baldo", "A020905", "");
        DDDD.ITreeManager iTreeManager = connection.treeManager().queryInterface(DDDD.ITreeManager.class);
        DDDD.ISubjectNode iSubNode = iTreeManager.nodeByPath("Subject").queryInterface(DDDD.ISubjectNode.class);

        DDDD.IList testFolders = iSubNode.newList();
        for (Com4jObject isys : testFolders) {
            logger.info("Test folder : " + isys.queryInterface(DDDD.ISysTreeNode.class).name());
        }
    }

    public DDDD.ITestSetFolder addFoldername(String environment) {
//        String folderVersionName = DateTime.Now.ToString("yyyy-MM-dd HH:mm");

        String folderVersionName = System.getProperty("ActualVersion");
        if (folderVersionName == null) {
            folderVersionName = "uknownVersion";
        }
        testSetFolderFactory = connection.testSetTreeManager().queryInterface(DDDD.ITestSetTreeManager.class);
        testSetFolder = testSetFolderFactory.nodeByPath("Root\\Automation Test Results\\").queryInterface(DDDD.ITestSetFolder.class);

        try {
            testSetFolder = testSetFolder.addNode(folderVersionName).queryInterface(DDDD.ITestSetFolder.class);
        } catch (Exception ex) {
//            if (ex is COMException || ex is NullReferenceException)
//            { }

        }
        testSetFolder = testSetFolderFactory.nodeByPath("Root\\Automation Test Results\\" + folderVersionName).queryInterface(DDDD.ITestSetFolder.class);
        try {
            testSetFolder = testSetFolder.addNode(environment).queryInterface(DDDD.ITestSetFolder.class);
        } catch (Exception e) {
            //testSetFolder.RemoveNode(environment);
        }
        String finalFolderPath = "Root\\Automation Test Results\\" + folderVersionName + "\\" + environment;
        testSetFolder = testSetFolderFactory.nodeByPath(finalFolderPath).queryInterface(DDDD.ITestSetFolder.class);
        return testSetFolder;
    }

    public DDDD.ITestSet addTestSet(String testSetName) {
        DDDD.IList testSets = testSetFolder.findTestSets(testSetName, false, "");
        if (testSets == null) {
            testSetFactory = testSetFolder.testSetFactory().queryInterface(DDDD.ITestSetFactory.class);
            testSet = testSetFactory.addItem(testSetName).queryInterface(DDDD.ITestSet.class);
            testSet.post();
        } else {
            for (Com4jObject testSetTemp : testSets) {
                testSet = testSetTemp.queryInterface(DDDD.ITestSet.class);

            }
        }
        return testSet;
    }

    public DDDD.ITSTest addTestCaseToTestSet(String testCaseID, String testCaseStatus, TimeUnit testDuration) {
        testCaseF = testSet.tsTestFactory().queryInterface(DDDD.IBaseFactory.class);
        try {
            DDDD.ITSTest testCase = testCaseF.addItem(testCaseID).queryInterface(DDDD.ITSTest.class);
            testCase.status(testCaseStatus);
            DDDD.IRunFactory runF = testCase.runFactory().queryInterface(DDDD.IRunFactory.class);
            DDDD.IRun run = runF.addItem(runF.uniqueRunName()).queryInterface(DDDD.IRun.class);
            //run.setName("RN_DURATION")= Math.round(testDuration.getTotalSeconds());
            run.status(testCaseStatus);
            run.post();
            return testCase;
        } catch (Exception e) {
            String path = new File("").getAbsolutePath();
            String description = "Test case id = " + testCaseID + " doesn't exist in the Quality Center";
            //println(description);
            createLogFile(path + logFilePath, description);
            //addAtachementToTestSet(testSet, description);
            return null;
        }
    }

    public void addAlertForTest(DDDD.ITSTest testCase, int testCaseID) {
        if (testCase != null) {
            ((DDDD.IAlertable2) testCase).addAlert("TEST", testCaseID, "Test Automation", "First execution of test failed - please check logs");
        }
    }

    public void addAtachementToTestSet(DDDD.ITestSet testSet, String description) {
        String path = new File("").getAbsolutePath();
        DDDD.IAttachmentFactory attachF = testSet.attachments().queryInterface(DDDD.IAttachmentFactory.class);
        DDDD.IAttachment attach = attachF.addItem(null).queryInterface(DDDD.IAttachment.class);
        attach.type(1);
        attach.description(description);
        attach.fileName(path + logFilePath);
        attach.post();
    }

    public void attachFailureMessageToTestCase(DDDD.ITSTest testCase, String message) {
        String path = new File("").getAbsolutePath();
        createLogFile(path + logFilePath, message);
        String fileName = new File(path + logFilePath).getName();
        DDDD.IAttachmentFactory attachF = testCase.attachments().queryInterface(DDDD.IAttachmentFactory.class);
        DDDD.IAttachment attach = attachF.addItem(fileName).queryInterface(DDDD.IAttachment.class);
        DDDD.IExtendedStorage extAttach = attach.attachmentStorage().queryInterface(DDDD.IExtendedStorage.class);
        extAttach.clientPath("target");
        //attach.type(1);
        //extAttach.save(fileName, true);
        attach.description(message);
        attach.post();
    }

    public void attachScreenShotToTestCase(DDDD.ITSTest testCase, String screenShotName) {
        if (screenShotName != "") {
            String path = new File("").getAbsolutePath();
            String fileName = new File(path + screenShotName).getName();
            DDDD.IAttachmentFactory attachF = testCase.attachments().queryInterface(DDDD.IAttachmentFactory.class);
            DDDD.IAttachment attach = attachF.addItem(fileName).queryInterface(DDDD.IAttachment.class);
            DDDD.IExtendedStorage extAttach = attach.attachmentStorage().queryInterface(DDDD.IExtendedStorage.class);
            extAttach.clientPath("target/test-screen");
//            extAttach.save(fileName, true);
            attach.post();
        }
    }

    public void createLogFile(String filePath, String description) {
        File f = new File(filePath);

        if (f.exists()) {
            f.delete();
        }
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            fw = new FileWriter(filePath);
            bw = new BufferedWriter(fw);
            try {
                bw.write(description);
            } catch (NullPointerException e) {
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();

            }

        }

    }
}
