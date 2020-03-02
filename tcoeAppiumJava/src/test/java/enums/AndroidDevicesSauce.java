package enums;

public enum AndroidDevicesSauce {

    PIXEL_2_XL_ANDROID_V7_0("Pixel 2 XL", "landscape", "7.0", "1.13.0", "VolvoGroupIT", "eu"),
    SAMSUNG_GALAXY_S9_ANDROID_V9_0("Samsung Galaxy S9 HD GoogleAPI Emulator", "landscape", "9.0", "1.13.0", "VolvoGroupIT", "eu"),
    COMMON_DEVICE_ANDROID_V5_1("Android Emulator", "portrait", "5.1", "1.13.0", "VolvoGroupIT", "eu");

    private String deviceName;
    private String deviceOrientation;
    private String platformVersion;
    private String appiumVersion;
    private String parentTunnel;
    private String tunnelIdentifier;

    private AndroidDevicesSauce(String deviceName, String deviceOrientation, String platformVersion, String appiumVersion, String parentTunnel, String tunnelIdentifier){
        this.deviceName = deviceName;
        this.deviceOrientation = deviceOrientation;
        this.platformVersion = platformVersion;
        this.appiumVersion = appiumVersion;
        this.parentTunnel = parentTunnel;
        this.tunnelIdentifier = tunnelIdentifier;
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

    public String getAppiumVersion() {
        return appiumVersion;
    }

    public String getParentTunnel() {
        return parentTunnel;
    }

    public String getTunnelIdentifier() {
        return tunnelIdentifier;
    }

}
