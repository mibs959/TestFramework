package StepDefinitions.WikiSteps;

import Tools.CustomAssertions;
import Wikipedia_Page.BasicInteractions.Pages.WikiArticlePage_BasicInteractions;
import StepDefinitions.Support.BaseSteps;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class WikiArticlePage_Steps extends BaseSteps {

    WikiArticlePage_BasicInteractions wikiArticlePage_basicInteractions = new WikiArticlePage_BasicInteractions();
    CustomAssertions customAssertions = new CustomAssertions();

    @Then("the Article Title is displayed")
    public void VerifyIfArticleTitleIsDisplayed(){
        Assert.assertTrue(wikiArticlePage_basicInteractions.IsArticleTitleDisplayed());
    }

    @Then("the Article Table of Contents is displayed")
    public void VerifyIfTableOfContentsIsDisplayed(){

        //customAssertions.WebElementShouldBeDisplayed()

        Assert.assertTrue(wikiArticlePage_basicInteractions.IsArticleContentsSectionDisplayed());
    }

}
