package CommomUtil;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class PartialScreenshot {

    public static void takePartialScreenshot(WebElement element) throws IOException {
        File file = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("logo.png"));
    }
}
