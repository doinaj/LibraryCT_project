package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.LandingPages;
import com.libraryAutomation.utilities.BrowserUtils;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StepDefinitions {
    LandingPages landingPages = new LandingPages();

    @When("the user click  user account")
    public void the_user_click_user_account() {
        BrowserUtils.waitForVisibility(landingPages.accountUserName);
        landingPages.accountUserName.click();
    }

    @When("click log out button")
    public void click_log_out_button() {
        landingPages.logoutLink.click();
    }
    @Then("the user return to login page")
    public void the_user_return_to_login_page() {
        BrowserUtils.waitUntilURLContains("login");

        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualURL.contains("login"));
    }
}
