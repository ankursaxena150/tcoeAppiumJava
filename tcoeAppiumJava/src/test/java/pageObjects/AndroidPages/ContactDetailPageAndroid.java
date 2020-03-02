package pageObjects.AndroidPages;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.support.*;
import pageObjects.*;

/**
 * Created by Thomas on 2016-06-15.
 */
public class ContactDetailPageAndroid extends BasePageAndroid implements ContactDetailPage {

    @FindBy(id = "detail_name")
    public MobileElement contactName;

    @FindBy(id = "email")
    public MobileElement contactEmail;

    public ContactDetailPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getContactName() {
        doubleClick(contactName);
        return contactName.getText();
    }

    public String getContactEmail() {
        return contactEmail.getText();
    }

    // dmmadison12@yopmail.com
}
