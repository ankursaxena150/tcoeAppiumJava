package testingEnvironments.saucelabs;

import enums.AndroidDevicesSauce;
import enums.Apps;
import enums.Credentials;
import enums.IOSDevicesSauce;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * maciej.szwarc@volvo.com
 * SauceController is responsible for creating driver instance for SauceLabs testing
 * Please configure your caps and also provide your Credentials under enums component
 */

// Sauce Controller builds the driver with given credentials and caps
public class SauceController {

    // SAUCE ANDROID SIMULATOR SELECTION (executionOS must be equal to OS.SauceAndroid to use it)
    public static AndroidDevicesSauce androidDeviceSauce = AndroidDevicesSauce.SAMSUNG_GALAXY_S9_ANDROID_V9_0;
    // END OF SAUCE ANDROID SIMULATOR SELECTION

    // SAUCE IOS SIMULATOR SELECTION (executionOS must be equal to OS.SaucelabIOS to use it)
    public static IOSDevicesSauce iosDeviceSauce = IOSDevicesSauce.IPHONE_11_PRO_IOS13_0;
    // END OF SAUCE IOS SIMULATOR SELECTION

    // SauceCredentialManager stores your SauceLab id and auth key so you don't have to retype them anywhere else
    private static SauceCredentialsManager sauceCredentialsManager = new SauceCredentialsManager(

            System.getProperty("SauceUser", Credentials.SAUCE_ID.toString()),
            System.getProperty("SauceKey", Credentials.SAUCE_KEY.toString())
    );
    public DesiredCapabilities caps;
    //private String buildDate = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm a").format(Calendar.getInstance().getTime());
    private String buildDate;
    // StorageHandler allows you to push app file into SauceLab storage
    // SauceCredentialManager returns and instance of storageHandler based on its credentials
    private SauceStorageHandler sauceStorageHandler = sauceCredentialsManager.getStorageHandler();

    public SauceController(String buildDate) {
        this.buildDate = buildDate;
    }

    // Builds caps for the driver. Please get familiar with SauceLab documentation if any changes are needed
    // Please get familiar with device names on the SauceLab
    private DesiredCapabilities getIOSCapabilities(String testName, String suiteName) {
        List<String> tags = new ArrayList<>();
        tags.add("Dev");
        tags.add("TCoE");
        tags.add("Tests Automation");

        this.caps = new DesiredCapabilities();
        caps.setCapability("tags", tags);
        caps.setCapability("appiumVersion", iosDeviceSauce.getAppiumVersion());
        caps.setCapability("deviceName", iosDeviceSauce.getDeviceName());
        caps.setCapability("deviceOrientation", iosDeviceSauce.getDeviceOrientation());
        caps.setCapability("platformVersion", iosDeviceSauce.getPlatformVersion());
        caps.setCapability("platformName", "iOS");
        caps.setCapability("parentTunnel", iosDeviceSauce.getParentTunnel());
        caps.setCapability("tunnelIdentifier", iosDeviceSauce.getTunnelIdentifier());
        caps.setCapability("name", suiteName + "." + testName);
        caps.setCapability("simpleIsVisibleCheck", true);
        caps.setCapability("build", "[iOS][QA] " + Apps.APP_IOS.getAppName() + " " + buildDate);
        // please use sauce storage handler to push your app into sauce storage
        caps.setCapability("app", "sauce-storage:" + Apps.APP_IOS.getAppName() + ".zip");
        return this.caps;
    }


    private DesiredCapabilities getAndroidCapabilities(String testName, String suiteName) {
        List<String> tags = new ArrayList<>();
        tags.add("Dev");
        tags.add("TCoE");
        tags.add("Tests Automation");

        this.caps = new DesiredCapabilities();
        caps.setCapability("tags", tags);
        caps.setCapability("parentTunnel", androidDeviceSauce.getParentTunnel());
        caps.setCapability("tunnelIdentifier", androidDeviceSauce.getTunnelIdentifier());
        caps.setCapability("appiumVersion", androidDeviceSauce.getAppiumVersion());
        caps.setCapability("deviceName", androidDeviceSauce.getDeviceName());
        caps.setCapability("deviceOrientation", androidDeviceSauce.getDeviceOrientation());
        caps.setCapability("platformVersion", androidDeviceSauce.getPlatformVersion());
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", Apps.APP_ANDROID.getAppPackage());
        caps.setCapability("appActivity", Apps.APP_ANDROID.getAppActivity());
        caps.setCapability("name", suiteName + "." + testName);
        caps.setCapability("build", "[Android][version] " + Apps.APP_ANDROID.getAppName() + " " + buildDate);
        // please use sauce storage handler to push your app into sauce storage
        caps.setCapability("app", "sauce-storage:" + Apps.APP_ANDROID.getAppName());
        return this.caps;
    }

    public IOSDriver getIOSDriver(String testName, String suiteName) throws MalformedURLException {
        return new IOSDriver(new URL(sauceCredentialsManager.getConnectionUrl()), getIOSCapabilities(testName, suiteName));
    }

    public AndroidDriver getAndroidDriver(String testName, String suiteName) throws MalformedURLException {

        return new AndroidDriver(new URL(sauceCredentialsManager.getConnectionUrl()), getAndroidCapabilities(testName, suiteName));
    }

    public String getUser() {
        return sauceCredentialsManager.getId();
    }

    ;

    public String getAuthKey() {
        return sauceCredentialsManager.getAuthKey();
    }

    ;

    public SauceStorageHandler getSauceStorageHandler() {
        return sauceStorageHandler;
    }
}
