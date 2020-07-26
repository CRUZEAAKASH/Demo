package Pages;

import CommomUtil.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GreenKart {

    public static void main(String[] args) throws InterruptedException {
        BaseClass baseClass = new BaseClass();
        WebDriver driver = baseClass.initalizeDriver("Chrome");
        baseClass.launchURL(driver, "https://rahulshettyacademy.com/seleniumPractise");
        baseClass.getTitle(driver);
        greenKartOperation(driver);
        Thread.sleep(2000);
        baseClass.tearDownDriver(driver);
    }

    public static void greenKartOperation(WebDriver driver) throws InterruptedException {
        String[] itemsNeeded = {"Cucumber", "Brocolli"};
        //List itemsNeededList = Arrays.asList(itemsNeeded);
        List<String> itemsNeededList = new LinkedList<>(Arrays.asList(itemsNeeded));
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            final String vegName = products.get(i).getText().split(" ")[0];
            if (itemsNeededList.contains(vegName)) {
                System.out.println("Veg Name = " + vegName);
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                itemsNeededList.remove(vegName);
                if (itemsNeededList.size() == 0) {
                    break;
                }
            }
        }
    }
}
