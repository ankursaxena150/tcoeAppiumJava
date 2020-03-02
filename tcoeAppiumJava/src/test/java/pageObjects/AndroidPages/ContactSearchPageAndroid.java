package pageObjects.AndroidPages;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.support.*;
import pageObjects.*;

/**
 * Created by Thomas on 2016-06-15.
 */
public class ContactSearchPageAndroid extends BasePageAndroid implements ContactSearchPage {

    @FindBy(id = "main_search")
    public MobileElement searchField;

    @FindBy(id = "name")
    public MobileElement firstSearchResultName;

    @FindBy(id = "main_text")
    public MobileElement searchResultText;


    public ContactSearchPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void search(String name) {
        searchField.sendKeys(name);
    }

    public MobileElement getFirstSearchResult() {
        return firstSearchResultName;
    }

    public String getSearchResultText() {
        return searchResultText.getText();
    }
}
