package testingEnvironments.saucelabs;

import components.testbase.TestBaseAppium;
import components.testbase.TestBaseEyes;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class SauceListener extends TestBaseEyes implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(
                "SauceListener<onTestStart> injected into session id: " + TestBaseAppium.sessionsMap.get(getTestMethodName(result))
                + " of method " + getTestMethodName(result)
                + " at thread " + Thread.currentThread().getId());

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("SauceListener<onFinish> List of jobs run in this suite:");
        System.out.println(TestBaseAppium.sessionsMap);
        System.out.println(Arrays.toString(TestBaseAppium.sessionsMap.entrySet().toArray()));
    }

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
}
