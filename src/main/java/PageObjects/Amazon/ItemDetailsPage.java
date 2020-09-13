package PageObjects.Amazon;

import CommomUtil.WebDriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemDetailsPage {

    private final Logger logger = LogManager.getLogger(ItemDetailsPage.class.getName());

    private final WebDriver driver = WebDriverFactory.getDriver();

    @FindBy(css = "input#add-to-cart-button")
    private WebElement addToCartButton;

    public ItemDetailsPage() {
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
        logger.info("Clicked on Add To Cart Button" + Thread.currentThread().getName());
    }
}
