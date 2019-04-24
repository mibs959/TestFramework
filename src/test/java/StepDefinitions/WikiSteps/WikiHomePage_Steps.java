package StepDefinitions.WikiSteps;

import Wikipedia_Page.BasicInteractions.Pages.WikiHomePage_BasicInteractions;
import StepDefinitions.Support.BaseSteps;
import Tools.ScennarioContext;
import cucumber.api.java.en.When;

public class WikiHomePage_Steps extends BaseSteps {

    WikiHomePage_BasicInteractions wikiHomePage_basicInteractions = new WikiHomePage_BasicInteractions();

    @When("I search for '(.*)' from the Home Page Search")
    public void SearchOnHomePageSearch (String input){
        wikiHomePage_basicInteractions.SetTextAtSearchField(input);
        ScennarioContext.saveData("searchInput", input);
        wikiHomePage_basicInteractions.ClickOnSearchButton();
    }



}
