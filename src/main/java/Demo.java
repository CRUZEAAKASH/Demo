import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Demo1");
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().logs().get(LogType.BROWSER);
    }
}
