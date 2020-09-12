package PageObjects.Amazon;

import CommomUtil.WebDriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    private final Logger logger = LogManager.getLogger(SignInPage.class.getName());

    private final WebDriver driver = WebDriverFactory.getDriver();

    @FindBy(css = "input#ap_email")
    private WebElement loginEmail;
    @FindBy(css = "#continue")
    private WebElement continueButton;
    @FindBy(css = "#ap_password")
    private WebElement password;

    public SignInPage() {
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmailId() {
        loginEmail.sendKeys("abc@gmail.com");
        logger.debug("Sent Email Id" + Thread.currentThread().getName());
        continueButton.click();
        logger.info("Clicked on Continue button" + Thread.currentThread().getName());

    }

    public void enterPassword() {
        password.sendKeys("12345679");
        logger.debug("Some random password sent" + Thread.currentThread().getName());
    }
}
