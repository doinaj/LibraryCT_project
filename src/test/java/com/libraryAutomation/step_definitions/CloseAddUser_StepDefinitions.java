package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.AddUsersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CloseAddUser_StepDefinitions {

    AddUsersPage addUsersPage = new AddUsersPage();

    @When("Librarian click's on close button")
    public void librarian_click_s_on_close_button() {
        addUsersPage.closeButton.click();
    }

    @Then("Librarian verifies {string} on the dashboard")
    public void librarian_verifies_on_the_dashboard(String string) {
       String actualHeader = addUsersPage.userDashboardHeader.getText();
        Assert.assertTrue(actualHeader.equals(string));
    }

}
