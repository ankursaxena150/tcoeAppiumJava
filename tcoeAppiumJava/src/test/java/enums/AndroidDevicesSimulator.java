package enums;

public enum AndroidDevicesSimulator {

    // Example simulator devices - put your own AVD simulators below
    NEXUS_5X_ANDROID_V10_0("Nexus_5X_API_29_x86", "portrait", "10.0", "UiAutomator2"),
    PIXEL_2_XL_ANDROID_V7_0("Pixel 2 XL", "landscape", "7.0", "UiAutomator2");

    private String deviceName;
    private String deviceOrientation;
    private String platformVersion;
    private String automationName;

    private AndroidDevicesSimulator(String deviceName, String deviceOrientation, String platformVersion, String automationName) {
        this.deviceName = deviceName;
        this.deviceOrientation = deviceOrientation;
        this.platformVersion = platformVersion;
        this.automationName = automationName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getDeviceOrientation() {
        return deviceOrientation;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public String getAutomationName() {
        return automationName;
    }

}
