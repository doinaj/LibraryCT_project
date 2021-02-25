@wip
Feature: User Group Category Feature
  Agile Story 9: As a librarian, I should be able to choose user categories and status

  Scenario: verify user categories

    Given the user login as a "librarian"
    When the user click users module
    And the user click User Group dropdown
    Then the user should see the following user group options

      | ALL       |
      | Librarian |
      | Students  |


  Scenario: verify user status

    Given the user login as a "librarian"
    When the user click users module
    And the user click Status dropdown
    Then the user should see the following status options

      | ACTIVE   |
      | INACTIVE |



