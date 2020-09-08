package PageObjects;

import CommomUtil.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.exit;

public class GreenKart {

    private static final WebDriver driver = WebDriverFactory.getDriver();

    public static void greenKartOperation() throws InterruptedException {
        String[] itemsNeeded = {"Cucumber", "Broccoli", "Beetroot"};
        //List itemsNeededList = Arrays.asList(itemsNeeded);
        List<String> itemsNeededList = new LinkedList<>(Arrays.asList(itemsNeeded));
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            final String vegName = products.get(i).getText().split(" ")[0];
            if (itemsNeededList.contains(vegName)) {
                System.out.println("Veg Name = " + vegName + "    " + Thread.currentThread().getName());
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                itemsNeededList.remove(vegName);
                if (itemsNeededList.size() == 0) {
                    break;
                }
            }
        }
        driver.findElement(By.cssSelector("a.cart-icon")).click();
        driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
        driver.findElement(By.className("promoCode")).clear();
        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("promoBtn")).click();

        String promoText = driver.findElement(By.className("promoInfo")).getText();
        if (promoText.equals("Code applied ..!")) {
            System.out.println("True    " + Thread.currentThread().getName());
        } else {
            exit(1);
        }

        //Click on place Order
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='promoWrapper']/parent::div/button")));
        driver.findElement(By.xpath("//*[@class='promoWrapper']/parent::div/button")).click();

        Select select = new Select(driver.findElement(By.xpath("//select")));
        select.selectByVisibleText("India");

        //Select checkbox
        driver.findElement(By.className("chkAgree")).click();

        Thread.sleep(3000);
        //Click on Proceed
        driver.findElement(By.xpath("//button")).click();
    }
}
