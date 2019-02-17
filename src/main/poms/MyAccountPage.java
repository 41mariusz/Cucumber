package main.poms;

import main.utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
    public MyAccountPage() {
        super();
    }

    @FindBy (xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    private WebElement logoutBtn;


    public void logout(){
        logoutBtn.click();
    }

    public WebElement returnBtn() {
        return logoutBtn;
    }
}