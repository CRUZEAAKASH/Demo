package CommomUtil;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    public static void getScreenShot(WebDriver driver, String testCaseName) throws IOException {
        System.out.println("First Line ");
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        System.out.println("Second Line ");
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        System.out.println("Third Line ");
        String destinationPath = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
        System.out.println("Destination path = " + destinationPath);
        FileUtils.copyFile(source, new File(destinationPath));
    }
}
