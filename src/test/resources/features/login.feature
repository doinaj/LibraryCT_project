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


  Scenario Outline: verify user information <email>
    Given the user is on login page
    When the user login using "<email>" and "<password>"
    Then account holder name should be "<name>"
    Examples:
      | email               | password | name              |
      | student136@library  | oKpgJXle | Test Student 136  |
      | student137@library  | o6JnXwlf | Test Student 137  |
      | student138@library  | QiAdgS4z | Test Student 138  |
      | librarian67@library | 5ktpB2e5 | Test Librarian 67 |

  Scenario Outline: Verify Error message for mandatory fields
    Given the user is on login page
    When the user login using "<email>" and "<password>"
    #invalid email and password
    And click submit button
    Then Error message displayed as "<error>"

    Examples:
      | email               | password | error                              |
      | student136library   | oKpgJXle | Please enter a valid email address |
      | student136@librar   | oKpgJXle | Sorry, Wrong Email or Password     |
      | 12345997@library    | o6JnXwlf | Sorry, Wrong Email or Password     |
      |                     | o6JnXwlf | This field is required.            |
      | librarian@library   | bJRnAAyp | Sorry, Wrong Email or Password     |
      | student136@library  | o6JnXwlf | Sorry, Wrong Email or Password     |
      | librarian67@library | QiAdgS4z | Sorry, Wrong Email or Password     |
      | student137@library  | 32432432 | Sorry, Wrong Email or Password     |
      | student138@library  |          | Sorry, Wrong Email or Password     |
      |                     |          | This field is required.            |