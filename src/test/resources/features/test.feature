Feature: Solstice Challenge
  As a Customer when I search for Alexa, I want to see if the third option on the second page is available for purchase and can be added to the cart.

  Background:
    Given the user navigates to amazon.com

  @Test
  Scenario: Navigate to Amazon and search Alexa.
    And Searches for Alexa
    And navigates to the second page



