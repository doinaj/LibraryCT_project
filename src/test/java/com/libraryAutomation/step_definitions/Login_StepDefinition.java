package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.utilities.BrowserUtils;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_StepDefinition {

    LoginPage loginPage = new LoginPage();

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






}
