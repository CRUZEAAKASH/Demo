package PageObjects.Amazon;

import CommomUtil.WebDriverFactory;
import PageObjects.AmazonPages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemsListPage {

    private final Logger logger = LogManager.getLogger(ItemsListPage.class.getName());

    private final WebDriver driver = WebDriverFactory.getDriver();
    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height']/img)[1]")
    private WebElement selectItem;

    public ItemsListPage() {
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void SelectItem() {
        selectItem.click();
        logger.debug("Clicked on button" + Thread.currentThread().getName());
    }
}
