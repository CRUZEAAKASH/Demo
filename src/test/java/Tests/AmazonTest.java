package Tests;

import CommomUtil.BaseClass;
import Pages.AmazonPages;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class AmazonTest extends BaseClass {

    WebDriver driver;
    // BaseClass baseClass;
    AmazonPages amazonPages;

    @Parameters({"browser"})
    @BeforeTest
    public void settingUpDriver(String browserName) {
        //baseClass = new BaseClass();
        driver = initializeDriver(browserName);
        amazonPages = new AmazonPages(driver);
    }

    @Test(dataProvider = "getDataMethod")
    public void amazonTest(String URL) {
        launchURL(driver, URL);
        getTitle(driver);
        amazonPages.amazonOperations(driver);

    }

    @AfterTest
    public void tearDownDriver() {
        System.out.println("Executing Tear Down");
        tearDownDriver(driver);
    }

    @DataProvider
    public Object[] getDataMethod() {

        // To get the list of Browsers on which Action need to be performed
        Object[] data = new Object[1];
        data[0] = "https://www.amazon.com/";
        return data;
    }
}
