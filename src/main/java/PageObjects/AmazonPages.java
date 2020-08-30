package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AmazonPages {

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height']/img)[1]")
    private WebElement selectItem;

    @FindBy(css = "input#checkout-button")
    private WebElement checkOutButton;

    @FindBy(css = "input#ap_email")
    private WebElement loginEmail;

    @FindBy(css = "#continue")
    private WebElement continueButton;

    @FindBy(css = "#ap_password")
    private WebElement password;

    private WebDriver driver;

    private final Logger logger = Logger.getLogger(AmazonPages.class.getName());

    public AmazonPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void amazonOperations() {
        searchBox.sendKeys("a thousand splendid suns");
        logger.info("Entered text in the textBox");
        searchBox.sendKeys(Keys.ARROW_DOWN);
        logger.info("Press down keys");
        searchBox.submit();
        logger.info("Click the submit button");
        selectItem.click();
        logger.info("Clicked on button");
        checkOutButton.click();
        logger.info("Clicked on Checkout Button");
        loginEmail.sendKeys("abc@gmail.com");
        logger.info("Sent Email Id");
        continueButton.click();
        logger.info("Clicked on Continue button");
        password.sendKeys("12345679");
        logger.info("Some random password sent");
    }
}
