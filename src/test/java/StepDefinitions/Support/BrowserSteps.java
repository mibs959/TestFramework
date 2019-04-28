package StepDefinitions.Support;

import Selenium.BrowserInteractions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class BrowserSteps extends BaseSteps {

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

    @When("Resize the current Window to '(.*)' Width, '(.*)' Height")
    public void ResizeCurrentWindow(String width, String height){
        browserInteractions.ResizeWindow(Integer.parseInt(width), Integer.parseInt(height));
    }

    @When("Resize the current Window to emulate Mobile Resolution")
    public void ResizeToMobile(){
        browserInteractions.ResizeWindow(550, 800);
    }

}
