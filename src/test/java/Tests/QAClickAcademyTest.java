package Tests;

import CommomUtil.BaseClass;
import Common.DataFromPropertiesFile;
import PageObjects.QAClickAcademy.LandingPage;
import PageObjects.QAClickAcademy.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class QAClickAcademyTest extends BaseClass {

    private WebDriver driver;
    private LandingPage landingPage;
    private LoginPage loginPage;
    private String url = DataFromPropertiesFile.getValueFromPropertyFile("url_qaClickAcademy");

    public QAClickAcademyTest() throws IOException {
    }

    @Parameters({"browser"})
    @BeforeMethod
    public void setup(String browserName) {
        driver = initializeDriver(browserName);

        launchURL(driver, url);
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
