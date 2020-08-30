package Tests;

import CommomUtil.BaseClass;
import PageObjects.QAClickAcademy.LandingPage;
import PageObjects.QAClickAcademy.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class QAClickAcademyTest extends BaseClass {

    private WebDriver driver;
    private LandingPage landingPage;
    private LoginPage loginPage;

    @Parameters({"browser"})
    @BeforeTest
    public void setup(String browserName) {
        driver = initializeDriver(browserName);
        launchURL(driver, "http://www.qaclickacademy.com/");
        landingPage = new LandingPage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void login() {
        landingPage.clickOnLoginButton();
        loginPage.performLoginOperation("abc@qw.com", "123456");
    }

    @AfterTest
    public void closeDriver() {
        tearDownDriver(driver);
    }

}
