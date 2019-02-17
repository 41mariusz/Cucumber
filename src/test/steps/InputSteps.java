package test.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import main.poms.LogInPage;
import main.utils.MainPage;

import java.util.List;

public class InputSteps {

    private LogInPage loginPage = new LogInPage();
    private MainPage mainPage = new MainPage();


    @When("^User sign in using login: (.+) and password: (.+)")
    public void signIn(String login, String password) {
        loginPage.logIn(login, password);
    }

    @And("^Click in SignIn$")
    public void clickInSignIn() {
        mainPage.signInBtn();
    }
}

