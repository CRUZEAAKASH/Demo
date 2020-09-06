Feature: To test the functionality of QAClick Academy

  Scenario: To test login functionality
    Given User is on Home Page
    Then User clicks on Login Button
    Then User enters "" as UserName and "" as Password

  Scenario: To Test Forgot Password Functionality
    Given User in on Home Page
    When User clicks on Login Button
    Then User clicks on Forgot Password
    Then User enters "" as Email
    Then User clicks on Submit button