package components.testbase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import components.dataproviders.ExcelLibrary;
import components.network.ProxyConfiguration;
import components.network.ProxyUtil;
import components.reporting.ExtentManager;
import components.reporting.TestLog;
import enums.Credentials;
import enums.ToolsLocations;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;
import testingEnvironments.local.LocalController;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Maciej Szwarc 2018
 * TestBase class is responsible for activities like
 * - logging test execution
 * - generating report
 * - running android device manager
 * - configuring proxy
 * and maybe more.
 * Please read content of this class at least once to make sure you understand the concept of this class.
 */
public class TestBase extends TestBaseAppium {

    // log and report related stuff
    protected TestLog logger = new TestLog();
    private ExtentReports extent;
    private ThreadLocal<ExtentTest> parentTestThreadLocal = new ThreadLocal<>();
    private ThreadLocal<ExtentTest> childTestThreadLocal = new ThreadLocal<>();
    private Map<String, ExtentTest> extentMap = new HashMap();
    protected ThreadLocal<String> testNameParameter = new ThreadLocal<>();
    String proxyAddress;

    // testObject reporting
    private String[][] testCaseID = new String[50][2];

    @BeforeSuite
    public void beforeSuite() {
        if (executionOS == OS.LocalAndroid) {
            /**
             *  if we are testing android locally, we should run android virtual device before driver starts initializing
             */
            runAVD(); // comment out if you want to connect to the real device
        }
        // configuring Volvo proxy
        configureProxy();
    }

    /**
     * Create object instances for the extent report and create the suite object.
     */
    @BeforeClass
    public void logStartTestExecutionBeforeClass() {
        extent = ExtentManager.getInstance();

        parentTestThreadLocal.set(extent.createTest(getClass().getSimpleName())); // this test represents the suite, each test method within the class will be assigned to this suite

        logger.logStartTestClassExecution(getClass().getSimpleName());
        // tricky workaround for extent parent appearing as null outside of this method so that we can have multiple suites in one extent report
        // if it's stupid but it works it ain't stupid
        extentMap.put(getClass().getSimpleName(), parentTestThreadLocal.get());
    }


    @BeforeMethod
    public void logStartTestExecutionBeforeMethod(Method testMethod) {
        logger.logStartTestExecution(testMethod.getName());

    }

