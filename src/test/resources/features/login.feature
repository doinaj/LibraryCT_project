Feature: Login
  Agile Story: As a user, I should be able to login to the library app.
  @Login
  Scenario Outline: Verify both students and librarian can login
    Given the user login as a "<role>"
    Then the user is on "<page>" page
    Examples:
      | role      | page      |
      | student   | books     |
      | librarian | dashboard |

