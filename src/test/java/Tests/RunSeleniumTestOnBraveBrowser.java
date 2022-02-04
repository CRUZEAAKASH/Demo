package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunSeleniumTestOnBraveBrowser {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions().setBinary("/Applications/Brave Browser.app/Contents/MacOS/Brave Browser");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://aakash-shinghal.medium.com/run-selenium-webdriver-script-on-brave-browser-203462fb4c36");
        driver.quit();
    }
}
