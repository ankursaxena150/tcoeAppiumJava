package components.reporting;

import org.apache.log4j.*;

/**
 * This class contains common methods used for logging test execution using log4j logger
 *
 * @author a083259
 */
public class TestLog {

    static Logger log = Logger.getLogger(TestLog.class.getName());

    public void logStartTestExecution(String testCaseName) {
        log.info(">>>>>>>>>>>>>>>>>>>>>");
        log.info("tests " + testCaseName + " started");
        log.info(">>>>>>>>>>>>>>>>>>>>>");
    }

    public void logEndTestExecution(String testCaseName, int status) {
        switch (status) {
            case 1:
                log.info("tests " + testCaseName + " finished --> PASSED");
                break;
            case 2:
                log.info("Screenshot has been taken and saved in " + "TEST-SCREEN folder");
                log.error("tests " + testCaseName + " finished --> FAILED");
                break;
            case 3:
                log.info("tests " + testCaseName + " finished --> SKIPPED");
                break;
            default:
                log.info("tests " + testCaseName + " finished --> RESULT UNKNOWN");
                break;
        }
        log.info("Tests environment: ");
        //log.info("Browser: "+driver.getCapabilities().getBrowserName()+" ver."+driver.getCapabilities().getVersion())
        //log.info("OS:"+driver.caps["platform"])
        //log.info("Url in the End of Tests: "+driver.getCurrentUrl())
        log.info("<<<<<<<<<<<<<<<<<<<<<");
    }

    public void logStartTestClassExecution(String testClassName) {
        log.info("-------------------------------------------------------");
        log.info("Execution of tests from " + testClassName + " class started");
        log.info("-------------------------------------------------------");
    }

    public void logEndTestClassExecution(String testClassName) {
        log.info("-------------------------------------------------------");
        log.info("Execution of tests from " + testClassName + " class finished");
        log.info("-------------------------------------------------------");
    }

    public void info(String message) {
        log.info(message);
    }

    public void warn(String message) {
        log.warn(message);
    }

    public void error(String message) {
        log.error(message);
    }

    public void fatal(String message) {
        log.fatal(message);
    }

    public void debug(String message) {
        log.debug(message);
    }
}
