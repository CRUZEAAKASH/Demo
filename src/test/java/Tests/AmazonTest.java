package Tests;

import CommomUtil.BaseClass;
import CommomUtil.WebDriverFactory;
import PageObjects.AmazonPages;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonTest extends BaseClass {

    public WebDriver driver;
    private AmazonPages amazonPages;

    //@Parameters({"browser"})
    @BeforeTest
    public void settingUpDriver() {
        String browserName = System.getProperty("browser");
        driver = initializeDriver(browserName);
        WebDriverFactory.setWebDriver(driver);
        amazonPages = new AmazonPages();
        System.out.println("Printing Before Test Method of AmazonTest " + Thread.currentThread().getName());
    }

    @Test(dataProvider = "getDataMethod")
    public void amazonTest(String URL) {
        launchURL(driver, URL);
        getTitle(driver);
        amazonPages.amazonOperations();
    }

    @AfterTest
    public void tearDownDriver() {
        System.out.println("Executing Tear Down " + Thread.currentThread().getName());
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
