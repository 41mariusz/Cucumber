package main.poms;

import main.utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {
  public RegisterPage() {
    super();
  }

  @FindBy(id = "customer_firstname")
  private WebElement firstnameInput;

  @FindBy(id = "customer_lastname")
  private WebElement lastnameInput;

  @FindBy(id = "passwd")
  private WebElement passwordRegisterInput;

  @FindBy(id = "firstname")
  private WebElement firstnameAdressInput;

  @FindBy(id = "lastname")
  private WebElement lastnameAdressInput;

  @FindBy(id = "company")
  private WebElement companyInput;

  @FindBy(id = "address1")
  private WebElement adress1Input;

  @FindBy(id = "address2")
  private WebElement adress2Input;

  @FindBy(id = "city")
  private WebElement cityInput;

  @FindBy(id = "postcode")
  private WebElement postcodeInput;

  @FindBy(id = "other")
  private WebElement additionalInfoInput;

  @FindBy(id = "phone")
  private WebElement homePhoneInput;

  @FindBy(id = "phone_mobile")
  private WebElement mobilePhoneInput;

  @FindBy(id = "alias")
  private WebElement aliasInput;

  @FindBy(id = "submitAccount")
  private WebElement submitBtn;

  @FindBy(id = "days")
  private WebElement dayOfBirthSelect;

  @FindBy(id = "months")
  private WebElement monthOfBirthSelect;

  @FindBy(id = "years")
  private WebElement yearOfBirthSelect;

  @FindBy(id = "id_state")
  private WebElement stateSelect;

  public void firstnameInput(String fistname) {
    firstnameInput.sendKeys(fistname);
  }

  public void lastnameInput(String lastname) {
    lastnameInput.sendKeys(lastname);
  }

  public void passwordRegisterInput(String password) {
    passwordRegisterInput.sendKeys(password);
  }

  public void fistnameAdressInput(String fistnameAdress) {
    firstnameAdressInput.clear();
    firstnameAdressInput.sendKeys(fistnameAdress);
  }

  public void lastnameAdressInput(String lastnameAdress) {
    lastnameAdressInput.clear();
    lastnameAdressInput.sendKeys(lastnameAdress);
  }

  public void companyInput(String company) {
    companyInput.sendKeys(company);
  }

  public void adress1Input(String adress1) {
    adress1Input.sendKeys(adress1);
  }

  public void adress2Input(String adress2) {
    adress2Input.sendKeys(adress2);
  }

  public void cityInput(String city) {
    cityInput.sendKeys(city);
  }

  public void postcodeInput(String postcode) {
    postcodeInput.sendKeys(postcode);
  }

  public void additionalInfoInput(String info) {
    additionalInfoInput.sendKeys(info);
  }

  public void homePhoneInput(String phone) {
    homePhoneInput.sendKeys(phone);
  }

  public void mobilePhoneInput(String phone) {
    mobilePhoneInput.sendKeys(phone);
  }

  public void aliasInput(String alias) {
    aliasInput.clear();
    aliasInput.sendKeys(alias);
  }

  public void submitBtn() {
    submitBtn.click();
  }

  public void dayOfBirthSelect(String day) {
    Select days = new Select(dayOfBirthSelect);
    days.selectByValue(day);
  }

  public void monthOfBirthSelect(String month) {
    Select months = new Select(monthOfBirthSelect);
    months.selectByValue(month);
  }

  public void yearOfBirthSelect(String year) {
    Select years = new Select(yearOfBirthSelect);
    years.selectByValue(year);
  }

  public void stateSelect(String state) {
    Select states = new Select(stateSelect);
    states.selectByVisibleText(state);
  }

}
