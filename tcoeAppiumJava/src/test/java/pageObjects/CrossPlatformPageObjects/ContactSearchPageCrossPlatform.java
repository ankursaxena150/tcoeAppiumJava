package pageObjects.CrossPlatformPageObjects;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.support.*;

public class ContactSearchPageCrossPlatform {

    @AndroidFindBy(id = "main_search")
    @iOSFindBy(id = "Search for contact")
    private MobileElement searchField;

    @AndroidFindBy(id = "name")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"Search results\"]/XCUIElementTypeCell/XCUIElementTypeStaticText")
    private MobileElement firstSearchResultName;
    
    @AndroidFindBy(id = "main_text")
    @iOSFindBy(id = "No Results")
    private MobileElement searchResultText;

    public ContactSearchPageCrossPlatform(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void search(String name) {
        searchField.click();
        searchField.clear();
        searchField.sendKeys(name);
    }

    public MobileElement getSearchEmptyResult() {
        return searchResultText;
    }

    public MobileElement getFirstSearchResult() {
        return firstSearchResultName;
    }
}
