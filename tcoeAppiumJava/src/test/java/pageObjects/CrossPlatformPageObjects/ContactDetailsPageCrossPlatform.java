package pageObjects.CrossPlatformPageObjects;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.support.*;

public class ContactDetailsPageCrossPlatform {

    /**
     * Respective annotation will be used depending on which application version we are testing. There is no need for a switch.
     */
    @AndroidFindBy(id = "detail_name")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Contacts\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
    public MobileElement contactName;

    @AndroidFindBy(id = "email")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Contacts\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[5]")
    public MobileElement contactEmail;


    /**
     * Initializing Elements of the Page Object class.
     * @param driver
     */
    public ContactDetailsPageCrossPlatform(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getContactName() {
        return contactName.getText();
    }

    public String getContactEmail() {
        return contactEmail.getText();
    }
}
