package StepDefinitions.QAClickAcademy;

import CommomUtil.BaseClass;
import CommomUtil.WebDriverFactory;
import Common.DataFromPropertiesFile;
import PageObjects.QAClickAcademy.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class LandingPageSteps extends BaseClass {

    //  public WebDriver driver;
    private LandingPage landingPage;


//    @Before
//    public void beforeSetup() throws IOException {
//
//        this.driver = initializeDriver("chrome");
//        WebDriverFactory.setWebDriver(driver);
//
//    }

    @Given("^User is on Home Page$")
    public void user_is_on_home_page() throws IOException {
        // this.driver = initializeDriver("chrome");
        // WebDriverFactory.setWebDriver(driver);
        String url = DataFromPropertiesFile.getValueFromPropertyFile("url_qaClickAcademy");
        // launchURL(driver, url);
        launchURL(WebDriverFactory.getDriver(), url);
        landingPage = new LandingPage();
        System.out.println("User has been landed on Home Page");
    }

    @Then("^User clicks on Login Button$")
    public void user_clicks_on_login_button() {
        landingPage.clickOnLoginButton();
        System.out.println("Login Button Clicked");
    }

    @Then("^Close the Browser$")
    public void close_the_browser() {
        //tearDownDriver(WebDriverFactory.getDriver());
        System.out.println("Browser is closed now");
    }


}
