package test.java;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import main.utils.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;
import static main.utils.WebDriverProvider.*;

public class BaseTest extends BasePage {

    @Before
    public void beforeTest(){
        getDriver().manage()
                .window()
                .maximize();
        getDriver().manage()
                .timeouts()
                .implicitlyWait(IMPLICITLY_WAIT_TIME, TimeUnit.SECONDS);
        getDriver().manage()
                .timeouts()
                .pageLoadTimeout(PAGE_LOAD_TIME, TimeUnit.SECONDS);
    }

    @After
    public void afterTest(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed()){
            scenario.embed(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
        }
        Thread.sleep(2000);
        closeDriver();
    }
}
