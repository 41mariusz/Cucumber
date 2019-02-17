package test.steps;

import cucumber.api.java.en.Then;
import main.poms.MyAccountPage;
import org.junit.Assert;

public class CompareSteps {
    private MyAccountPage myAccPage = new MyAccountPage();

    @Then("^Check if you are logged in$")
    public void checkIfSomething() {
        Assert.assertTrue(myAccPage.returnBtn().getText().contains("Sign out"));
    }
}