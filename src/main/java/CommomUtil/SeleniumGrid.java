package CommomUtil;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {
    public static WebDriver launchDriver(String browser) throws MalformedURLException {
        WebDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WIN10);

        String hubURL = "http://localhost:4444/wd/hub";
        driver = new RemoteWebDriver(new URL(hubURL), capabilities);

        return driver;
    }
}
