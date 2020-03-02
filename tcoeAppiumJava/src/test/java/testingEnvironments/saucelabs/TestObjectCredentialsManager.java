package testingEnvironments.saucelabs;

public class TestObjectCredentialsManager {
    private String id;
    private String authKey;

    public TestObjectCredentialsManager(String id, String authKey) {
        this.id = id;
        this.authKey = authKey;
    }

    public String getId() {
        return id;
    }

    public String getAuthKey() {
        return authKey;
    }

    public TestObjectStorageHandler getStorageHandler() {
        return new TestObjectStorageHandler(id, authKey);
    }

    // if you are not from europe, change this url to the one which is more suitable
    public String getConnectionUrl() {
        if (authKey.contains(" ") || id.contains(" ")) {
            System.out.println("TestObjectCredentialManager: Warning! Probably incorrect credentials!");
        }
        return "https://eu1.appium.testobject.com/wd/hub";
    }


}
