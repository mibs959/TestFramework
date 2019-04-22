package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

public class BrowserInteractions extends CoreDriver {

    public void navigateToGivenUrl(String url) {
        driver.navigate().to(url);
    }

    public void MaximizeWindow() {
        driver.manage().window().maximize();
    }

    public void ResizeWindow (int width, int height){
        Dimension dimension = new Dimension(width, height);
        driver.manage().window().setSize(dimension);
    }

    public void CloseWindowOrTab() {
        driver.close();
    }

    public void OpenNewTab() {
        Keys.chord(Keys.CONTROL,"t");
    }

    public void OpenNewWindow() {
        Keys.chord(Keys.CONTROL,"n");
    }

    public void RefreshPage() {
        driver.navigate().refresh();
    }

    public String GetPageTitle(){
        return driver.getTitle();
    }

    // Mobile Interaction Emulations


}
