package CommomUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

    public static WebDriver initalizeDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie") || browser.equalsIgnoreCase("internet explorer")) {
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        }
        return null;
    }

    public static void launchURL(WebDriver driver, String url) {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static void getTitle(WebDriver driver) {
        String title = driver.getTitle();
        System.out.println("Title of the Page = " + title);
    }
}
