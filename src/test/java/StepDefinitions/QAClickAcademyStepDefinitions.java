package StepDefinitions;

import CommomUtil.BaseClass;
import Common.DataFromPropertiesFile;
import PageObjects.QAClickAcademy.ForgotPassword;
import PageObjects.QAClickAcademy.LandingPage;
import PageObjects.QAClickAcademy.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class QAClickAcademyStepDefinitions extends BaseClass {

    public WebDriver driver;
    private LandingPage landingPage;
    private LoginPage loginPage;
    private ForgotPassword forgotPassword;

    @Given("^User is on Home Page$")
    public void user_is_on_home_page() throws IOException {
        String url = DataFromPropertiesFile.getValueFromPropertyFile("url_qaClickAcademy");
        this.driver = initializeDriver("chrome");
        launchURL(driver, url);
        landingPage = new LandingPage(driver);
    }

    @Then("^User clicks on Login Button$")
    public void user_clicks_on_login_button() {
        loginPage = landingPage.clickOnLoginButton();
        System.out.println("Printing Before Method of QAClickAcademy");
    }

    @Then("^User enters \"([^\"]*)\" as UserName and \"([^\"]*)\" as Password$")
    public void user_enters_something_as_username_and_something_as_password(String email, String password) {
        loginPage.performLoginOperation(email, password);
    }

    @Then("^User clicks on Forgot Password$")
    public void user_clicks_on_forgot_password() {
        forgotPassword = loginPage.clickOnForgotPassword();

    }

    @Then("^User enters \"([^\"]*)\" as Email$")
    public void user_enters_something_as_email(String email) {
        forgotPassword.EnterEmail(email);

    }

    @Then("^User clicks on Submit button$")
    public void user_clicks_on_submit_button() {
        forgotPassword.clickOnSubmitButton();
    }

    @Then("^Close the Browser$")
    public void close_the_browser() {
        tearDownDriver(driver);
    }
}