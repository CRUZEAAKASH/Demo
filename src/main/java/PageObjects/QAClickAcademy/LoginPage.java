package PageObjects.QAClickAcademy;

import CommomUtil.WebDriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    private final Logger logger = LogManager.getLogger(LoginPage.class.getName());
    @FindBy(xpath = "//*[@id='user_email']")
    private WebElement emailLocator;
    @FindBy(xpath = "//*[@id='user_password']")
    private WebElement passwordLocator;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement login;
    @FindBy(xpath = "//a[@class='link-below-button']")
    private WebElement forgotPassword;

    private final WebDriver driver = WebDriverFactory.getDriver();

    public LoginPage() {
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void performLoginOperation(String email, String password) {
        logger.info("Email box is identified " + Thread.currentThread().getName());
        emailLocator.sendKeys(email);
        logger.debug("Keys Entered in Email box " + Thread.currentThread().getName());
        logger.info("Password box is identified " + Thread.currentThread().getName());
        passwordLocator.sendKeys(password);
        logger.debug("Keys entered in password box " + Thread.currentThread().getName());
        logger.info("login button is identified " + Thread.currentThread().getName());
        login.click();
        logger.debug("login button is clicked " + Thread.currentThread().getName());
    }

    public ForgotPassword clickOnForgotPassword() {
        forgotPassword.click();
        return new ForgotPassword();
    }


}
