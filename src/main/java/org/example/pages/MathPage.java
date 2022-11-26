package org.example.pages;

import io.appium.java_client.MobileBy;
import org.example.base.BasePageObject;

public class MathPage extends BasePageObject {

    int number1, number2;
    public void inputValue1(int valueA) {
        type(MobileBy.id("et_1"),String.valueOf(valueA));
        number1 = valueA;
    }

    public void inputValue2(int valueB) {
        type(MobileBy.id("et_2"), String.valueOf(valueB));
        number2 = valueB;
    }

    public MathPage clickSpinner() {
        click(MobileBy.id("spinner_1"));
        return this;
    }

    public MathPage selectAddition() {
        click(MobileBy.xpath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"));
        return this;
    }

    public void selectSubtraction() {
        click(MobileBy.xpath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
    }

    public void selectDivision() {
        click(MobileBy.xpath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]"));
    }

    public void selectMultiplication() {
        click(MobileBy.xpath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]"));
    }

    public void clickEquals() {
        click(MobileBy.id("acb_calculate"));
    }

    public String getTextResult() {
        return getText(MobileBy.id("tv_result"));
    }

    public String validateAdditionResult() {
        int resultAddition = number1 + number2;
        String equalsAddition = "Hasil : " + resultAddition;
        return equalsAddition;
    }

    public String validateSubtractionResult() {
        int resultSubtraction = number1 - number2;
        String equalsSubtraction = "Hasil : " + resultSubtraction;
        return equalsSubtraction;
    }

    public String validateDivisionResult() {
        int resultDivision = number1 / number2;
        String equalsDivision = "Hasil : " + resultDivision;
        return equalsDivision;
    }

    public String validateMultiplicationResult() {
        int resultMultiplication = number1 * number2;
        String equalsMultiplication = "Hasil : " + resultMultiplication;
        return equalsMultiplication;
    }
}
