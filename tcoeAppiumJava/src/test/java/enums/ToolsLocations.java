package enums;

public enum ToolsLocations {

    // Environment variable ANDROID_HOME will be used.
    // If ANDROID_HOME is not set, the default value will be used - remember to put your Android SDK path below.
    ANDROID_SDK_PATH(System.getProperty(System.getenv("ANDROID_HOME"), "C:\\Users\\A319091\\AppData\\Local\\Android\\Sdk\\"));

    private String value;

    private ToolsLocations(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
