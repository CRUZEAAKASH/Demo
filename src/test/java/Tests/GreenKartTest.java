package Tests;

import CommomUtil.BaseClass;
import CommomUtil.WebDriverFactory;
import Common.DataFromPropertiesFile;
import PageObjects.GreenKart;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class GreenKartTest {

    public WebDriver driver;
    BaseClass baseClass;

    /***
     * Making an object of Base Class
     * Getting value from data.properties file to invoke the particular browser
     */
    @BeforeTest
    public void settingUpDriver() throws IOException {
        baseClass = new BaseClass();
        String browserName = DataFromPropertiesFile.getValueFromPropertyFile("browser");
        driver = baseClass.initializeDriver(browserName);
        WebDriverFactory.setWebDriver(driver);
        System.out.println("Printing beforeTest method of GreenKart " + Thread.currentThread().getName());
    }

    @Test
    public void greenKartTestToBeExcluded() {
        System.out.println("Dummy Code as this method will not be Executed " + Thread.currentThread().getName());
    }

    @Test(enabled = true)
    public void greenKartTest() throws InterruptedException {
        baseClass.launchURL(driver, "https://rahulshettyacademy.com/seleniumPractise");
        baseClass.getTitle(driver);
        GreenKart.greenKartOperation();
    }

    @AfterTest
    public void tearDownDriver() {
        System.out.println("Executing Tear Down " + Thread.currentThread().getName());
        baseClass.tearDownDriver(driver);
    }
}
