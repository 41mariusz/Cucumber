package test.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import main.poms.LogInPage;
import main.poms.RegisterPage;
import main.utils.MainPage;

public class InputSteps {

  private LogInPage loginPage = new LogInPage();
  private MainPage mainPage = new MainPage();
  private RegisterPage registerPage = new RegisterPage();


  @When("^User write: (.+) to login input")
  public void inputLogin(String login) {
    loginPage.inputLogin(login);
  }

  @When("^User write: (.+) to password input")
  public void inputPassword(String password) {
    loginPage.inputPassword(password);
  }

  @When("^User click: submit button")
  public void submitBtn() {
    loginPage.submitBtn();
  }

  @And("^Click in SignIn$")
  public void clickInSignIn() {
    mainPage.signInBtn();
  }

  @When("^User write: (.+) to create new account")
  public void inputCreateLogin(String login) {
    loginPage.inputCreateLogin(login);
  }

  @And("^Click in Create an account$")
  public void clickInCreateAnAccount() {
    loginPage.submitRegisterBtn();
  }

  @And("^User write: (.+) to firstname input")
  public void firstnameInput(String firstname) {
    registerPage.firstnameInput(firstname);
  }

  @And("^User write: (.+) to lastname input")
  public void lastnameInput(String lastname) {
    registerPage.lastnameInput(lastname);
  }

  @And("^User write: (.+) to password input register")
  public void passwordRegisterInput(String password) {
    registerPage.passwordRegisterInput(password);
  }
}

