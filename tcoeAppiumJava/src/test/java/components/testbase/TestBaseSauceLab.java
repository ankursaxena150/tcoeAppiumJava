package components.testbase;

import com.saucelabs.saucerest.DataCenter;
import com.saucelabs.saucerest.SauceREST;
import enums.Apps;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import testingEnvironments.saucelabs.SauceStorageHandler;

import java.io.File;
import java.lang.reflect.Method;

public class TestBaseSauceLab extends TestBase {

    //private String buildDate;
    private Boolean forceUpload = false;
    private SauceREST sauceREST;

    @BeforeMethod
    public void setupSauceJob(Method testMethod) {
        if (executionOS.equals(OS.SaucelabIOS) || executionOS.equals(OS.SauceAndroid)) {
            sauceREST = new SauceREST(sauceController.getUser(), sauceController.getAuthKey(), DataCenter.EU);

            //Map<String, Object> updates = new HashMap<>();


            //sauceREST.updateJobInfo(getSessionId(), updates);
        }
    }

    @BeforeSuite
    public void checkStorage() {

        // build date will be used to stack all tests from this run into one build
        //buildDate = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

        // This piece of code determines if our app is already uploaded to SauceLabs storage. If not, it will attempt to upload the file.
        // Please make sure it will upload YOUR app.
        // TestObject works different way. Upload the app file via their website.
        if (executionOS == TestBaseAppium.OS.SaucelabIOS || executionOS == TestBaseAppium.OS.SauceAndroid) {
            SauceStorageHandler storage = sauceController.getSauceStorageHandler();
            File classpathRoot;
            File appDir;
            File app = null;
            String filename = null;

            if (executionOS == TestBaseAppium.OS.SaucelabIOS) {
                classpathRoot = new File(System.getProperty("user.dir"));
                appDir = new File(classpathRoot, "/app/iOS");
                app = new File(appDir, Apps.APP_IOS.toString() + ".zip");
                filename = Apps.APP_IOS.toString() + ".zip";


            } else if (executionOS == OS.SauceAndroid) {
                classpathRoot = new File(System.getProperty("user.dir"));
                appDir = new File(classpathRoot, "/app/Android");
                app = new File(appDir, Apps.APP_ANDROID.toString());
                filename = Apps.APP_ANDROID.toString();
            }

            String storedFiles = storage.getFiles();
            logger.info("Sauce-storage content: " + storedFiles);
            if (!storedFiles.contains(filename)) {
                int responseCode = 0;
                logger.info("App not found. Trying to upload...");
                try {
                    responseCode = storage.uploadFile(filename, app);
                } finally {
                    if (responseCode != 200) {
                        logger.error("Error uploading the file.");
                    } else {
                        logger.info("File uploaded successfully!");
                    }
                }
            } else if (forceUpload) {
                int responseCode = 0;
                logger.info("Force upload to Sauce-storage...");
                try {
                    responseCode = storage.uploadFile(filename, app);
                } finally {
                    if (responseCode == 200) {
                        logger.info("File uploaded successfully!");
                    } else {
                        logger.error("Error uploading the file.");
                    }
                }
            } else {
                logger.info("App found in the storage. Continue test setup.");
            }

        }

    }

    private void updateJobInfo(ITestResult result, Method testMethod){
            Boolean passed = result.getStatus() == ITestResult.SUCCESS;
            try {
                // Logs the result to Sauce Labs
                ((JavascriptExecutor) getLastDriver()).executeScript("sauce:job-result=" + (passed ? "passed" : "failed"));
                ((JavascriptExecutor)getLastDriver()).executeScript("sauce:job-name="+getClass().getSimpleName() + "." + testMethod.getName()+ dataProviderString());
            } catch (NoClassDefFoundError e) {
                logger.info("Session notFound exception occurs during SauceConnection");
            }
        }


    @AfterMethod
    public void updateSauceJob(ITestResult result, Method testMethod) {

        if (executionOS.equals(OS.SaucelabIOS) || executionOS.equals(OS.SauceAndroid)) {

            // sending test status to saucelabs, updating test name and assigning it to the build
            updateJobInfo(result,testMethod);
        }
    }

}
