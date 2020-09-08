package Tests;

import CommomUtil.BaseClass;
import CommomUtil.WebDriverFactory;
import Common.DataFromPropertiesFile;
import PageObjects.QAClickAcademy.ForgotPassword;
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
        WebDriverFactory.setWebDriver(driver);
        launchURL(driver, url);
        landingPage = new LandingPage();
        loginPage = landingPage.clickOnLoginButton();
        System.out.println("Printing Before Method of QAClickAcademy " + Thread.currentThread().getName());
    }

    @Test(dataProvider = "getDataMethod")
    public void QAClickAcademyLogin(String email, String password) {
        loginPage.performLoginOperation(email, password);
    }

    @Test(dataProvider = "getDataMethod")
    public void QAClickAcademyForgotPassword(String email, String password) {
        ForgotPassword forgotPassword = loginPage.clickOnForgotPassword();
        forgotPassword.EnterEmail(email);
        forgotPassword.clickOnSubmitButton();
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

        data[1][0] = "restrictedUser";
        data[1][1] = "password";
        return data;
    }

}
