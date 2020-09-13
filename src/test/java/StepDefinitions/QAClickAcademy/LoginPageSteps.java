package StepDefinitions.QAClickAcademy;

import CommomUtil.BaseClass;
import PageObjects.QAClickAcademy.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class LoginPageSteps extends BaseClass {

    private LoginPage loginPage = new LoginPage();

    @Then("^User enters \"([^\"]*)\" as UserName and \"([^\"]*)\" as Password$")
    public void user_enters_something_as_username_and_something_as_password(String email, String password) {
        loginPage.performLoginOperation(email, password);
        System.out.println("UserName and Password has been entered");
    }

    @Then("^User enters UserName and Password$")
    public void user_enters_username_and_password(DataTable dataTable) {
        String email = dataTable.asList().get(0);
        String password = dataTable.asList().get(1);
        loginPage.performLoginOperation(email, password);
    }

    @Then("^User clicks on Forgot Password$")
    public void user_clicks_on_forgot_password() {
        loginPage.clickOnForgotPassword();
    }
}
