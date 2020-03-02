package tests;

import components.dataproviders.ExcelDataProvider;
import components.dataproviders.TestDataProvider;
import components.reporting.xray.Xray;
import components.testbase.TestBaseEyes;
import components.testng.Retry;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CrossPlatformPageObjects.ContactDetailsPageCrossPlatform;
import pageObjects.CrossPlatformPageObjects.ContactSearchPageCrossPlatform;

import java.util.Random;

public class TestContactCrossPlatformTest extends TestBaseEyes {

    /**
     * Using the given contact list to verify if contact is present in the list and has correct email address.
     *
     * @param name
     * @param email
     */
    @ExcelDataProvider(fileName = "TestContactCrossPlatformTest.xlsx", tab = "TestSearchContact")
    @Xray(test = "ATHOS-79")
    @Test(groups = "smoke", dataProvider = "getExcelDataFromFile", dataProviderClass = TestDataProvider.class)
    public void TestSearchContact(String name, String email) {
        // adding a postfix to the test name in saucelabs
        testNameParameter.set(name + ", " + email);
        // creating instances of page objects
        ContactSearchPageCrossPlatform contactSearchPage = new ContactSearchPageCrossPlatform(driver());
        ContactDetailsPageCrossPlatform contactDetailPage = new ContactDetailsPageCrossPlatform(driver());

        // Search for the contact
        contactSearchPage.search(name);

        // Verify result of the previous step
        MobileElement searchResult = contactSearchPage.getFirstSearchResult();
        Assert.assertEquals(searchResult.getText(), name);

        // Navigate to detail page
        searchResult.click();

        // Verify that correct user data is displayed on the detailed page
        Assert.assertEquals(contactDetailPage.getContactName(), name);
        Assert.assertEquals(contactDetailPage.getContactEmail(), email);
    }

    /**
     * Checking if search function gives info about contact not being found.
     */
    @Test()
    public void TestSearchContactThatDoNotExist() {

        ContactSearchPageCrossPlatform contactSearchPage = new ContactSearchPageCrossPlatform(driver());
        // Search for contact, contact should not be found
        contactSearchPage.search("Donald");

        // Verify result
        Assert.assertTrue(contactSearchPage.getSearchEmptyResult().isDisplayed());
        // there is an additional step we can check on the android version of the app. It will display a message.
        if (executionOS == OS.SauceAndroid) {
            Assert.assertEquals(contactSearchPage.getSearchEmptyResult().getText(), "No contacts found with \"Donald\" in the name");
        }


    }

    /**
     * Let's say there is a known connection issue or any other problem that causes test to fail from time to time.
     * If we are not capable to resolve this issue we can use Retry class to make TestNG re-execute test if it fails.
     * If the test fails X times the final result will be marked as failed.
     * As result, we can be assured that the test didn't fail because of some random event (eg. connectivity issue, database response timeout)
     */
    @Test(retryAnalyzer = Retry.class)
    public void TestSearchContactUnstable() {
        String[] names = {"Madison", "Mango", "Peach"};

        ContactSearchPageCrossPlatform contactSearchPage = new ContactSearchPageCrossPlatform(driver());
        ContactDetailsPageCrossPlatform contactDetailPage = new ContactDetailsPageCrossPlatform(driver());

        // Picking a random name for testing retry option
        // This will simulate random event that makes our test fail
        int idx = new Random().nextInt(names.length);
        String random = (names[idx]);

        // Search for the contact
        contactSearchPage.search(random);

        // Verify result
        MobileElement searchResult = contactSearchPage.getFirstSearchResult();
        Assert.assertEquals("Madison Gentile", searchResult.getText());

        // Navigate to detail page
        searchResult.click();

        // Verify that correct information is given
        Assert.assertEquals("Madison Gentile", contactDetailPage.getContactName());
        Assert.assertEquals("dmmadison12@yopmail.com", contactDetailPage.getContactEmail());
    }
}
