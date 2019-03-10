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

  @And("^User write: (.+) to passwd input")
  public void passwordRegisterInput(String password) {
    registerPage.passwordRegisterInput(password);
  }

  @And("^User write: (.+) to firstname adress input")
  public void fistnameAdressInput(String firstname) {
    registerPage.fistnameAdressInput(firstname);
  }

  @And("^User write: (.+) to lastname adress input")
  public void lastnameAdressInput(String lastname) {
    registerPage.lastnameAdressInput(lastname);
  }

  @And("^User write: (.+) to company input")
  public void companyInput(String company) {
    registerPage.companyInput(company);
  }

  @And("^User write: (.+) to adress1 input")
  public void adress1Input(String adress) {
    registerPage.adress1Input(adress);
  }

  @And("^User write: (.+) to adress2 input")
  public void adress2Input(String adress) {
    registerPage.adress2Input(adress);
  }

  @And("^User write: (.+) to city input")
  public void cityInput(String city) {
    registerPage.cityInput(city);
  }

  @And("^User write: (.+) to postcode input")
  public void postcodeInput(String postcode) {
    registerPage.postcodeInput(postcode);
  }

  @And("^User write: (.+) to additional info input")
  public void additionalInfoInput(String info) {
    registerPage.additionalInfoInput(info);
  }

  @And("^User write: (.+) to home phone input")
  public void homePhoneInput(String phone) {
    registerPage.homePhoneInput(phone);
  }

  @And("^User write: (.+) to mobile phone input")
  public void mobilePhoneInput(String phone) {
    registerPage.mobilePhoneInput(phone);
  }

  @And("^User write: (.+) to alias input")
  public void aliasInput(String alias) {
    registerPage.aliasInput(alias);
  }
}

