package Selenium;

import org.openqa.selenium.Keys;

public class BrowserInteractions extends CoreDriver {

    public void navigateToGivenUrl(String url) {
        driver.navigate().to(url);
    }

    public void MaximizeWindow() {
        driver.manage().window().maximize();
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




}
