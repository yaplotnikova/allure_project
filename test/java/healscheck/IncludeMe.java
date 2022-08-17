package healscheck;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.TheInternetLoginSteps;

public class IncludeMe extends BaseTest {
    @BeforeMethod
    @Override
    public void parentSetUp() {

        super.parentSetUp();
    }

    @Test
    public void mainTest() {
        TheInternetLoginSteps theInternetLoginSteps = new TheInternetLoginSteps();
        parentSetUp();
        theInternetLoginSteps.enterLogin("tomsmith");
        theInternetLoginSteps.enterPassword("SuperSecretPassword!");
        theInternetLoginSteps.successfulLogin();
        theInternetLoginSteps.enterLogin("qweqweqwe");
        theInternetLoginSteps.enterPassword("SuperSecretPassword!");
        theInternetLoginSteps.invalidLogin();
        theInternetLoginSteps.enterLogin("tomsmith");
        theInternetLoginSteps.enterPassword("qweqweqwe");
        theInternetLoginSteps.invalidLogin();
        theInternetLoginSteps.enterLogin("qweqweqwe");
        theInternetLoginSteps.enterPassword("qweqweqwe");
        theInternetLoginSteps.invalidLogin();


    }
}
