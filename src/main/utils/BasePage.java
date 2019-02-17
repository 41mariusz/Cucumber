package main.utils;

import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {

    protected static final long IMPLICITLY_WAIT_TIME = 10;
    protected static final long PAGE_LOAD_TIME = 30;

    public BasePage() {
        PageFactory.initElements(WebDriverProvider.getDriver(), this);
    }

    protected void implicityWaitTurnOff() {
        WebDriverProvider.getDriver().manage()
                .timeouts()
                .implicitlyWait(0, TimeUnit.SECONDS);
    }
    protected void implicityWaitTurnOn() {
        WebDriverProvider.getDriver().manage()
                .timeouts()
                .implicitlyWait(IMPLICITLY_WAIT_TIME, TimeUnit.SECONDS);
    }
}