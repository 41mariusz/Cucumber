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

  @FindBy(id = "passwd")
  private WebElement passwordInput;

  @FindBy(id = "SubmitLogin")
  private WebElement submitBtn;

  public void inputLogin(String login) {
    emailInput.sendKeys(login);
  }

  public void inputPassword(String password) {
    passwordInput.sendKeys(password);
  }

  public void submitBtn() {
    submitBtn.click();
  }

}