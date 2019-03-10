package test.steps;

import cucumber.api.java.en.And;
import main.poms.LogInPage;
import main.poms.MainPage;
import main.poms.RegisterPage;

public class InputSteps {

  private LogInPage loginPage = new LogInPage();
  private MainPage mainPage = new MainPage();
  private RegisterPage registerPage = new RegisterPage();

  @And("^User write: (.+) to (.+)")
  public void input(String text, String fieldName) {
    switch (fieldName) {
      case "login input":
        loginPage.inputLogin(text);
        break;
      case "password input":
        loginPage.inputPassword(text);
        break;
      case "create new account":
        loginPage.inputCreateLogin(text);
        break;
      case "firstname input":
        registerPage.firstnameInput(text);
        break;
      case "lastname input":
        registerPage.lastnameInput(text);
        break;
      case "passwd input":
        registerPage.passwordRegisterInput(text);
        break;
      case "firstname adress input":
        registerPage.fistnameAdressInput(text);
        break;
      case "lastname adress input":
        registerPage.lastnameAdressInput(text);
        break;
      case "company input":
        registerPage.companyInput(text);
        break;
      case "adress1 input":
        registerPage.adress1Input(text);
        break;
      case "adress2 input":
        registerPage.adress2Input(text);
        break;
      case "city input":
        registerPage.cityInput(text);
        break;
      case "postcode input":
        registerPage.postcodeInput(text);
        break;
      case "additional info input":
        registerPage.additionalInfoInput(text);
        break;
      case "home phone input":
        registerPage.homePhoneInput(text);
        break;
      case "mobile phone input":
        registerPage.mobilePhoneInput(text);
        break;
      case "to alias input":
        registerPage.aliasInput(text);
        break;
    }
  }

  @And("^User click: (.+)")
  public void click(String fieldName) {
    switch (fieldName) {
      case "submit button":
        loginPage.submitBtn();
        break;
      case "in SignIn":
        mainPage.signInBtn();
        break;
      case "Create an account":
        loginPage.submitRegisterBtn();
        break;
      case "submit register button":
        registerPage.submitBtn();
        break;
    }
  }

  @And("^User set: (.+) in (.+)")
  public void select(String value, String fieldName) {
    switch (fieldName) {
      case "day of birth":
        registerPage.dayOfBirthSelect(value);
        break;
      case "month of birth":
        registerPage.monthOfBirthSelect(value);
        break;
      case "year of birth":
        registerPage.yearOfBirthSelect(value);
        break;
    }
  }


  @And("^User set: (.+) state")
  public void stateSelect(String state) {
    registerPage.stateSelect(state);
  }
}

