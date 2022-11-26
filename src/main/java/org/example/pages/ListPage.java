package org.example.pages;

import io.appium.java_client.MobileBy;
import org.example.base.BasePageObject;

public class ListPage extends BasePageObject {
    public void longPressListMenu(){
        longPress(findElements(MobileBy.id("text_view")).get(4));
    }
    public void multipleTimesListMenu(){
        multipleTimes(findElements(MobileBy.id("text_view")).get(1));
    }
}
