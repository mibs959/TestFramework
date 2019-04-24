package Travelex_Page.BasicInteractions.Pages;

import Selenium.ElementInteractions;
import Travelex_Page.Locators.Pages.TravelexHomePage_Locators;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TravelexHomePage_BasicInteractions extends TravelexHomePage_Locators {

    ElementInteractions elementInteractions = new ElementInteractions();

    public void SwipeOnFeaturesToGivenFeatureByIndex (int index){

        List<WebElement> carouselFeatures = elementInteractions.FindWebelements(FEATURES_CAROUSEL);

        for(int i = 0; i < index; i++) {
            elementInteractions.Swipe(carouselFeatures.get(i), carouselFeatures.get(i + 1));
        }
    }

    public boolean IsGivenCarouselSlideDisplayed (int index){
        return elementInteractions.IsGivenElementDisplayed(GetCarouselSlide(index));
    }





}
