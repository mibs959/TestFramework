package Tools;

import Selenium.ElementInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;

public class CustomAssertions extends ElementInteractions {

    private Screenshots screenshots = new Screenshots();

    public boolean WebElementShouldBeDisplayed (By by, String scenarioName){

        try {

            return FindElement(by).isDisplayed();
        }catch (ElementNotVisibleException e){
            screenshots.takeScreenshot(scenarioName);
            return false;
        }

    }




}
