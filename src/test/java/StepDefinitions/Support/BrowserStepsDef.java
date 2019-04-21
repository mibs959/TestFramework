package StepDefinitions.Support;

import Selenium.BrowserInteractions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;


public class BrowserStepsDef extends BaseSteps {

    BrowserInteractions browserInteractions = new BrowserInteractions();

    @Given("I navigate to '(.*)'")
    public void navigateToGivenUrlStep(String url){
        browserInteractions.navigateToGivenUrl(url);
        browserInteractions.MaximizeWindow();
    }

    @Then("the current Page Title is '(.*)'")
    public void pageTitleValidation(String input){
        Assert.assertEquals(input, browserInteractions.GetPageTitle());
    }

}
