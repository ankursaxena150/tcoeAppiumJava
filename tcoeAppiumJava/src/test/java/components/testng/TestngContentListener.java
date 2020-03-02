package components.testng;

import java.util.*;
import org.testng.*;

public class TestngContentListener extends TestListenerAdapter {
    @Override
    public void onFinish(ITestContext context){
        deleteAllMethod(context.getPassedConfigurations().getAllResults().iterator());
        deleteAllMethod(context.getSkippedConfigurations().getAllResults().iterator());
        deleteAllMethod(context.getFailedConfigurations().getAllResults().iterator());
    }
    /*
    This is deleting all configuration methods, which is beforeMethod, beforeTest, after etc.
    Due to the fact that we don't want to have configuration methods in our jira integration.
    */
    public void deleteAllMethod(Iterator<ITestResult> listTestMethods) {
        while (listTestMethods.hasNext()) {
            ITestResult testResult = listTestMethods.next();
            //logger.debug("Deleting from result: {}" + testResult.getMethod().getMethodName());
            listTestMethods.remove();
        }
    }
}
