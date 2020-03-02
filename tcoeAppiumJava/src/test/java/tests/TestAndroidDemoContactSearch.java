package tests;

import components.testbase.TestBaseEyes;
import components.testng.Retry;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.AndroidPages.ContactDetailPageAndroid;
import pageObjects.AndroidPages.ContactSearchPageAndroid;
import pageObjects.ContactDetailPage;
import pageObjects.ContactSearchPage;
import pageObjects.iOSPages.ContactDetailPageIOS;
import pageObjects.iOSPages.ContactSearchPageIOS;

import java.util.Random;

public class TestAndroidDemoContactSearch extends TestBaseEyes {


    @DataProvider(name = "contacts", parallel = true)
    public static Object[][] contacts() {

        return new Object[][]{
                {"Sara Alston", "eqalston16@yopmail.com"},
                {"Madison Gentile", "dmmadison12@yopmail.com"},
                {"Nadia Patten", "jnnadia13@gmail.com"},
                {"Lynn Chandler", "clchandler11@outlook.com"},
                {"Lydie Brass", "edlydie3@yahoo.com"},
                {"Yaya Laws", "jmyaya12@google.com"},
                {"Dulcie Moller", "eimoller8@yopmail.com"},
                {"Irma Bolden", "irm@outlook.com"}};
    }

    /**
     * Using the given contact list to verify if contact is present in the list and has correct email address.
     *
     * @param name
     * @param email
     */
    @Test(dataProvider = "contacts", groups = "android")
    public void TestSearchContact(String name, String email) {
        // adding a postfix to the test name in saucelabs
        testNameParameter.set(name + ", " + email);
        // creating instances of page objects
        ContactDetailPage contactDetailPage = new ContactDetailPageAndroid(driver());
        ContactSearchPage contactSearchPage = new ContactSearchPageAndroid(driver());

        //Search for contact
        contactSearchPage.search(name);

        //Verify result
        MobileElement searchResult = contactSearchPage.getFirstSearchResult();
        Assert.assertEquals(searchResult.getText(), name);

        //Navigate to detail page
        searchResult.click();

        //Verify that correct user data is displayed on the detailed page
        Assert.assertEquals(contactDetailPage.getContactName(), name);
        Assert.assertEquals(contactDetailPage.getContactEmail(), email);

    }

    @Test(groups = "ios")
    public void iOSTestSearchContact() {
        //testNameParameter.set(name + ", " + email);
        ContactDetailPage contactDetailPage = new ContactDetailPageIOS(driver());
        ContactSearchPage contactSearchPage = new ContactSearchPageIOS(driver());

        //Search for contact
        contactSearchPage.search("Sara Alston");

        //Verify result
        MobileElement searchResult = contactSearchPage.getFirstSearchResult();
        Assert.assertEquals(searchResult.getText(), "Sara Alston");

        //Navigate to detail page
        searchResult.click();

        //Verify that correct user data is displayed
        Assert.assertEquals(contactDetailPage.getContactName(), "Sara Alston");
        Assert.assertEquals(contactDetailPage.getContactEmail(),"eqalston16@yopmail.com");

    }

    /**
     * Checking if search function gives info about contact not being found.
     */
    @Test(groups = "android")
    public void TestSearchContactThatDoNotExist() {

        ContactSearchPage contactSearchPage = new ContactSearchPageAndroid(driver());
        //Search for contact
        contactSearchPage.search("Donald");

        //Verify result
        Assert.assertEquals(contactSearchPage.getSearchResultText(), "No contacts found with \"Donald\" in the name");
    }

    /**
     * Let's say there is a known connection issue or any other problem that causes test to fail from time to time.
     * If we are not capable to resolve this issue we can use Retry class to make TestNG re-execute test if it fails.
     * If the test fails X times the final result will be marked as failed.
     * As result, we can be assured that the test didn't fail because of some random event (eg. connectivity issue, database response timeout)
     */
    @Test(retryAnalyzer = Retry.class, groups = "android")
    public void TestSearchContactUnstable() {
        String[] names = {"Madison", "Mango", "Peach"};

        ContactDetailPage contactDetailPage = new ContactDetailPageAndroid(driver());
        ContactSearchPage contactSearchPage = new ContactSearchPageAndroid(driver());

        // picking a random name for testing retry option
        int idx = new Random().nextInt(names.length);
        String random = (names[idx]);

        //Search for contact
        contactSearchPage.search(random);

        //Verify result
        MobileElement searchResult = contactSearchPage.getFirstSearchResult();
        Assert.assertEquals("Madison Gentile", searchResult.getText());

        //Navigate to detail page
        searchResult.click();

        //Verify that correct page is displayed
        Assert.assertEquals("Madison Gentile", contactDetailPage.getContactName());
        Assert.assertEquals("dmmadison12@yopmail.com", ((ContactDetailPageAndroid) contactDetailPage).getContactEmail());
    }

}
