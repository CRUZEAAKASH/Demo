package Pages;

import CommomUtil.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        WebDriver driver = baseClass.initializeDriver("Chrome");
        baseClass.launchURL(driver, "https://www.amazon.com/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
    }
}
