package components.reporting.xray;

import components.testbase.*;
import org.testng.*;

/**
 * The listener interface for receiving Xray events.
 * The Listener can be automatically invoked when TestNG tests are run by using ServiceLoader mechanism.
 * You can also add this listener to a TestNG Test class by adding
 * <code>@Listeners({com.xpand.java.XrayAnnotationListener.class})</code>
 * before the test class
 *
 * @see Xray
 */
public class XrayListener extends TestBase implements IInvokedMethodListener, ITestListener {

    boolean testSuccess = true;


    /* (non-Javadoc)
     * @see org.testng.IInvokedMethodListener#beforeInvocation(org.testng.IInvokedMethod, org.testng.ITestResult)
     */
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if(method.isTestMethod() && annotationPresent(method, Xray.class) ) {
            testResult.setAttribute("requirement", method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(Xray.class).requirement());
            testResult.setAttribute("test", method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(Xray.class).test());
            testResult.setAttribute("labels", method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(Xray.class).labels());
        }
    }


    private boolean annotationPresent(IInvokedMethod method, Class clazz) {
        boolean retVal = method.getTestMethod().getConstructorOrMethod().getMethod().isAnnotationPresent(clazz) ? true : false;
        return retVal;
    }


    /* (non-Javadoc)
     * @see org.testng.IInvokedMethodListener#afterInvocation(org.testng.IInvokedMethod, org.testng.ITestResult)
     */
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if(method.isTestMethod()) {
            if( !testSuccess ) {
                testResult.setStatus(ITestResult.FAILURE);
                testResult.setAttribute("env",System.getProperty("testedEnv"));
                testResult.setAttribute("version",System.getProperty("ActualVersion"));
            }
        }
    }

    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub

    }

}