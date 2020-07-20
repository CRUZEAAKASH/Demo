import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) {
        WebDriver driver = initalizeDriver("Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Demo.launchURL(driver);
        Demo.getTitle(driver);
        Demo.searchElement(driver);

    }

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

    public static void launchURL(WebDriver driver) {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }

    public static void getTitle(WebDriver driver) {
        String title = driver.getTitle();
        System.out.println("Title of the Page = " + title);
    }

    public static void searchElement(WebDriver driver) {
        //By customized css selector. Using "Tagname#Id"
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("a thousand splendid suns");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height']/img)[1]")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        driver.findElement(By.cssSelector("a#hlb-ptc-btn-native")).click();
        driver.findElement(By.cssSelector("input#ap_email")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("#continue")).click();
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("12345679");

    }
}
