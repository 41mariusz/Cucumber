package main.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    public MainPage() {
        super();
    }

    @FindBy(className = "login")
    private static WebElement SignInBtn;

    public void signInBtn(){
        SignInBtn.click();
    }
}
