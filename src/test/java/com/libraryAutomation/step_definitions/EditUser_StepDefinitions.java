package com.libraryAutomation.step_definitions;

import com.github.javafaker.Faker;
import com.libraryAutomation.pages.AddUsersPage;
import com.libraryAutomation.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class EditUser_StepDefinitions {

    AddUsersPage addUsersPage = new AddUsersPage();
    Faker faker = new Faker();

    @When("Librarian click's on the edit User button")
    public void librarian_click_s_on_the_edit_user_button() {
      addUsersPage.editUserButton.click();
    }

    @When("Edits {string} to new full name")
    public void edits_to_new_full_name(String string) {
        BrowserUtils.sleep(2);
        addUsersPage.fullNameInput.clear();
        BrowserUtils.sleep(2);
        addUsersPage.fullNameInput.sendKeys(string);
    }
    @When("Edits {string} to new email")
    public void edits_to_new_email(String string) {
        addUsersPage.emailInput.clear();
        BrowserUtils.sleep(1);
        addUsersPage.emailInput.sendKeys(faker.internet().emailAddress());
    }



}
