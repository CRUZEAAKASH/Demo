package Tests;

import CommomUtil.BaseClass;
import Pages.AmazonPages;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class AmazonTest {

    WebDriver driver;
    BaseClass baseClass;

    @Parameters({"browser"})
    @BeforeTest
    public void settingUpDriver(String browserName) {
        baseClass = new BaseClass();
        driver = baseClass.initializeDriver(browserName);
    }

    @Test(dataProvider = "getDataMethod")
    public void amazonTest(String URL) {
        baseClass.launchURL(driver, URL);
        baseClass.getTitle(driver);
        AmazonPages.amazonOperations(driver);

    }

    @AfterTest
    public void tearDownDriver() {
        System.out.println("Executing Tear Down");
        baseClass.tearDownDriver(driver);
    }

    @DataProvider
    public Object[] getDataMethod() {

        // To get the list of Browsers on which Action need to be performed
        Object[] data = new Object[1];
        data[0] = "https://www.amazon.com/";
        return data;
    }
}
