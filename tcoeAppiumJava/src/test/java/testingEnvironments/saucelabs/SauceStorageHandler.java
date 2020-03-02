package testingEnvironments.saucelabs;

import java.io.File;

/**
 * SauceStorageHandler is using RestClient for posting files to sauce storage
 * Content list of storage can be fetched with getFiles method.
 */
public class SauceStorageHandler {


    private static final String SAUCELAB_STORAGE_API = "https://eu-central-1.saucelabs.com/rest/v1/storage/";
    private static final String TAG = "#SauceStorageHandler: ";
    private final String username;
    private final String authKey;
    private final RestClient restClient = new RestClient();
    private boolean override = true;

    public SauceStorageHandler(String username, String authKey) {
        this.username = username;
        this.authKey = authKey;
    }

    /**
     * Returns json string of the sauce storage content description
     *
     * @return
     */
    public String getFiles() {
        String result;
        String getUrl = buildGetFilesUrl(username);
        result = restClient.getWithBasicAuth(getUrl, username, authKey);
        return result;
    }

    /**
     * Posts file to the sauce storage and returns response code
     *
     * @param filename
     * @param file
     * @return
     */
    public int uploadFile(String filename, File file) {
        int result;
        String postUrl = buildPostFileUrl(username, filename);
        result = restClient.postFileWithBasicAuth(postUrl, username, authKey, file, filename);
        return result;
    }

    /**
     * You can set to override files on upload. True by default.
     *
     * @param override
     */
    public void overrideFilesOnUpload(Boolean override) {
        this.override = override;
    }

    /**
     * Returns string of url used for pushing the file.
     *
     * @param username
     * @param filename
     * @return
     */
    private String buildPostFileUrl(String username, String filename) {
        return SAUCELAB_STORAGE_API + username + "/" + filename + "?overwrite=" + String.valueOf(override);
    }


    /**
     * Returns string of url used to get sauce storage content description
     *
     * @param username
     * @return
     */
    private String buildGetFilesUrl(String username) {
        return SAUCELAB_STORAGE_API + username;
    }


}
