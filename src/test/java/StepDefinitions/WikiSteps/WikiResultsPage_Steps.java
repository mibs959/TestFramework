package StepDefinitions.WikiSteps;

import Wikipedia_Page.BasicInteractions.Pages.WikiResultsPage_BasicInteractions;
import StepDefinitions.Support.BaseSteps;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class WikiResultsPage_Steps extends BaseSteps {

    WikiResultsPage_BasicInteractions wikiResultsPage_basicInteractions = new WikiResultsPage_BasicInteractions();

    // TODO: Verify later why '(is|isnt)' is not working... When it should as it was before.
    @Then("the Suggested Search Link '(.*)' displayed at the Results Page")
    public void IsSuggestedLinkDisplayedOrNot(String input){

        if (input.equals("is")){
            Assert.assertTrue(wikiResultsPage_basicInteractions.SuggestedSearchLinkDisplayStatus());
        }else{
            Assert.assertFalse(wikiResultsPage_basicInteractions.SuggestedSearchLinkDisplayStatus());
        }
    }

    @Then("the Suggested Search Link Text is '(.*)'")
    public void IsSuggestedLinkTextCorrect(String input){
        Assert.assertEquals(input, wikiResultsPage_basicInteractions.GetSuggestedSearchText());
    }

    @Then("click on the Search Suggestion Link")
    public void ClickOnTheSearchSuggestionLink(){
        wikiResultsPage_basicInteractions.ClickOnSuggestedSearch();
    }

    // TODO: The input for int was not working, therefore i had to keep using String and then converting it to int
    // in order todo the Assertion.
    @Then("the amount of Results displayed on the current page is '(.*)'")
    public void IsNumberOfResultsDisplayedCorrect (String input){
        Assert.assertEquals(Integer.parseInt(input), wikiResultsPage_basicInteractions.GetAmountOfResultsDisplayed());
    }

    @Then("I click on the '(.*)(st|nd|rd|th)' entry from the Results")
    public void ClickOnGivenEntryNumber (String input, String nonUsed){
        wikiResultsPage_basicInteractions.ClickOnGivenSearchResultTitleByIndex(Integer.parseInt(input));
    }


}
