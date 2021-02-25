Feature: Search books
  As a students, I should be able to search books with different categories.

  @Books
  Scenario Outline: Student search different books categories
    Given Student is on Book Management page
    When Student search for  books categories
    And Student can select "<ALL>" from Book Categories and click
    And Student can select "<Action and Adventure>" and click
    And Student can select "<Anthology>" and click
    And Student can select "<Classic>" and click
    And Student can select "<Comic and Graphic Novel>" and click
    And Student can select "<Crime and Detective>" and click
    And Student can select "<Drama>" and click
    And Student can select "<Fable>" and click
    And Student can select "<Fairy Tale>" and click
    And Student can select "<Fan-Fiction>" and click
    And Student can select "<Fantasy>" and click
    And Student can select "<Historical Fiction>" and click
    And Student can select "<Horror>" and click
    And Student can select "<Science Fiction>" and click
    And Student can select "<Biography/Autobiography>" and click
    And Student can select "<Humor>" and click
    And Student can select "<Romance>" and click
    And Student can select "<Short Story>" and click
    And Student can select "<Essay>" and click
    And Student can select "<Memoir>" and click
    And Student can select "<Poetry>" and click

    Examples:
    | ALL                    |
    | Action and Adventure   |
    | Anthology              |
    | Classic                |
    | Comic and Graphic Novel|
    | Crime and Detective    |
    | Drama                  |
    | Fable                  |
    | Fairy Tale             |
    | Fan-Fiction            |
    | Fantasy                |
    | Historical Fiction     |
    | Horror                 |
    | Science Fiction        |
    | Biography/Autobiography|
    | Humor                  |
    | Romance                |
    | Short Story            |
    | Essay                  |
    | Memoir                 |
    | Poetry                 |





