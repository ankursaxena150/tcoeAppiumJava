package pageObjects;

import io.appium.java_client.*;

/**
 * Created by Thomas on 2016-06-15.
 */
public interface ContactSearchPage {

    public void search(String name);

    public String getSearchResultText();

    public MobileElement getFirstSearchResult();
}
