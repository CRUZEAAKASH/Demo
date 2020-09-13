package PageObjects.Amazon;

import CommomUtil.WebDriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    private final Logger logger = LogManager.getLogger(ShoppingCartPage.class.getName());

    private final WebDriver driver = WebDriverFactory.getDriver();

    @FindBy(xpath = "//a[@id='hlb-ptc-btn-native']")
    private WebElement checkoutButton;

    public ShoppingCartPage() {
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnCheckoutButton() {
        logger.info("Click on Checkout Button" + Thread.currentThread().getName());
        checkoutButton.click();
        logger.debug("Clicked on checkout button" + Thread.currentThread().getName());
    }
}
