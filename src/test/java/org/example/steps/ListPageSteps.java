package org.example.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BaseTest;

public class ListPageSteps extends BaseTest {

    @When("user click navigation menu and click list menu")
    public void userClickNavigationMenuAndClickListMenu() {
        navigationMenu.clickHamburgerButton()
                .clickListMenu();
    }

    @Then("user doing long press on list menu")
    public void userDoingLongPressOnListMenu() {listPage.longPressListMenu();}

    @Then("user doing multiple times on list menu")
    public void userDoingMultipleTimesOnListMenu() {
        listPage.multipleTimesListMenu();
    }

}
