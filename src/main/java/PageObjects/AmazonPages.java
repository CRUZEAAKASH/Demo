package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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

    private final Logger logger = LogManager.getLogger(AmazonPages.class.getName());

    public AmazonPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void amazonOperations() {
        searchBox.sendKeys("a thousand splendid suns");
        logger.debug("Entered text in the textBox");
        searchBox.sendKeys(Keys.ARROW_DOWN);
        logger.debug("Press down keys");
        searchBox.submit();
        logger.info("Click the submit button");
        selectItem.click();
        logger.debug("Clicked on button");
        checkOutButton.click();
        logger.info("Clicked on Checkout Button");
        loginEmail.sendKeys("abc@gmail.com");
        logger.debug("Sent Email Id");
        continueButton.click();
        logger.info("Clicked on Continue button");
        password.sendKeys("12345679");
        logger.debug("Some random password sent");
    }
}
