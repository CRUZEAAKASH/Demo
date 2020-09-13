package StepDefinitions.Amazon;

import PageObjects.Amazon.ItemsListPage;
import io.cucumber.java.en.And;

public class ItemsListPageSteps {

    private ItemsListPage itemsListPage = new ItemsListPage();

    @And("^User select the first book from the list$")
    public void user_select_the_first_book_from_the_list() {
        itemsListPage.SelectItem();
    }
}
