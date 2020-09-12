package StepDefinitions.Amazon;

import PageObjects.Amazon.ItemDetailsPage;
import io.cucumber.java.en.Then;

public class ItemDetailsStepDefinition {

    private ItemDetailsPage itemsDetailsPage = new ItemDetailsPage();

    @Then("^User clicks on \"([^\"]*)\" button to add add items into cart$")
    public void user_clicks_on_button_to_add_add_items_into_cart(String strArg1) throws Throwable {
        itemsDetailsPage.clickAddToCartButton();
    }
}
