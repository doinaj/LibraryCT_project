@MiniRegresion

Feature: Add Users
  User story: As a librarian i should be able to add users from users page

  @addUsers
  Scenario Outline: Librarian adds new users
    Given Librarian is logged into the library and it's on the dashboard
    When Librarian click's on Users module
    And Librarian click's on the add User button
    And Fills out the form as followed from the table below:
    And Enters "<full name>" to full name
    And Enters "<password>" to password
    And Enters "<email>" to email
    And Click's on the Save Changes button
    Then Librarian verifies "<full name>" is in the list

    Examples:
      | full name    | password   | full name    |
      | Nikola Lale  | bezgaa1je  | Nikola Lale  |
      | Bata Mladjko | fgazgajee  | Bata Mladjko |
      | Duca Tonic   | fsazgajee  | Duca Tonic   |
      | Bata Backo   | fgazg131ee | Bata Backo   |

  @editUsers
  Scenario Outline: Librarian can edit user info verification

    Given Librarian is logged into the library and it's on the dashboard
    When Librarian click's on Users module
    And Librarian click's on the edit User button
    And Edits "<full name>" to new full name
    And Edits "<email>" to new email
    And Click's on the Save Changes button
    Then Librarian verifies "<full name>" is in the list

    Examples:
      | full name       |
      | Jovan Jovanovic |

  @closeAddUser
  Scenario Outline: Librarian can close add user window with close button
    Given Librarian is logged into the library and it's on the dashboard
    When Librarian click's on Users module
    And Librarian click's on the add User button
    And Librarian click's on close button
    Then Librarian verifies "<header>" on the dashboard

    Examples:
      | header          |
      | User Management |