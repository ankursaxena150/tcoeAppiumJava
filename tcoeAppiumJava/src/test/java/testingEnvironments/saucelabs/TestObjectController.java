package testingEnvironments.saucelabs;

import enums.AndroidDevicesTestObject;
import enums.Credentials;
import enums.IOSDevicesTestObject;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * maciej.szwarc@volvo.com
 * Testobject is responsible for creating driver instance for Testobject testing
 * Please configure your caps and also provide your Credentials under enums component
 */
// TestObject Controller builds the driver with given credentials and caps
public class TestObjectController {
    public DesiredCapabilities capabilities;
    private String buildDate;

    // IOS REAL DEVICE SELECTION
    private IOSDevicesTestObject iosDevice = IOSDevicesTestObject.IPAD_2_REAL;
    // END OF REAL IOS DEVICE SELECTION

    // ANDROID REAL DEVICE SELECTION
    private AndroidDevicesTestObject androidDevice = AndroidDevicesTestObject.SAMSUNG_GALAXY_NOTE_8_REAL;
    // END OF ANDROID REAL DEVICE SELECTION

    // TestObjectCredentialManager stores your TestObject id and auth key so you don't have to retype them anywhere else
    private TestObjectCredentialsManager testobjectCredentialsManager = new TestObjectCredentialsManager(
        System.getProperty("TestobjectUser",Credentials.TESTOBJECT_ID.toString()),
        System.getProperty("TestobjectKey",Credentials.TESTOBJECT_KEY.toString())
            
    );
    // StorageHandler allows you to push app file into TestObject, you can do it also from the website
    // testobjectCredentialsManager returns and instance of storageHandler based on its credentials
    private TestObjectStorageHandler storageHandler = testobjectCredentialsManager.getStorageHandler();

    public TestObjectController(String buildDate) {
        this.buildDate = buildDate;
    }

    // Builds caps for the driver. Please get familiar with TestObject documentation if any changes are needed
    // Please get familiar with available devices on test objects
    private DesiredCapabilities getIOSCapabilities(String testName, String suiteName) {
        this.capabilities = new DesiredCapabilities();
        capabilities.setCapability("testobject_api_key", testobjectCredentialsManager.getAuthKey());
        capabilities.setCapability("build", buildDate);
        capabilities.setCapability("frameworkVersion", iosDevice.getFrameworkVersion());
        capabilities.setCapability("appiumVersion", iosDevice.getAppiumVersion());
        capabilities.setCapability("deviceName", iosDevice.getDeviceName());
        capabilities.setCapability("testobject_app_id", "1");
        capabilities.setCapability("testobject_test_name", testName);
        capabilities.setCapability("testobject_suite_name", suiteName);
        capabilities.setCapability("newCommandTimeout", 120);
        return this.capabilities;
    }


    private DesiredCapabilities getAndroidCapabilities(String testName, String suiteName) {
        this.capabilities = new DesiredCapabilities();
        capabilities.setCapability("testobject_api_key", testobjectCredentialsManager.getAuthKey());
        capabilities.setCapability("build", buildDate);
        capabilities.setCapability("frameworkVersion", androidDevice.getFrameworkVersion());
        capabilities.setCapability("appiumVersion", androidDevice.getAppiumVersion());
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", androidDevice.getPlatformVersion());
        capabilities.setCapability("deviceName", androidDevice.getDeviceName());
        capabilities.setCapability("testobject_app_id", "1");
        capabilities.setCapability("testobject_test_name", testName);
        capabilities.setCapability("testobject_suite_name", suiteName);
        capabilities.setCapability("newCommandTimeout", 120);
        return this.capabilities;
    }

    // Return the driver build up with given caps and credentials
    public IOSDriver getIOSDriver(String testName, String suiteName) throws MalformedURLException {
        return new IOSDriver(new URL(testobjectCredentialsManager.getConnectionUrl()), getIOSCapabilities(testName, suiteName));
    }

    public AndroidDriver getAndroidDriver(String testName, String suiteName) throws MalformedURLException {
        return new AndroidDriver(new URL(testobjectCredentialsManager.getConnectionUrl()), getAndroidCapabilities(testName, suiteName));
    }

    public String getUser() {
        return testobjectCredentialsManager.getId();
    }

    public String getAuthKey() {
        return testobjectCredentialsManager.getAuthKey();
    }

}
