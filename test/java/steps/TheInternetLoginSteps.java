package steps;

import io.qameta.allure.Step;
import pages.InternetLoginPageEnterLogin;
import pages.InternetLoginPageEnterPassword;
import pages.ValidAndInvalidLogin;

public class TheInternetLoginSteps {
    @Step("enter login")
    public void enterLogin(String login) {
        InternetLoginPageEnterLogin internetLoginPageEnterLogin = new InternetLoginPageEnterLogin();
        internetLoginPageEnterLogin.enterLoginField("");
    }

    @Step("enter password")
    public void enterPassword(String password) {
        InternetLoginPageEnterPassword internetLoginPageEnterPassword = new InternetLoginPageEnterPassword();
        internetLoginPageEnterPassword.enterPasswordField("");
        internetLoginPageEnterPassword.clickLoginButton();
    }

    @Step("successful login")
    public void successfulLogin() {
        ValidAndInvalidLogin validAndInvalidLogin = new ValidAndInvalidLogin();
        validAndInvalidLogin.checkURL();
        validAndInvalidLogin.successfulLogin();
    }

    @Step("invalid login")
    public void invalidLogin() {
        ValidAndInvalidLogin validAndInvalidLogin = new ValidAndInvalidLogin();
        validAndInvalidLogin.invalidLogin();
    }
}
