package StepDefinitions.TravelexSteps;

import BasicInteractions.Pages.TravelexHomePage_BasicInteractions;
import StepDefinitions.Support.BaseSteps;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class TravelexHomePage_Steps extends BaseSteps {

    TravelexHomePage_BasicInteractions travelexHomePage_basicInteractions = new TravelexHomePage_BasicInteractions();

    @Then("I swipe at the Features Carousel unil the '(.*)(st|nd|rd|th)' Feature")
    public void SwipeUnitlGivenFeatureIndex(String featureIndex, String decoration){
        travelexHomePage_basicInteractions.SwipeOnFeaturesToGivenFeatureByIndex(Integer.parseInt(featureIndex));
    }

    @Then("the '(.*)(st|nd|rd|th)' Slide of the Features Carousel at the Home Page is Displayed")
    public void VerifyIfGivenFeatureCarouselSlideIsDisplayed(String carouselSlide, String decoration){
        Assert.assertTrue(travelexHomePage_basicInteractions.IsGivenCarouselSlideDisplayed(Integer.parseInt(carouselSlide)));
    }

}
