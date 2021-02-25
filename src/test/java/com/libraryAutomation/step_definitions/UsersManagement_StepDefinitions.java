package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.LibrarianManagementPage;
import com.libraryAutomation.pages.StudentManagementPage;
import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.utilities.BrowserUtils;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UsersManagement_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    StudentManagementPage studentManagementPage = new StudentManagementPage();
    LibrarianManagementPage librarianManagementPage = new LibrarianManagementPage();

    @Given("the student is on the homepage")
    public void the_student_is_on_the_homepage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginAs("student");
    }

    @Then("the student should see the following column names:")
    public void the_student_should_see_the_following_column_names(List<String> tableHeaders){

        studentManagementPage.verifyTableHeader(tableHeaders);
        System.out.println(tableHeaders);
        Driver.closeDriver();
    }

    ////////////
    @Given("the librarian is on the homepage")
    public void the_librarian_is_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginAs("librarian");
    }

    @When("the librarian click users module")
    public void the_librarian_click_users_module() {
        librarianManagementPage.usersLinkButton.click();
    }
    @Then("the librarian should see the following column names:")
    public void the_librarian_should_see_the_following_column_names(List<String> tableHeaders) {
        librarianManagementPage.verifyUserTableHeader(tableHeaders);
        System.out.println(tableHeaders);
        Driver.closeDriver();

    }



}
