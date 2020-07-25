import CommomUtil.BaseClass;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GreenKart {

    public static void main(String[] args) {
        WebDriver driver = BaseClass.initalizeDriver("Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BaseClass.launchURL(driver, "https://rahulshettyacademy.com/seleniumPractise");
        BaseClass.getTitle(driver);

    }
}
