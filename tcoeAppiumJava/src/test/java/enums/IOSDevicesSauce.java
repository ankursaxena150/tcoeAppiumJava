package enums;

public enum IOSDevicesSauce {

    IPAD_AIR_IOS12_2("iPad Air Simulator", "portrait", "12.2", "1.13.0", "VolvoGroupIT", "eu"),
    IPHONE_11_PRO_IOS13_0("iPhone 11 Pro Simulator", "portrait", "13.0", "1.15.0", "VolvoGroupIT", "eu"),
    IPHONE_XS_IOS12_0("iPhone XS Simulator", "portrait", "12.0", "1.9.1", "VolvoGroupIT", "eu"),
    IPHONE_7_IOS11_3("iPhone 7 Simulator", "portrait", "11.3", "1.9.1", "VolvoGroupIT", "eu"),
    IPAD_PRO_IOS10_3("iPad Pro (9.7 inch) Simulator", "portrait", "10.3", "1.9.1", "VolvoGroupIT", "eu");


    private String deviceName;
    private String deviceOrientation;
    private String platformVersion;
    private String appiumVersion;
    private String parentTunnel;
    private String tunnelIdentifier;

    private IOSDevicesSauce(String deviceName, String deviceOrientation, String platformVersion, String appiumVersion, String parentTunnel, String tunnelIdentifier){
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