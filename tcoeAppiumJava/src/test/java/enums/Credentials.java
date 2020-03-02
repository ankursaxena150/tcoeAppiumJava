package enums;

public enum Credentials {

    SAUCE_ID(System.getProperty( "SauceUser,",System.getenv("SAUCE_USER"))),
    SAUCE_KEY(System.getProperty("SauceKey",System.getenv("SAUCE_KEY"))),
    TESTOBJECT_ID( System.getProperty("TestobjectUser", System.getenv("TestObjectUser"))),
    TESTOBJECT_KEY( System.getProperty("TestobjectKey", System.getenv("TestObjectKey"))),
    VCN_ID(System.getenv("PROXY_USERID")),
    VCN_KEY( System.getenv("PROXY_VCNPASS"));


    private String key;

    private Credentials(String key)
    {
        this.key = key;
    }



    @Override
    public String toString() {
        return key;
    }
}
