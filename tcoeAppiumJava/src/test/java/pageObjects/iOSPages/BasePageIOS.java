package pageObjects.iOSPages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BasePageIOS {

    @FindBy(className = "XCUIElementTypeApplication")
    protected MobileElement theApp;

    protected AppiumDriver driver;

    public BasePageIOS(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    }

    public void scrollDown() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> args = new HashMap<String, Object>(){};
        args.put("element", theApp.getId());
        args.put("duration", 1.0);
        args.put("fromX", 200);
        args.put("fromY", 450);
        args.put("toX", 200);
        args.put("toY", 100);
        js.executeScript("mobile: dragFromToForDuration", args);
    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> args = new HashMap<String, Object>(){};
        args.put("element", theApp.getId());
        args.put("duration", 1.0);
        args.put("fromX", 200);
        args.put("fromY", 100);
        args.put("toX", 200);
        args.put("toY", 450);
        js.executeScript("mobile: dragFromToForDuration", args);
    }

    public void scrollToElementByName(String name) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> args = new HashMap<String, Object>(){};
        args.put("element", theApp.getId());
        args.put("name", name);
        js.executeScript("mobile: scroll", args);
    }

    public void scrollToElementByName(String name, MobileElement parentElement) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> args = new HashMap<String, Object>(){};
        args.put("element", parentElement.getId());
        args.put("name", name);
        js.executeScript("mobile: scroll", args);
    }

    protected void click(MobileElement element) {
        click(element, 5);
    }
    protected void click(MobileElement element, int scrollLimit) {
        int scrollCount = 0;
        while(scrollCount < scrollLimit) {
            try {
                new WebDriverWait(driver, 2).until(ExpectedConditions.elementToBeClickable(element));
                element.click();
                break;
            }
            catch (TimeoutException e) {
                scrollDown();
                scrollCount++;
            }
        }
    }

    public void doubleClick(MobileElement element){
        click(element);
        click(element);
    }
}
