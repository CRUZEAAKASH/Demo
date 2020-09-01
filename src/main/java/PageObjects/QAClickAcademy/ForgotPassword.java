package PageObjects.QAClickAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

    @FindBy(xpath = "//*[@id='user_email']")
    private WebElement emailLocator;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;

    private WebDriver driver;

    public ForgotPassword(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void EnterEmail(String email) {
        emailLocator.sendKeys(email);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }
}
