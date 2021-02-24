@wip
Feature: User able to see several modules
  As a user ,I should able to see several modules




  Scenario: Students should have access to 2 modules
  Given the user login as a "student"
  Then the user should see following modules
  | Books            |
  | Borrowing Books  |


  Scenario: Librarians  should have access to 3 modules
  Given the user login as a "librarian"
  Then the user should see following modules
  | Dashboard            |
  | Books                |
  | Borrowing Books      |
