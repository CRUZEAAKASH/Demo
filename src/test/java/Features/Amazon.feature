Feature: To test the functionality of Amazon

  Scenario: To search a novel, add it to basket and reach till login Page
    Given User lands on Amazon Home Page
    And User searches for "a thousand splendid suns" book
    And User select the first book from the list
    Then User clicks on "Add to Cart" button to add add items into cart
    Then User clicks on "Proceed to checkout" button
    Then User enters EmailId
    Then User enters password
    Then Close the Browser

