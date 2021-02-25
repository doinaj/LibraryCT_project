package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.pages.SearchPage;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Books_Search_StepDefinition {


    @Given("Student is on Book Management page")
    public void student_is_on_book_management_page() {

        Driver.getDriver().get("https://library1.cybertekschool.com/#books");

    }
    @When("Student search for  books categories")
    public void student_search_for_books_categories() {


    }
    @When("Student can select {string} from Book Categories and click")
    public void student_can_select_from_book_categories_and_click(String string) {


    }
    @When("Student can select {string} and click")
    public void student_can_select_and_click(String string) {

    }






}



