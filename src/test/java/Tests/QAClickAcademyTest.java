package Tests;

import CommomUtil.BaseClass;
import Common.DataFromPropertiesFile;
import PageObjects.QAClickAcademy.LandingPage;
import PageObjects.QAClickAcademy.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class QAClickAcademyTest extends BaseClass {

    public WebDriver driver;
    private LandingPage landingPage;
    private LoginPage loginPage;

    @Parameters({"browser"})
    @BeforeMethod
    public void setup(String browserName) throws IOException {
        String url = DataFromPropertiesFile.getValueFromPropertyFile("url_qaClickAcademy");
        driver = initializeDriver(browserName);
        launchURL(driver, url);
        landingPage = new LandingPage(driver);
        loginPage = new LoginPage(driver);
        System.out.println("Printing Before Method of QAClickAcademy");
    }

    @Test(dataProvider = "getDataMethod")
    public void QAClickAcademyLogin(String email, String password) {
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
