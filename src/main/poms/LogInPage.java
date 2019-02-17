package main.poms;

import main.utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

    public LogInPage() {
        super();
    }

    @FindBy (id = "email")
    private WebElement emailInput;

    @FindBy (id = "passwd")
    private WebElement passwordInput;

    @FindBy (id = "SubmitLogin")
    private WebElement submitBtn;

    public void logIn(String login, String password){
        emailInput.sendKeys(login);
        passwordInput.sendKeys(password);
        submitBtn.click();
    }

}