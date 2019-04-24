package Wikipedia_Page.BasicInteractions.Pages;

import Wikipedia_Page.Locators.Pages.WikiResultsPage_Locators;
import Selenium.ElementInteractions;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WikiResultsPage_BasicInteractions extends WikiResultsPage_Locators {

    protected ElementInteractions elementInteractions = new ElementInteractions();

    public boolean SuggestedSearchLinkDisplayStatus(){
        return elementInteractions.IsGivenElementDisplayed(DID_YOU_MEAN_LINK);
    }

    public String GetSuggestedSearchText(){
        return elementInteractions.GetElementText(DID_YOU_MEAN_LINK);
    }

    public void ClickOnSuggestedSearch(){
        elementInteractions.ClickOnElement(DID_YOU_MEAN_LINK);
    }

    public int GetAmountOfResultsDisplayed(){
        return elementInteractions.GetAmountOfElementsDisplayed(SEARCH_RESULTS_ENTRIES);
    }

    public void ClickOnGivenSearchResultTitleByIndex (int indexNumber){
        List<WebElement> resultsEntries = elementInteractions.FindWebelements(SEARCH_RESULTS_ENTRIES);
        elementInteractions.ClickOnElement(resultsEntries.get(indexNumber).findElement(RESULT_ENTRY_TITLE));
    }

}
