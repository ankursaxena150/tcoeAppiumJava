package enums;

public enum IOSDevicesTestObject {

    IPAD_2_REAL("iPad_2_real", "1.9.1", "1.9.1");

    private String deviceName;
    private String frameworkVersion;
    private String appiumVersion;

    private IOSDevicesTestObject(String deviceName, String frameworkVersion, String appiumVersion) {
        this.deviceName = deviceName;
        this.frameworkVersion = frameworkVersion;
        this.appiumVersion = appiumVersion;
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
}
