Feature: Checking the table headers from the Book Management page
  As a student I should be able to see the table headers

#  user story 6
  @StudentTableHeaders
  Scenario: Table columns names

    Given the student is on the homepage
    Then the student should see the following column names:
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |


    #    user story 10.5
  @LibrarianTableHeaders
  Scenario: user management table columns names

    Given the librarian is on the homepage
    When the librarian click users module
    Then the librarian should see the following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |


