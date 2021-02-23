package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.AddUsersPage;
import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.utilities.BrowserUtils;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddUsers_StepDefinition {

    LoginPage loginPage = new LoginPage();
    AddUsersPage addUsersPage = new AddUsersPage();


    @Given("Librarian is logged into the library and it's on the dashboard")
    public void librarian_is_logged_into_the_library_and_it_s_on_the_dashboard() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginAs("librarian");
    }

    @When("Librarian click's on Users module")
    public void librarian_click_s_on_users_module() {
        addUsersPage.usersButton.click();
    }
    @When("Librarian click's on the add User button")
    public void librarian_click_s_on_the_add_user_button() {
        addUsersPage.addUserButton.click();
    }
    @When("Fills out the form as followed from the table below:")
    public void fills_out_the_form_as_followed_from_the_table_below() {
    }
    @When("Enters {string} to full name")
    public void enters_to_full_name(String string) {
        addUsersPage.fullNameInput.sendKeys(string);
    }
    @When("Enters {string} to password")
    public void enters_to_password(String string) {
        addUsersPage.passwordInput.sendKeys(string);
    }
    @When("Enters {string} to email")
    public void enters_to_email(String string) {
        addUsersPage.emailInput.sendKeys(string);
    }
    @When("Click's on the Save Changes button")
    public void click_s_on_the_save_changes_button() {
        addUsersPage.saveChangesButton.click();
    }
    @Then("Librarian verifies {string} is in the list")
    public void librarian_verifies_is_in_the_list(String string) {
        BrowserUtils.sleep(3);
        String actualNameInTheTable = addUsersPage.lastNameInTable.getText();
        Assert.assertTrue(actualNameInTheTable.equals(string));
    }



}
