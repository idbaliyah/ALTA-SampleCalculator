package org.example.steps;

import io.cucumber.java.en.And;
import org.example.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseTest {

  @Given("user is on login page")
  public void userIsOnLoginPage() {
  }

  @When("user input username {string}")
  public void userInputUsername(String username) {
    loginPage.inputUsername(username);
  }

  @And("user input password {string}")
  public void userInputPassword(String password) {
    loginPage.inputPassword(password);
  }

  @And("user click button login")
  public void userClickButtonLogin() {
    loginPage.clickLoginBtn();
  }

  @Then("user successfully login")
  public void userSuccessfullyLogin() {
  }
}
