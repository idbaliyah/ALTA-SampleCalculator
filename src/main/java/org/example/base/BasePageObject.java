package org.example.base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.example.driver.AndroidDriverInit;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;

public class BasePageObject {

    public AndroidDriver<AndroidElement> getDriver(){
        return AndroidDriverInit.driver;
    }

    public AndroidElement find(By by){
        return getDriver().findElement(by);
    }

    public void type(By by, String text){
        AndroidElement element = find(by);
        element.clear();
        element.sendKeys(text);
    }

    public void click(By by){
        find(by).click();
    }

    public String getText(By by){
        return find(by).getText();
    }

    public List<AndroidElement> findElements(By locator){
        return getDriver().findElements(locator);
    }

    TouchAction touchAction;
    public TouchAction getTouchAction(){
        touchAction = new TouchAction(getDriver());
        return touchAction;
    }

    public void longPress(AndroidElement elementToPress) {
        getTouchAction().longPress(PointOption.point(elementToPress.getCenter()))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .release()
                .perform();
    }

    public void multipleTimes(AndroidElement elementToTap){
        getTouchAction().tap(TapOptions.tapOptions().withTapsCount(5)
                        .withElement(ElementOption.element(elementToTap)))
                .perform();
    }

}
