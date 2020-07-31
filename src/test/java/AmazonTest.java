import CommomUtil.BaseClass;
import Pages.AmazonPages;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonTest {

    WebDriver driver;
    BaseClass baseClass;

    @Parameters({"browser"})
    @BeforeTest
    public void settingupDriver(String browserName) {
        baseClass = new BaseClass();
        driver = baseClass.initializeDriver(browserName);
    }

    @Test
    public void amazonTest() {
        baseClass.launchURL(driver, "https://www.amazon.com/");
        baseClass.getTitle(driver);
        AmazonPages.amazonOperations(driver);
    }

    @AfterTest
    public void tearDownDriver() {
        System.out.println("Executing Tear Down");
        baseClass.tearDownDriver(driver);
    }
}
