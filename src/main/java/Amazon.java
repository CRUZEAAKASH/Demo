import CommomUtil.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Amazon {

    public static void main(String[] args) {
        WebDriver driver = BaseClass.initalizeDriver("Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BaseClass.launchURL(driver, "https://www.amazon.com/");
        BaseClass.getTitle(driver);
        Amazon.amazonOperations(driver);
    }


    public static void amazonOperations(WebDriver driver) {
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
