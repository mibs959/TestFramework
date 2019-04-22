package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ElementInteractions extends CoreDriver {

    public WebElement FindElement(By by){
        return driver.findElement(by);
    }

    public List<WebElement> FindWebelements (By by){
        return driver.findElements(by);
    }

    public void ClickOnElement(WebElement element){
        element.click();
    }

    public void ClickOnElement(By by){
        FindElement(by).click();
    }

    public void WriteOnElement(WebElement element){

    }

    public String GetElementText(WebElement element){
        return element.getText();
    }

    public String GetElementText(By by){
        return FindElement(by).getText();
    }

    public void SetElementText (WebElement element, String input){
        element.sendKeys(input);
    }

    public void SetElementText (By by, String input){
        FindElement(by).sendKeys(input);
    }

    public int GetAmountOfElementsDisplayed(By by){
        return FindWebelements(by).size();
    }


    // Assertions:

    public boolean isGivenElementDisplayed(WebElement element){
        try {
            return element.isDisplayed();
        }catch (ElementNotVisibleException e){
            return false;
        }
    }

    public boolean isGivenElementDisplayed(By by){
        try {
            return FindElement(by).isDisplayed();
        }catch (ElementNotVisibleException e){
            return false;
        }
    }

    // Mobile Emulation Methods

    public void Swipe(By elementToMove, By elementToMoveTo) {
        Actions builder = new Actions(driver);

        Action dragAndDrop = builder.clickAndHold(FindElement(elementToMove))
                .moveToElement(FindElement(elementToMoveTo))
                .release(FindElement(elementToMoveTo))
                .build();

        dragAndDrop.perform();
    }

    public void Swipe(WebElement elementToMove, WebElement elementToMoveTo) {
        Actions builder = new Actions(driver);

        Action dragAndDrop = builder.clickAndHold(elementToMove)
                .moveToElement(elementToMoveTo)
                .release(elementToMoveTo)
                .build();

        dragAndDrop.perform();
    }

}
