package PageObjects;

import CommomUtil.WebDriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AmazonPages {

    private final Logger logger = LogManager.getLogger(AmazonPages.class.getName());
    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchBox;
    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height']/img)[1]")
    private WebElement selectItem;
    @FindBy(css = "input#add-to-cart-button")
    private WebElement addToCartButton;
    @FindBy(xpath = "//a[@id='hlb-ptc-btn-native']")
    private WebElement checkoutButton;
    @FindBy(css = "input#ap_email")
    private WebElement loginEmail;
    @FindBy(css = "#continue")
    private WebElement continueButton;
    @FindBy(css = "#ap_password")
    private WebElement password;

    private final WebDriver driver = WebDriverFactory.getDriver();

    public AmazonPages() {
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void amazonOperations() {
        searchBox.sendKeys("a thousand splendid suns");
        logger.debug("Entered text in the textBox" + Thread.currentThread().getName());
        searchBox.sendKeys(Keys.ARROW_DOWN);
        logger.debug("Press down keys" + Thread.currentThread().getName());
        searchBox.submit();
        logger.info("Click the submit button" + Thread.currentThread().getName());
        selectItem.click();
        logger.debug("Clicked on button" + Thread.currentThread().getName());
        addToCartButton.click();
        logger.info("Clicked on Add To Cart Button" + Thread.currentThread().getName());
        logger.info("Click on Checkout Button" + Thread.currentThread().getName());
        checkoutButton.click();
        logger.debug("Clicked on checkout button" + Thread.currentThread().getName());
        loginEmail.sendKeys("abc@gmail.com");
        logger.debug("Sent Email Id" + Thread.currentThread().getName());
        continueButton.click();
        logger.info("Clicked on Continue button" + Thread.currentThread().getName());
        password.sendKeys("12345679");
        logger.debug("Some random password sent" + Thread.currentThread().getName());
    }
}
