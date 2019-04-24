package Wikipedia_Page.BasicInteractions.Pages;

import Wikipedia_Page.Locators.Pages.WikiArticlePage_Locators;
import Selenium.ElementInteractions;

public class WikiArticlePage_BasicInteractions extends WikiArticlePage_Locators {

    protected ElementInteractions elementInteractions = new ElementInteractions();

    public boolean IsArticleTitleDisplayed(){
        return elementInteractions.IsGivenElementDisplayed(ARTICLE_TITLE);
    }

    public boolean IsArticleContentsSectionDisplayed(){
        return elementInteractions.IsGivenElementDisplayed(CONTENTS_SECTION);
    }

}
