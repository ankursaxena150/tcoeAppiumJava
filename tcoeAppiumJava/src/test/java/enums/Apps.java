package enums;

public enum Apps {


    APP_ANDROID("Contacts.apk", "com.jayway.contacts", "com.jayway.contacts.MainActivity"),
    APP_IOS("ContactsSimulator.app");

    private String key;
    private String appPackage;
    private String appActivity;

    private Apps(String key){
        this.key = key;
        this.appPackage = "blank";
        this.appActivity = "blank";
    }

    private Apps(String key, String appPackage, String appActivity) {
        this.key = key;
        this.appPackage = appPackage;
        this.appActivity = appActivity;
    }

    @Override
    public String toString() {
        return key;
    }

    public String getAppPackage(){
        return appPackage;
    }

    public String getAppActivity(){
        return appActivity;
    }

    public String getAppName(){
        return this.toString();
    }
}
