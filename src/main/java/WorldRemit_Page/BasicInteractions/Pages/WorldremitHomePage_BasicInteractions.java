package WorldRemit_Page.BasicInteractions.Pages;

import Selenium.ElementInteractions;
import Travelex_Page.Locators.Pages.TravelexHomePage_Locators;
import WorldRemit_Page.Locators.Pages.WorldremitHomePage_Locators;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorldremitHomePage_BasicInteractions extends WorldremitHomePage_Locators {

    ElementInteractions elementInteractions = new ElementInteractions();

    public void SelectCountryFromDropdown (String country){
        elementInteractions.SelectElementFromDropdownByName(CHOOSE_COUNTRY_DROPDOWN, country);
    }

    public void ClickOnTheGetStarted (){
        elementInteractions.ClickOnElement(GET_STARTED_BUTTON);
    }





}
