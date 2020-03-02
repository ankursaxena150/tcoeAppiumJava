package components.reporting;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.*;
import com.aventstack.extentreports.reporter.configuration.*;
import java.io.*;
import java.util.*;
import org.apache.commons.io.*;
import org.openqa.selenium.*;

public class ExtentManager {

    static Map<Integer, ExtentTest> extentTestMap = new HashMap<Integer, ExtentTest>();
    static String Path = "./target/TestLogReport.html";
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (null == extent)
            createInstance(Path);
        return extent;
    }

    private static ExtentReports createInstance(String fileName) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle(fileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("TCoE Appium Framework Tests Report");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        return extent;
    }

    public static String CaptureScreen(WebDriver driver, String ImagesPath) {
        TakesScreenshot oScn = (TakesScreenshot) driver;
        File oScnShot = oScn.getScreenshotAs(OutputType.FILE);
        File oDest = new File(ImagesPath + ".jpg");
        try {
            FileUtils.copyFile(oScnShot, oDest);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException exc) {
            System.out.println(exc.getMessage());
        }
        return ImagesPath + ".jpg";
    }
}