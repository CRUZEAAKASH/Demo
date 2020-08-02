package Tests;

import CommomUtil.BaseClass;
import Common.DataFromPropertiesFile;
import Pages.GreenKart;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class GreenKartTest {

    WebDriver driver;
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
    }

    @Test
    public void greenKartTestToBeExcluded() {
        System.out.println("Dummy Code as this method will not be Executed");
    }

    @Test(enabled = true)
    public void greenKartTest() throws InterruptedException {
        baseClass.launchURL(driver, "https://rahulshettyacademy.com/seleniumPractise");
        baseClass.getTitle(driver);
        GreenKart.greenKartOperation(driver);
    }

    @AfterTest
    public void tearDownDriver() {
        System.out.println("Executing Tear Down");
        baseClass.tearDownDriver(driver);
    }
}
