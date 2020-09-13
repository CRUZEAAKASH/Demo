package StepDefinitions.Amazon;

import PageObjects.Amazon.SignInPage;
import io.cucumber.java.en.Then;

public class SignInPageStepDefinitions {

    private SignInPage signInPage = new SignInPage();

    @Then("^User enters EmailId$")
    public void user_enters_emailid() {
        signInPage.enterEmailId();
    }

    @Then("^User enters password$")
    public void user_enters_password() {
        signInPage.enterPassword();
    }

}
