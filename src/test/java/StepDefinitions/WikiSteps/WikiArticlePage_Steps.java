package StepDefinitions.WikiSteps;

import BasicInteractions.Pages.WikiArticlePage_BasicInteractions;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class WikiArticlePage_Steps {

    WikiArticlePage_BasicInteractions wikiArticlePage_basicInteractions = new WikiArticlePage_BasicInteractions();

    @Then("the Article Title is displayed")
    public void VerifyIfArticleTitleIsDisplayed(){
        Assert.assertTrue(wikiArticlePage_basicInteractions.IsArticleTitleDisplayed());
    }

    @Then("the Article Table of Contents is displayed")
    public void VerifyIfTableOfContentsIsDisplayed(){
        Assert.assertTrue(wikiArticlePage_basicInteractions.IsArticleContentsSectionDisplayed());
    }

}
