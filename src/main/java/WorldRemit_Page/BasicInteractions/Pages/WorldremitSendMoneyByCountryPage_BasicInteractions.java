package WorldRemit_Page.BasicInteractions.Pages;

import Selenium.ElementInteractions;
import Travelex_Page.Locators.Pages.TravelexHomePage_Locators;
import WorldRemit_Page.Locators.Pages.WorldremitSendMoneyByCountryPage_Locators;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorldremitSendMoneyByCountryPage_BasicInteractions extends WorldremitSendMoneyByCountryPage_Locators {

    ElementInteractions elementInteractions = new ElementInteractions();

    public String GetSendMoneyByCountryPageTitle (){
        return elementInteractions.GetElementText(SEND_MONEY_TO_TITLE);
    }

    public String GetSelectedCountryAtSendByCountryDropdown (){
        return elementInteractions.GetSelectedValueAtGivenDropdown(SEND_TO_COUNTRY_DROPDOWN);
    }






}
