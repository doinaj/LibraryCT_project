Feature: Librarian, I should be able to see
  book records on user page

  Background:
    Given User open "Library" page

  Scenario Outline: Scenaroi 1
    Then User login as "librarian"
    And User click on the "Books" module
    And User verify that default record is 10
    And User verify that show record for "<count>"options
    Examples:
      | count |
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |


  Scenario:
    Then User login as "librarian"
    And User click on the "Books" module
    And User verify that default record is 10
