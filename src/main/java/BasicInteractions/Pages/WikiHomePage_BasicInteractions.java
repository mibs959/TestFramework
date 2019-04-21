package BasicInteractions.Pages;

import Locators.Pages.WikiHomePage_Locators;
import Selenium.ElementInteractions;

public class WikiHomePage_BasicInteractions extends WikiHomePage_Locators {

    protected ElementInteractions elementInteractions = new ElementInteractions();

    public void SetTextAtSearchField (String input){
        elementInteractions.SetElementText(SEARCH_TEXTFIELD, input);
    }

    public void ClickOnSearchButton(){
        elementInteractions.ClickOnElement(SEARCH_BUTTON);
    }

}
