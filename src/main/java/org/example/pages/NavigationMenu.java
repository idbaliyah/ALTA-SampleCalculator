package org.example.pages;

import io.appium.java_client.MobileBy;
import org.example.base.BasePageObject;

public class NavigationMenu extends BasePageObject {

    public NavigationMenu clickHamburgerButton() {
        click(MobileBy.AccessibilityId("Open navigation drawer"));
        return this;
    }

    public NavigationMenu clickListMenu() {
        click(MobileBy.id("nav_list"));
        return this;
    }

    public NavigationMenu clickCalculatorMenu() {
        click(MobileBy.id("nav_calculator"));
        return this;
    }
}
