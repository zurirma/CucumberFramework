Feature: Ejemplo The Free Range Tester

  Background:
    Given I am on the Google search page

  @Test
  Scenario: Navigate to Google and Search a keyword.
    Given I am on the Google search page
    When I enter a word in the search field:
    Then I see results related to the word entered

 