package test.steps;
import cucumber.api.java.en.Given;

import static main.utils.WebDriverProvider.getDriver;

public class BrowserSteps {
    @Given("^Open (.+) page$")
    public void getUrl(String url) {
        getDriver().get(url);
    }
}
