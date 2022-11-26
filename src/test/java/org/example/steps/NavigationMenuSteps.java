package org.example.steps;

import io.cucumber.java.en.When;
import org.example.BaseTest;

public class NavigationMenuSteps extends BaseTest {
    @When("user click navigation menu")
    public void userClickNavigationMenu() {
        navigationMenu.clickHamburgerButton()
                .clickListMenu()
                .clickHamburgerButton()
                .clickCalculatorMenu();
    }
}
