package Tests;

import CommomUtil.BaseClass;
import PageObjects.QAClickAcademy.LandingPage;
import PageObjects.QAClickAcademy.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class QAClickAcademyTest extends BaseClass {

    private WebDriver driver;
    private LandingPage landingPage;
    private LoginPage loginPage;

    @Parameters({"browser"})
    @BeforeMethod
    public void setup(String browserName) {
        driver = initializeDriver(browserName);
        launchURL(driver, "http://www.qaclickacademy.com/");
        landingPage = new LandingPage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test(dataProvider = "getDataMethod")
    public void login(String email, String password) {
        landingPage.clickOnLoginButton();
        loginPage.performLoginOperation(email, password);
    }

    @AfterMethod
    public void closeDriver() {
        tearDownDriver(driver);
    }

    @DataProvider
    public Object[] getDataMethod() {
        Object[][] data = new Object[2][2];
        data[0][0] = "abc@qw.com";
        data[0][1] = "123456";

        data[1][0] = "restricteduser";
        data[1][1] = "password";
        return data;
    }

}
