package Pages;

import CommomUtil.BaseClass;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GreenKart extends BaseClass {

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        WebDriver driver = baseClass.initalizeDriver("Chrome");
        baseClass.launchURL(driver, "https://rahulshettyacademy.com/seleniumPractise");
        baseClass.getTitle(driver);
        baseClass.tearDownDriver(driver);

    }
}
