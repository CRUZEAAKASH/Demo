package Pages;

import CommomUtil.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Amazon {

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        WebDriver driver = baseClass.initalizeDriver("Chrome");
        baseClass.launchURL(driver, "https://www.amazon.com/");
        baseClass.getTitle(driver);
        Amazon.amazonOperations(driver);
        baseClass.tearDownDriver(driver);
    }


    private static void amazonOperations(WebDriver driver) {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("a thousand splendid suns");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).submit();
        driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height']/img)[1]")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        driver.findElement(By.cssSelector("a#hlb-ptc-btn-native")).click();
        driver.findElement(By.cssSelector("input#ap_email")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("#continue")).click();
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("12345679");

    }
}