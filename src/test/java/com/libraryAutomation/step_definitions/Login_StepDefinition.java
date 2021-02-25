package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.LandingPages;
import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.utilities.BrowserUtils;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Locale;

public class Login_StepDefinition {

    LoginPage loginPage = new LoginPage();
    LandingPages landingPages = new LandingPages();

    @Given("the user login as a {string}")
    public void the_user_login_as_a(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginAs(string);

    }

    @Then("the user is on {string} page")
    public void the_user_is_on_page(String expectedPage) {
        BrowserUtils.waitUntilURLContains(expectedPage);
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedPage));
    }


    @Given("I open {string} page")
    public void iOpenPage(String page) {

        switch (page.toLowerCase(Locale.ROOT)) {
            case "library":
                loginPage.open();
                break;
            default:
                throw new RuntimeException("undefined page");
        }
    }

    @Then("User login as {string}")
    public void userLoginAs(String user) {
        loginPage.loginAs(user);
    }


    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user login using {string} and {string}")
    public void the_user_login_using_and(String username, String password) {
        loginPage.login(username, password);
    }
    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String expectedName) {
        System.out.println("expectedName = " + expectedName);
        BrowserUtils.waitForVisibility(landingPages.accountUserName);
        String actualName = landingPages.accountUserName.getText();
        System.out.println("actualName = " + actualName);
        Assert.assertTrue(actualName.equalsIgnoreCase(expectedName));
    }

    @And("click submit button")
    public void clickSubmitButton() {
        BrowserUtils.waitUntilClickable(loginPage.signInButton);
        loginPage.signInButton.click();
    }

    @Then("Error message displayed as {string}")
    public void errorMessageDisplayedAs(String error) {
        BrowserUtils.waitForVisibility(loginPage.errorMessage);
        String actualErrorMessage= loginPage.errorMessage.getText();
        Assert.assertTrue(actualErrorMessage.contains(error));
    }
}