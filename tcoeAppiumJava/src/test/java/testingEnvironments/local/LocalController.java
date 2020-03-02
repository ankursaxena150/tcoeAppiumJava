package testingEnvironments.local;

import enums.AndroidDevicesSimulator;
import enums.Apps;
import enums.IOSDevicesSimulator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class LocalController {

    private DesiredCapabilities capabilities;

    // ANDROID SIMULATOR SELECTION (executionOS must be equal to OS.LocalAndroid to use it)
    public static AndroidDevicesSimulator androidSimulator = AndroidDevicesSimulator.NEXUS_5X_ANDROID_V10_0;
    // END OF ANDROID SIMULATOR SELECTION

    // IOS SIMULATOR SELECTION (executionOS must be equal to OS.LocalIOS to use it)
    public static IOSDevicesSimulator iosSimulator = IOSDevicesSimulator.IPHONE_11_PRO_IOS_V13_1;
    // END OF IOS SIMULATOR SELECTION

    private DesiredCapabilities getLocalAndroidCapabilities() {

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/app/Android");
        File app = new File(appDir, Apps.APP_ANDROID.getAppName());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", androidSimulator.getDeviceName());
        capabilities.setCapability("automationName", androidSimulator.getAutomationName());
        capabilities.setCapability("app", app.getAbsolutePath());
        //caps.setCapability("appPackage", Apps.APP_ANDROID.getAppPackage());
        //caps.setCapability("appActivity", Apps.APP_ANDROID.getAppActivity());
        capabilities.setCapability("newCommandTimeout", "600");

        return capabilities;
    }

    private DesiredCapabilities getLocalIOSCapabilities() {

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/app/iOS/");
        File app = new File(appDir, Apps.APP_IOS.toString());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("version", iosSimulator.getPlatformVersion());
        capabilities.setCapability("automationName", iosSimulator.getAutomationName());
        capabilities.setCapability("deviceName", iosSimulator.getDeviceName());
        capabilities.setCapability("deviceOrientation", iosSimulator.getDeviceOrientation());
        capabilities.setCapability("noReset", false);
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("showXcodeLog", true);
        capabilities.setCapability("autoAcceptAlerts", true);

        return capabilities;
    }

    public AndroidDriver getAndroidDriver() throws MalformedURLException {
        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), getLocalAndroidCapabilities());
    }

    public IOSDriver getIOSDriver() throws MalformedURLException {
        return new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), getLocalIOSCapabilities());
    }

}
