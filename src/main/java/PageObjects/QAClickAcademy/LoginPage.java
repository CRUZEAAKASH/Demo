package PageObjects.QAClickAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class LoginPage {

    @FindBy(xpath = "//*[@id='user_email']")
    private WebElement emailLocator;

    @FindBy(xpath = "//*[@id='user_password']")
    private WebElement passwordLocator;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement login;

    private WebDriver driver;

    private final Logger logger = Logger.getLogger(LoginPage.class.getName());

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void performLoginOperation(String email, String password) {
        logger.info("Email box is identified");
        emailLocator.sendKeys(email);
        logger.info("Keys Entered in Email box");
        logger.info("Password box is identified");
        passwordLocator.sendKeys(password);
        logger.info("Keys entered in password box");
        logger.info("login button is identified");
        login.click();
        logger.info("login button is clicked");

    }
}
