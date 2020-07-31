import CommomUtil.BaseClass;
import Pages.GreenKart;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GreenKartTest {

    WebDriver driver;
    BaseClass baseClass;

    @Parameters({"browser"})
    @BeforeTest
    public void settingupDriver(String browserName) {
        baseClass = new BaseClass();
        driver = baseClass.initializeDriver(browserName);
    }

    @Test
    public void greenKartTestToBeExcluded() throws InterruptedException {
        System.out.println("Dummy Code as this method will not be Executed");
    }

    @Test
    public void greenKartTest() throws InterruptedException {
        baseClass.launchURL(driver, "https://rahulshettyacademy.com/seleniumPractise");
        baseClass.getTitle(driver);
        GreenKart.greenKartOperation(driver);
    }

    @AfterTest
    public void tearDownDriver() {
        System.out.println("Executing Tear Down");
        baseClass.tearDownDriver(driver);
    }
}
