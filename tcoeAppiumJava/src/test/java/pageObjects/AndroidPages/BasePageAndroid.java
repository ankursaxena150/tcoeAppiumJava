package pageObjects.AndroidPages;

import io.appium.java_client.*;

public class BasePageAndroid {

    public void doubleClick(MobileElement elem1){
        elem1.click();
        elem1.click();

    }
}
