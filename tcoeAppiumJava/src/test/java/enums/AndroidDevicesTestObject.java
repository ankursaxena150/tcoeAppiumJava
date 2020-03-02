package enums;

public enum AndroidDevicesTestObject {

    SAMSUNG_GALAXY_NOTE_8_REAL("Samsung_Galaxy_Note8_real", "1.9.1", "1.9.1", "7.1.1");

    private String deviceName;
    private String frameworkVersion;
    private String appiumVersion;
    private String platformVersion;

    private AndroidDevicesTestObject(String deviceName, String frameworkVersion, String appiumVersion, String platformVersion) {
        this.deviceName = deviceName;
        this.frameworkVersion = frameworkVersion;
        this.appiumVersion = appiumVersion;
        this.platformVersion = platformVersion;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getFrameworkVersion() {
        return frameworkVersion;
    }

    public String getAppiumVersion() {
        return appiumVersion;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

}
