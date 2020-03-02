package enums;

public enum IOSDevicesSimulator {

    // Example simulator devices - put your own IOS simulators below
    IPHONE_11_PRO_IOS_V13_1("iPhone 11 Pro", "portrait", "13.1", "XCUITest"),
    IPAD_AIR_IOS_V12_2("iPad Air Simulator", "portrait", "12.2", "XCUITest"),
    IPAD_AIR_IOS_V13_1("iPad Air (3rd generation)", "portrait", "13.1", "XCUITest"),
    IPHONE_7_IOS_11_3("iPhone 7","portrait", "11.3", "XCUITest");

    private String deviceName;
    private String deviceOrientation;
    private String platformVersion;
    private String automationName;

    private IOSDevicesSimulator(String deviceName, String deviceOrientation, String platformVersion, String automationName) {
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
