package Selenium;
import Tools.Readers.FileReaderTools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CoreDriver {

    FileReaderTools fileReaderTools = new FileReaderTools();

    protected static WebDriver driver;

     /**
     * This method will initialize the Selenium WebDriver to use the given Browser.
     *
     * @param browser - Possible inputs: "chrome", "firefox" and "ie" (Internet Explorer).
     * @throws Exception - If the provided Browser name is none of the above or is empty.
     */
    protected void initializeDriver (String browser) throws Exception {

        browser = browser.toLowerCase();

        switch(browser) {
            case "chrome" :
                System.setProperty("webdriver.chrome.driver", fileReaderTools.currentLocalPath() + "\\drivers\\chromedriver.exe");
                this.driver = new ChromeDriver();
                break;
            case "firefox" :
                this.driver = new FirefoxDriver();
                break;
            case "ie" :
                this.driver = new InternetExplorerDriver();
                break;
            default :
                throw new Exception("Horror! The Browser name provided is incorrect or does not exist.");
        }

    }

    /**
     * This method finishes/kills the driver.
     *
     * IMPORTANT: ALWAYS call it after a Test Run.
     */
    protected void exitDriver(){
        this.driver.quit();
    }








}
