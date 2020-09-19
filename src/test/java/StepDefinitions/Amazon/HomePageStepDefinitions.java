package StepDefinitions.Amazon;

import CommomUtil.BaseClass;
import CommomUtil.WebDriverFactory;
import Common.DataFromPropertiesFile;
import PageObjects.Amazon.HomePage;
import io.cucumber.java.en.Given;

import java.io.IOException;

public class HomePageStepDefinitions extends BaseClass {

    //public WebDriver driver;// = WebDriverFactory.getDriver();
    private HomePage homePage;

//    @Before
//    public void beforeSetup()  {
//        //String url = DataFromPropertiesFile.getValueFromPropertyFile("url_qaClickAcademy");
//        this.driver = initializeDriver("chrome");
//        WebDriverFactory.setWebDriver(driver);
//        System.out.println("This is executed");
//        //launchURL(driver, url);
//    }

    @Given("^User lands on Amazon Home Page$")
    public void user_lands_on_amazon_home_page() throws IOException {
        // this.driver = initializeDriver("chrome");
        // WebDriverFactory.setWebDriver(driver);
        System.out.println("This is executed");
        String url = DataFromPropertiesFile.getValueFromPropertyFile("url_amazon");
        System.out.println("URL = " + url);
        //launchURL(driver, url);
        launchURL(WebDriverFactory.getDriver(), url);
        System.out.println(url + " is launched");
        homePage = new HomePage();

    }

    @Given("^User searches for \"([^\"]*)\" book$")
    public void user_searches_for_something_book(String bookName) {
        homePage.searchBook(bookName);
    }
}
