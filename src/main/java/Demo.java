import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;

public class Demo {

    public static void main(String[] args) {
        WebDriver driver = initializeFireFoxDriver();
        launchURL(driver);
        getTitle(driver);

    }

    public static FirefoxDriver initializeFireFoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    public static void launchURL(WebDriver driver) {
        driver.get("https://www.amazon.com/");
    }

    public static void getTitle(WebDriver driver) {
        String title = driver.getTitle();
        System.out.println("Title of the Page = " + title);
    }
}
