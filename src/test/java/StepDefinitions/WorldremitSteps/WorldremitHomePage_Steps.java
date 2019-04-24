package StepDefinitions.WorldremitSteps;

import StepDefinitions.Support.BaseSteps;
import Travelex_Page.BasicInteractions.Pages.TravelexHomePage_BasicInteractions;
import WorldRemit_Page.BasicInteractions.Pages.WorldremitHomePage_BasicInteractions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class WorldremitHomePage_Steps extends BaseSteps {

    WorldremitHomePage_BasicInteractions worldremitHomePage_basicInteractions = new WorldremitHomePage_BasicInteractions();

    // TODO: Improve this method/Steps to make it dummy proof by setting the input string to lowercase and the first letter of the word/s to uppercase to match the real values.
    // TODO: This method should be Defined somewhere at Tools so other Steps, Classes, Methods can use it too.
    @When("I select '(.*)' as Country to send money at the Home Page")
    public void SelectCountryToSendMoneyTo (String country){
        worldremitHomePage_basicInteractions.SelectCountryFromDropdown(country);
    }

    @Then("I click on the Get Started button from the Home Page")
    public void ClickOnGetStarted(){
        worldremitHomePage_basicInteractions.ClickOnTheGetStarted();
    }


}
