package StepDefinitions.WorldremitSteps;

import StepDefinitions.Support.BaseSteps;
import WorldRemit_Page.BasicInteractions.Pages.WorldremitHomePage_BasicInteractions;
import WorldRemit_Page.BasicInteractions.Pages.WorldremitSendMoneyByCountryPage_BasicInteractions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class WorldremitSendMoneyByCountryPage_Steps extends BaseSteps {

    WorldremitSendMoneyByCountryPage_BasicInteractions worldremitSendMoneyByCountryPage_basicInteractions = new WorldremitSendMoneyByCountryPage_BasicInteractions();

    // TODO: Improve this method/Steps to make it dummy proof by setting the input string to lowercase and the first letter of the word/s to uppercase to match the real values.
    // TODO: This method should be Defined somewhere at Tools so other Steps, Classes, Methods can use it too.
    @Then("the Send Money page is focused on sending money to '(.*)'")
    public void VerifyCountryOfSendMoneyToPage (String country){
        Assert.assertTrue(worldremitSendMoneyByCountryPage_basicInteractions.GetSendMoneyByCountryPageTitle().contains(country));
    }

    @Then("make sure that the Send Money To Dropdown at the Send Money page has '(.*)' selected")
    public void VerifySendMoneyToDropdownSelectedValue(String country){
        Assert.assertTrue(worldremitSendMoneyByCountryPage_basicInteractions.GetSelectedCountryAtSendByCountryDropdown().contains(country));
    }

}
