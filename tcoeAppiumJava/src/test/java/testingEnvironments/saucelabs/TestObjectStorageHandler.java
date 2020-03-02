package testingEnvironments.saucelabs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// unfinished. Not needed atm
public class TestObjectStorageHandler {


    private static final String TESTOBJECT_STORAGE_API = "https://app.testobject.com:443/api/storage/upload";
    private static final String TAG = "#TestObjectStorageHandler: ";
    private final String username;
    private final String authKey;
    private final RestClient restClient = new RestClient();
    List<String> apps = new ArrayList<String>();

    public TestObjectStorageHandler(String username, String authKey) {
        this.username = username;
        this.authKey = authKey;
    }


    public int uploadFile(String filename, File file) {
        int result;
        result = restClient.postFileWithBasicAuth(TESTOBJECT_STORAGE_API, username, authKey, file, filename);
        if (result != 0 && result != 500) {
            apps.add(String.valueOf(result));
        }
        return result;
    }

    public List<String> getApps() {
        return apps;
    }


}
