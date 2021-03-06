@QAClickAcademy
Feature: To test the functionality of QAClick Academy

  Background: User is on Logged in Page
    Given User is on Home Page
    Then User clicks on Login Button


  Scenario Outline: To test login functionality
    Then User enters "<Email>" as UserName and "<Password>" as Password
    Then Close the Browser
    Examples:
      | Email      | Password |
      | abc@qw.com | 123456   |

  Scenario: To Test Forgot Password Functionality
    Then User clicks on Forgot Password
    Then User enters "abc@qw.com" as Email
    Then User clicks on Submit button
    Then Close the Browser

  Scenario: To Test Forgot Password Functionality with DataTable Concept
    Then User clicks on Forgot Password
    Then User enters Email
      | abc@qw.com |
    Then User clicks on Submit button
    Then Close the Browser

  Scenario: To test login functionality with DataTable Concept
    Then User enters UserName and Password
      | abc@qw.com | 123456 |
    Then Close the Browser

