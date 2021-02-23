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
      | full name    | password  | email               | full name    |
      | Nikola Lale  | bezgaa1je | ospremDobro@dodz.com | Nikola Lale  |
      | Bata Mladjko | fgazgajee | sudzakSator@dodz.com | Bata Mladjko |
