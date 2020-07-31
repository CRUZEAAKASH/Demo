package CommomUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitClass {

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        WebDriver driver = baseClass.initializeDriver("Chrome");
        baseClass.launchURL(driver, "https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//*[@id='start']/button")).click();

        //Defining the referene variable of Fluent Wait
        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

        WebElement foo = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                if (driver.findElement(By.id("finish")).isDisplayed())
                    return driver.findElement(By.id("finish"));
                else
                    return null;
            }
        });
        System.out.println("Text after loading = " + driver.findElement(By.id("finish")).getText());

    }
}
