package pageObjects.iOSPages;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.support.*;
import pageObjects.*;

/**
 * Created by Thomas on 2016-06-15.
 */
public class ContactDetailPageIOS extends BasePageIOS implements ContactDetailPage {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Contacts\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
    public MobileElement contactName;

    @FindBy(id = "email")
    public MobileElement contactEmail;

    public ContactDetailPageIOS(AppiumDriver driver) {
        super(driver);
    }

    public String getContactName() {
        return contactName.getText();
    }

    @Override
    public String getContactEmail() {
        return contactEmail.getText();
    }
}
