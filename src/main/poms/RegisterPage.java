package main.poms;

import main.utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
  public RegisterPage() {
    super();
  }

  @FindBy(id = "customer_firstname")
  private WebElement firstnameInput;

  public void inputFirstname(String firstname) {
    firstnameInput.sendKeys(firstname);
  }

}
