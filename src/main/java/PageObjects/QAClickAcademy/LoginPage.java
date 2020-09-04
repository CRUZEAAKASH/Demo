package PageObjects.QAClickAcademy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    @FindBy(xpath = "//*[@id='user_email']")
    private WebElement emailLocator;

    @FindBy(xpath = "//*[@id='user_password']")
    private WebElement passwordLocator;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement login;

    @FindBy(xpath = "//a[@class='link-below-button']")
    private WebElement forgotPassword;

    private WebDriver driver;

    private final Logger logger = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void performLoginOperation(String email, String password) {
        logger.info("Email box is identified");
        emailLocator.sendKeys(email);
        logger.debug("Keys Entered in Email box");
        logger.info("Password box is identified");
        passwordLocator.sendKeys(password);
        logger.debug("Keys entered in password box");
        logger.info("login button is identified");
        login.click();
        logger.debug("login button is clicked");
    }

    public ForgotPassword clickOnForgotPassword(){
        forgotPassword.click();
        return new ForgotPassword(driver);
    }


}
