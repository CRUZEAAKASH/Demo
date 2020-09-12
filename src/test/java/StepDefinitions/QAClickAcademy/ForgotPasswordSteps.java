package StepDefinitions.QAClickAcademy;

import CommomUtil.BaseClass;
import PageObjects.QAClickAcademy.ForgotPassword;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class ForgotPasswordSteps extends BaseClass {

    private ForgotPassword forgotPassword = new ForgotPassword();



    @Then("^User enters \"([^\"]*)\" as Email$")
    public void user_enters_something_as_email(String email) {
        forgotPassword.EnterEmail(email);

    }

    @Then("^User enters Email$")
    public void user_enters_email(DataTable dataTable) {
        forgotPassword.EnterEmail(dataTable.toString());
    }

    @Then("^User clicks on Submit button$")
    public void user_clicks_on_submit_button() {
        forgotPassword.clickOnSubmitButton();
    }
}
