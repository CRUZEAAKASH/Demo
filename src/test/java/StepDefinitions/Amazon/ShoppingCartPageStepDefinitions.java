package StepDefinitions.Amazon;

import PageObjects.Amazon.ShoppingCartPage;
import io.cucumber.java.en.Then;

public class ShoppingCartPageStepDefinitions {

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Then("^User clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_something_button(String strArg1) {
        shoppingCartPage.clickOnCheckoutButton();
    }
}
