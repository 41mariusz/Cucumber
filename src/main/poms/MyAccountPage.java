package main.poms;

import main.utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
  public MyAccountPage() {
    super();
  }

  @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
  private WebElement logoutBtn;

  @FindBy(css = "div#center_column div.alert.alert-danger")
  private WebElement errorBox;

  @FindBy(css = "div#create_account_error ol li")
  private WebElement miniErrorBox;


  public void logout() {
    logoutBtn.click();
  }

  public WebElement returnBtn() {
    return logoutBtn;
  }

  public WebElement returnErrorBox() {
    return errorBox;
  }

  public WebElement returnMiniErrorBox() {
    return miniErrorBox;
  }
}