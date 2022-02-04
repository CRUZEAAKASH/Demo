package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunSeleniumTestOnChromeBrowser {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://aakash-shinghal.medium.com/run-selenium-webdriver-script-on-brave-browser-203462fb4c36");
        driver.quit();
    }
}
