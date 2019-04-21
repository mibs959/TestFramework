package BasicInteractions.Pages;

import Locators.Pages.WikiArticlePage_Locators;
import Selenium.ElementInteractions;

public class WikiArticlePage_BasicInteractions extends WikiArticlePage_Locators {

    protected ElementInteractions elementInteractions = new ElementInteractions();

    public boolean IsArticleTitleDisplayed(){
        return elementInteractions.isGivenElementDisplayed(ARTICLE_TITLE);
    }

    public boolean IsArticleContentsSectionDisplayed(){
        return elementInteractions.isGivenElementDisplayed(CONTENTS_SECTION);
    }

}
