package components.testbase;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import testingEnvironments.local.LocalController;
import testingEnvironments.saucelabs.SauceController;
import testingEnvironments.saucelabs.TestObjectController;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


/**
 * Maciej Szwarc 2018
 * TestBaseAppium is the core class which all next classes will inherit from.
 * It is responsible for building the driver and passing some context into it.
 * Current hierarchy is following:
 * -> TestBaseAppium
 * -> TestBase
 * -> TestBaseSauceLab
 * -> TestBaseEyes
 */


public class TestBaseAppium {

    /**
     * Test environment selection.
     */
    public enum OS {
        LocalAndroid,
        LocalIOS,
        SaucelabIOS,
        TestobjectIOS,
        SauceAndroid,
        TestobjectAndroid
    }


    // TEST MODE SELECTION
    public static OS executionOS = OS.SaucelabIOS;
    // END OF TEST MODE SELECTION


    private ThreadLocal<String> sessionId = new ThreadLocal<>();
    static protected HashMap<String, String> sessionsMap = new HashMap<>();
    Map capsMap;
    String resolutionSize;
    private String buildDate = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm a").format(Calendar.getInstance().getTime());
    SauceController sauceController = new SauceController(buildDate); // this one needed for suite setup
    private ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    private ThreadLocal<AppiumDriver> localDriverThreadLocal = new ThreadLocal<>();
    private ThreadLocal<String> nameTest = new ThreadLocal<>();
    private ThreadLocal<String> nameSuite = new ThreadLocal<>();
    private ThreadLocal<SauceController> sauceControllerThreadLocal = new ThreadLocal<>();
    private ThreadLocal<LocalController> localControllerThreadLocal = new ThreadLocal<>();
    //TestObjectController testobjectController = new TestObjectController(buildDate);
    private ThreadLocal<TestObjectController> testObjectControllerThreadLocal = new ThreadLocal<>();

    /**
     * Based on the environment selection setupDriver will create an instance of the respective driver.
     * Configuration for the SauceLabs and TestObject can be done manually in the saucelabsSupport package or by setting system properties.
     *
     * @param testMethod
     * @throws MalformedURLException
     */
    private void setupDriver(Method testMethod) throws MalformedURLException {
        sauceControllerThreadLocal.set(new SauceController(buildDate));
        testObjectControllerThreadLocal.set(new TestObjectController(buildDate));
        localControllerThreadLocal.set(new LocalController());
        nameTest.set(testMethod.getName());
        nameSuite.set(getClass().getSimpleName());
        switch (executionOS) {
            case LocalAndroid:
                driver.set(localControllerThreadLocal.get().getAndroidDriver());
                break;
            case LocalIOS:
                driver.set(localControllerThreadLocal.get().getIOSDriver());
                break;
            case SaucelabIOS:
                driver.set(sauceControllerThreadLocal.get().getIOSDriver(nameTest.get(), nameSuite.get()));
                break;
            case TestobjectIOS:
                driver.set(testObjectControllerThreadLocal.get().getIOSDriver(nameTest.get(), nameSuite.get()));
                break;
            case SauceAndroid:
                driver.set(sauceControllerThreadLocal.get().getAndroidDriver(nameTest.get(), nameSuite.get()));
                break;
            case TestobjectAndroid:
                driver.set(testObjectControllerThreadLocal.get().getAndroidDriver(nameTest.get(), nameSuite.get()));
                break;
        }

        getLastDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        /**
         * capsMap is used to put informations in the html test report
         */
        capsMap = getLastDriver().getCapabilities().asMap();
        /**
         * sessionId is used to update job information in the SauceLabs
         */
        String id = getLastDriver().getSessionId().toString();
        sessionId.set(id);
    }

    @BeforeMethod
    public void loadDriver(Method testMethod) throws MalformedURLException {
        this.setupDriver(testMethod);
        /**
         * Fork driver instance so that particular tests won't try to execute on their neighbours.
         * This variable holds driver instance for each particular test, in separated threads
         */
        localDriverThreadLocal.set(getLastDriver());

    }

    @AfterMethod
    public void closeDriver() {
        // in order to keep tests atomic, stop the driver after each test method
        resolutionSize = driver().manage().window().getSize().toString();
        driver().quit();
    }

    AppiumDriver getLastDriver() {
        return driver.get();
    }

    /**
     * To make driver calls easier in the test methods, just use diver()
     *
     * @return driver for the current thread
     */
    public AppiumDriver driver() {
        return localDriverThreadLocal.get();
    }

    /**
     * @return the Sauce Job id for the current thread
     */
    public String getSessionId() {
        return sessionId.get();
    }


}