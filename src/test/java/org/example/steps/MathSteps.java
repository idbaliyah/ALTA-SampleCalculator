package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.BaseTest;
import org.junit.Assert;


public class MathSteps extends BaseTest {
    @Given("user input number1 {int}")
    public void userInputValueA(int number1) { mathPage.inputValue1(number1);
    }

    @And("user input number2 {int}")
    public void userInputValueB(int number2) { mathPage.inputValue2(number2);
    }

    @When("user select operators addition")
    public void userSelectOperatorsAddition() {
        mathPage.clickSpinner()
                .selectAddition();
    }

    @And("user click button equals")
    public void userClickButtonEquals() {
        mathPage.clickEquals();
    }

    @Then("Results showing addition calculations")
    public void resultsShowingAdditionCalculations() {
        Assert.assertEquals(mathPage.validateAdditionResult(), mathPage.getTextResult());
    }

    @When("user select operators subtraction")
    public void userSelectOperatorsSubtraction() {
        mathPage.clickSpinner()
                .selectSubtraction();
    }

    @Then("Results showing subtraction calculations")
    public void resultsShowingSubtractionCalculations() {
        Assert.assertEquals(mathPage.validateSubtractionResult(), mathPage.getTextResult());
    }

    @And("user select operators division")
    public void userSelectOperatorsDivision() {
        mathPage.clickSpinner()
                .selectDivision();
    }

    @Then("Results showing division calculations")
    public void resultsShowingDivisionCalculations() {
        Assert.assertEquals(mathPage.validateDivisionResult(), mathPage.getTextResult());
    }

    @And("user select operators multiplication")
    public void userSelectOperatorsMultiplication() {
        mathPage.clickSpinner()
                .selectMultiplication();
    }

    @Then("Results showing multiplication calculations")
    public void resultsShowingMultiplicationCalculations() {
        Assert.assertEquals(mathPage.validateMultiplicationResult(), mathPage.getTextResult());
    }
}
