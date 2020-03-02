package testingEnvironments.saucelabs;

public class SauceCredentialsManager {
    private String id;
    private String authKey;

    public SauceCredentialsManager(String id, String authKey) {
        this.id = id;
        this.authKey = authKey;
    }

    public String getId() {
        return id;
    }

    public String getAuthKey() {
        return authKey;
    }

    public SauceStorageHandler getStorageHandler() {
        return new SauceStorageHandler(id, authKey);
    }

    public String getConnectionUrl() {
        if (authKey.contains(" ") || id.contains(" ")) {
            System.out.println("SauceCredentialManager: Warning! Probably incorrect credentials!");
        }
        return "http://" + id + ":" + authKey + "@ondemand.eu-central-1.saucelabs.com:80/wd/hub";
    }

    public String getProxyConnectionUrl() {
        return "http://" + id + ":" + authKey + "@localhost:4445/wd/hub";
    }
}
