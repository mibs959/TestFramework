package Locators.Pages;

import org.openqa.selenium.By;

public class TravelexHomePage_Locators {

    // Locators

    protected final By FEATURES_CAROUSEL = By.cssSelector(".slick-track div[class*='slider']");


    /**
     * The reason why "index -1" is that the index starts in '0' on the page.
     * @param index
     * @return
     */
    protected final By GetCarouselSlide(int index){
        return By.cssSelector(String.format(".slick-track div[class*='slider'][index='%s']", index -1));
    }



}
