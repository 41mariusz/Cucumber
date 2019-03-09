package main.poms;

import main.utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

  public LogInPage() {
    super();
  }

  @FindBy(id = "email")
  private WebElement emailInput;

  @FindBy(id = "email_create")
  private WebElement emailCreateInput;

  @FindBy(id = "passwd")
  private WebElement passwordInput;

  @FindBy(id = "SubmitLogin")
  private WebElement submitBtn;

  @FindBy(id = "SubmitCreate")
  private WebElement submitRegisterBtn;

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

  @FindBy(id="phone")
  private WebElement homePhoneInput;

  @FindBy(id="phone_mobile")
  private WebElement mobilePhoneInput;

  @FindBy(id = "alias")
  private WebElement aliasInput;

  public void inputLogin(String login) {
    emailInput.sendKeys(login);
  }

  public void inputCreateLogin(String login) {
    emailCreateInput.sendKeys(login);
  }

  public void inputPassword(String password) {
    passwordInput.sendKeys(password);
  }

  public void submitBtn() {
    submitBtn.click();
  }

  public void submitRegisterBtn() {
    submitRegisterBtn.click();
  }

}