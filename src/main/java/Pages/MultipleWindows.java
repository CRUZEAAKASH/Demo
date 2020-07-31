package Pages;

import CommomUtil.BaseClass;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class MultipleWindows {

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        WebDriver driver = baseClass.initializeDriver("firefox");
        baseClass.launchURL(driver, "https://accounts.google.com/signup");
        baseClass.getTitle(driver);
        Set<String> getWindowHandles = driver.getWindowHandles();
        System.out.println("size of Window handles = " + getWindowHandles.size());
        baseClass.tearDownDriver(driver);
    }
}
