package components.testbase;

import com.applitools.eyes.*;
import enums.*;
import java.io.*;
import java.lang.reflect.*;
import org.testng.*;
import org.testng.annotations.*;


/**
 * Maciej Szwarc 2018
 * Visual testing
 * This class has to be rewritten in order to work with parallel testing.
 * Probably will be merged with TestBaseAppium class.
 */

/**
 *
 * TestBaseEyes WILL BE DELETED SOON
 * another tool will be used
 *
 */
public class TestBaseEyes extends TestBaseSauceLab {

    // visual testing
    private Eyes eyes = new Eyes();
    private EyesMode eyesMode = EyesMode.OFF;


    @BeforeClass
    public void setupClassEyes() {
        if (eyesMode.equals(EyesMode.ON)) {
            eyes.setProxy(new ProxySettings("http://" + proxyAddress + ":8080"));
            // This is your api key, make sure you use it in all your tests.
            eyes.setApiKey("eyes api key here");
            eyes.setForceFullPageScreenshot(true);
            eyes.setStitchMode(StitchMode.CSS);//if your page has a ribbon/menu which
            eyes.setHideScrollbars(true);//to hide scrollbar during taking the screenshot
            eyes.setMatchLevel(MatchLevel.LAYOUT2);//for dynamic pages
            eyes.setBaselineEnvName("TCoEVisualTests");
        }
    }


    @BeforeMethod
    public void setupMethodEyes(Method testMethod) {
        if (eyesMode.equals(EyesMode.ON)) {
            //driver = ((WebDriver) (eyes.invokeMethod("open", new Object[]{driver, "TCoE example", testMethod.getName(), new RectangleSize(800, 600)})));
        }
    }

    @AfterMethod
    public void afterMethodEeyes(ITestResult result, Method testMethod) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {


        }

        if (eyesMode == EyesMode.ON) {
            try {
                // End visual testing. Validate visual correctness.
                eyes.close();
            } finally {
                // Abort test in case of an unexpected error.
                eyes.abortIfNotClosed();
            }
        }
    }

}