    /**
     * 1. Create a test instance for the html report
     * 2. Assign category for the test.
     * 3. Set test result and log it.
     *
     * @param result
     * @param testMethod
     * @throws IOException
     */
    @AfterMethod
    public void logEndTestExecutionAfterMethod(ITestResult result, Method testMethod) throws IOException {
        String categoryName;
        Test test;

        // this piece of code gets the group name from the TestNG test and set is as the category name in ExtentReport
        test = testMethod.getAnnotation(Test.class);
        try {
            categoryName = test.groups()[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            categoryName = "uknownCategory";
        }
        childTestThreadLocal.set(extentMap.get(getClass().getSimpleName()).createNode(testMethod.getName() + dataProviderString())); // this test represents the test method from the test suite
        childTestThreadLocal.get().assignCategory(categoryName);

        if (result.getStatus() == ITestResult.FAILURE) {

            childTestThreadLocal.get().log(Status.FAIL, "Tests || ${testMethod.getName()} || FAILED with message: \n" + result.getThrowable().getMessage());
            new File("/target/test-screenshots/").mkdirs();
            String pathDir = new File("").getAbsolutePath();
            File srcFile = driver().getScreenshotAs(OutputType.FILE);
            //String filename= UUID.randomUUID().toString();
            String filename = result.getMethod().getMethodName() + "-screenshot.png";
            String pathFile = pathDir + "/target/test-screen/" + filename;
            File targetFile = new File(pathFile);
            FileUtils.copyFile(srcFile, targetFile);
            childTestThreadLocal.get().addScreenCaptureFromPath(pathFile);

        } else if (result.getStatus() == ITestResult.SUCCESS) {

            childTestThreadLocal.get().log(Status.PASS, "Tests PASSED: " + testMethod.getName());

        } else if (result.getStatus() == ITestResult.SKIP) {

            childTestThreadLocal.get().log(Status.SKIP, "Tests SKIPPED");
        }

        logger.logEndTestExecution(result.getMethod().getMethodName(), result.getStatus());

    }


    @AfterClass
    public void logEndTestExecutionAfterClass() {
        logger.logEndTestClassExecution(getClass().getSimpleName());
    }

    /**
     * Finish creating the html report and teardown android virtual device.
     */
    @AfterSuite
    public void logEndTestExecutionAfterSuite() {
        addInformationToExtentReport();
        extent.flush();

        if (executionOS == OS.LocalAndroid) {
            closeAVD();
        }

    }

    String dataProviderString() {
        if (testNameParameter.get() != null) {
            return "(" + testNameParameter.get() + ")";
        }
        return "";
    }

    /**
     * Adding some metadata to the test report. Mostly information about the test environment.
     */
    private void addInformationToExtentReport() {

        // let's filter manually keys that are not needed for HTML report
        HashMap newMap = new HashMap();
        capsMap.forEach((k, v) -> newMap.put(k, v));
        newMap.remove("noReset");
        newMap.remove("webdriver.remote.quietExceptions");
        newMap.remove("backendRetries");
        newMap.remove("showIOSLog");
        newMap.remove("maxTypingFrequency");
        newMap.remove("newCommandTimeout");
        newMap.remove("javascriptEnabled");
        newMap.remove("udid");
        newMap.remove("events");
        newMap.remove("preventWDAAttachments");
        newMap.remove("hasMetadata");
        newMap.remove("keepKeyChains");
        newMap.remove("webdriver.remote.sessionid");
        newMap.remove("eventTimings");
        newMap.remove("launchTimeout");
        newMap.remove("sdkVersion");
        newMap.remove("app");
        newMap.remove("device");

        if (executionOS == OS.TestobjectAndroid || executionOS == OS.SauceAndroid) {
            newMap.remove("locationContextEnabled");
            newMap.remove("proxy");
            newMap.remove("databaseEnabled");
            newMap.remove("warnings");
            newMap.remove("networkConnectionEnabled");
            newMap.remove("browserName");
            newMap.remove("takesScreenshot");
            newMap.remove("webStorageEnabled");
            newMap.remove("desired");

        }

        newMap.forEach((k, v) -> extent.setSystemInfo(k.toString() + " ", v.toString()));
        extent.setSystemInfo("Resolution", resolutionSize);

    }

    /**
     * Configuring proxy settings.
     * We have to setup proxy before any driver initialization, otherwise we gonna get Unknown host exception.
     */
    private void configureProxy() {

        if (executionOS != OS.LocalIOS && executionOS != OS.LocalAndroid) {
            String PAC_URL = "http://proxyconf.srv.volvo.com/";
            URL url = null;
            try {
                url = new URL(PAC_URL);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            Proxy proxy = null;
            try {
                proxy = ProxyUtil.getProxy(url, new URL("http://ondemand.eu-central-1.saucelabs.com"));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            String fullProxyAddress;
            if (proxy != null) {
                fullProxyAddress = proxy.address().toString();
                proxyAddress = StringUtils.substringBefore(fullProxyAddress, "/");
                logger.info("Resolved proxy address: " + proxyAddress);
                ProxyConfiguration proxyConfiguration = new ProxyConfiguration(proxyAddress, "8080", Credentials.VCN_ID.toString(), Credentials.VCN_KEY.toString());
                System.getProperties().put("http.proxyHost", proxyConfiguration.getHost());
                System.getProperties().put("http.proxyPort", proxyConfiguration.getPort());
                System.getProperties().put("https.proxyHost", proxyConfiguration.getHost());
                System.getProperties().put("https.proxyPort", proxyConfiguration.getPort());

                final String authUser = proxyConfiguration.getUser();
                final String authPassword = proxyConfiguration.getPassword();
                Authenticator.setDefault(
                        new Authenticator() {
                            public PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(
                                        authUser, authPassword.toCharArray());
                            }
                        }
                );

                System.getProperties().put("http.proxyUser", proxyConfiguration.getUser());
                System.getProperties().put("http.proxyPassword", proxyConfiguration.getPassword());

            }
        }
        // end of configuring proxy settings
    }

    /**
     * Running android virtual device
     */
    private void runAVD() {
        try {
            // please update this string to match with your SDK installation
            // Runtime.getRuntime().exec("taskkill /IM adb.exe /F");
            Runtime.getRuntime().exec(ToolsLocations.ANDROID_SDK_PATH + "platform-tools\\adb.exe kill-server");
            Runtime.getRuntime().exec(ToolsLocations.ANDROID_SDK_PATH + "platform-tools\\adb.exe start-server");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // please update this string to match with your SDK installation as well as AVD name
                // reference https://developer.android.com/studio/run/emulator-commandline.html
                Runtime.getRuntime().exec(ToolsLocations.ANDROID_SDK_PATH + "emulator\\emulator.exe -avd " + LocalController.androidSimulator.getDeviceName() + " -netdelay none -netspeed full");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeAVD() {
        // kill processes
        try {
            // please update this string to match with your SDK installation
            Runtime.getRuntime().exec("taskkill /im emulator.exe /f");
            Runtime.getRuntime().exec("taskkill /im qemu-system-i386.exe /f");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void setTestCaseIDFromExcel() {
        int i = 1;
        String excelHpConnection = "/hpConnection/TestMethodReferingTestCaseID.xlsx";
        ExcelLibrary excelread = new ExcelLibrary();

        i = 1;

        while (excelread.readFromExcel(i, 0, excelHpConnection) != null && excelread.readFromExcel(i, 0, excelHpConnection) != "") {
            String a1 = excelread.readFromExcel(i, 0, excelHpConnection);
            String a2 = excelread.readFromExcel(i, 1, excelHpConnection);
            testCaseID[i][0] = a1;
            testCaseID[i][1] = a2;
            i++;
        }
    }

    public String findTestCaseID(String testCaseName) {

        for (int i = 0; i <= testCaseID.length - 1; i++) {
            if (testCaseID[i][0].equals(testCaseName)) {
                return testCaseID[i][1];
            }
        }
        return null;
    }

    /**
     * Alerts seem to require a separate thread from the PageObjects execution, as they are not app-related, but system-related.
     * That is why methods for interaction with alerts are here, instead of BasePageIOS/BasePageAndroid.
     */

    protected void acceptAlert() {
        new WebDriverWait(driver(), 5).until(ExpectedConditions.alertIsPresent());
        driver().switchTo().alert().accept();
    }

    protected void dismissAlert() {
        new WebDriverWait(driver(), 5).until(ExpectedConditions.alertIsPresent());
        driver().switchTo().alert().dismiss();
    }

    protected String getTextFromAlert() {
        new WebDriverWait(driver(), 5).until(ExpectedConditions.alertIsPresent());
        return driver().switchTo().alert().getText();
    }
}
