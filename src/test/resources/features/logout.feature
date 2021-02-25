Feature: Logout Functionality
  Agile story: 2. As a user, I should be able to logout from the library app.
  @logout
 Scenario Outline: Verify both student and librarian can logout
    Given the user login as a "<role>"
    When the user click  user account
    And click log out button
    Then the user return to login page
    Examples:
      | role      |
      | student   |
      | librarian |
