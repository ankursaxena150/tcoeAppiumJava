package components.testbase;

import java.lang.reflect.*;
import org.testng.annotations.*;
import org.testobject.appium.*;
import org.testobject.appium.testng.*;

@Listeners({ TestObjectTestNGTestResultWatcher.class })
public class TestBaseTestObject extends TestBaseEyes implements TestObjectWatcherProvider {

    // testObject reporting
    private TestObjectListenerProvider provider = TestObjectListenerProvider.newInstance();

    @BeforeMethod
    public void setupTestObjectJob(Method testMethod) {
        // This code is responsible for syncing results with Testobject
        /* IMPORTANT! We need to provide the Watcher with our initialized AppiumDriver */

        if (executionOS == OS.TestobjectIOS || executionOS == OS.TestobjectAndroid) {
            provider.setDriver(getLastDriver());
        }
    }

    @AfterMethod
    public void updateTestObjectJob(){
        if (executionOS == OS.TestobjectIOS || executionOS == OS.TestobjectAndroid) {

            // TestObject requires to quit driver after method
            provider.getAppiumDriver().quit();
        }
    }

    public TestObjectListenerProvider getProvider() {
        return provider;
    }
}
