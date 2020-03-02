package pageObjects.iOSPages;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.support.*;
import pageObjects.*;

/**
 * Created by Thomas on 2016-06-15.
 */
public class ContactSearchPageIOS extends BasePageIOS implements ContactSearchPage {

    @FindBy(id = "Search for contact")
    public MobileElement searchFieldDefault;
    @FindBy(name = "Search for contact")
    public MobileElement searchFieldHighlighted;
    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"Search results\"]/XCUIElementTypeCell/XCUIElementTypeStaticText")
    public MobileElement firstSearchResultName;
    @FindBy(id = "main_text")
    public MobileElement searchResultText;

    public ContactSearchPageIOS(AppiumDriver driver) {
        super(driver);
    }

    public void search(String name) {
        searchFieldDefault.clear();
        searchFieldDefault.click();
        searchFieldHighlighted.sendKeys(name);
    }

    public MobileElement getFirstSearchResult() {

        return firstSearchResultName;
    }

    public String getSearchResultText() {
        return searchResultText.getText();
        // No contacts found with "dupa" in the name
    }
}
