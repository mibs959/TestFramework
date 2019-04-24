package Tools;

import Selenium.CoreDriver;
import Tools.Readers.FileReaderTools;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Screenshots extends CoreDriver {



    public static void takeScreenshot(String scenarioName){

        FileReaderTools fileReaderTools = new FileReaderTools();

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(src, new File(fileReaderTools.currentLocalPath() + "\\Screenshots\\" + scenarioName + "_" + System.currentTimeMillis() + ".png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
