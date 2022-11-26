package org.example.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.example.properties.PropertiesReader;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInit {

    public static AndroidDriver<AndroidElement> driver;

    public static void initialize() {
        DesiredCapabilities caps = new DesiredCapabilities();
        PropertiesReader reader = new PropertiesReader();
        HashMap<String,String> data = reader.readProperties().getAppiumProperties();
        data.forEach(caps::setCapability);

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability(MobileCapabilityType.APP, "D:\\Learn QA Engineer\\Mobile Automation Testing\\sample-apk.apk");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");

        String url = "http://localhost:4723/wd/hub";
        try {
            driver = new AndroidDriver<>(new URL(url), caps);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void quit() {
        driver.quit();
    }

}
