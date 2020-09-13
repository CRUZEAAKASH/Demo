package PageObjects.Amazon;

import CommomUtil.WebDriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final Logger logger = LogManager.getLogger(HomePage.class.getName());

    private final WebDriver driver = WebDriverFactory.getDriver();

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchBox;

    public HomePage() {
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void searchBook(String text) {
        searchBox.sendKeys(text);
        logger.debug("Entered text in the textBox" + Thread.currentThread().getName());
        searchBox.sendKeys(Keys.ARROW_DOWN);
        logger.debug("Press down keys" + Thread.currentThread().getName());
        searchBox.submit();
        logger.info("Click the submit button" + Thread.currentThread().getName());
    }
}
