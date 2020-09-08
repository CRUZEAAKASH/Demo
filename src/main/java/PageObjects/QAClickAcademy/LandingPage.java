package PageObjects.QAClickAcademy;

import CommomUtil.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    @FindBy(xpath = "//a/span[text()='Login']")
    private WebElement login;

    private final WebDriver driver = WebDriverFactory.getDriver();

    public LandingPage() {
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickOnLoginButton() {
        login.click();
        return new LoginPage();
    }

}
