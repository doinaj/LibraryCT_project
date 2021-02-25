package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.LandingPages;
import com.libraryAutomation.pages.UsersPage;
import com.libraryAutomation.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserCategory_StepDefinitions {
    LandingPages landingPages = new LandingPages();
    UsersPage usersPage = new UsersPage();

    @When("the user click users module")
    public void the_user_click_users_module() {
        landingPages.usersLink.click();

    }

    @When("the user click User Group dropdown")
    public void the_user_click_user_group_dropdown() {
       usersPage.userGroupsDropDown.click();
    }


    @When("the user click Status dropdown")
    public void the_user_click_status_dropdown() {
        usersPage.statusDropDown.click();

    }

    @Then("the user should see the following user group options")
    public void theUserShouldSeeTheFollowingUserGroupOptions(List<String> expectedOptions) {
        Select select = new Select(usersPage.userGroupsDropDown);
        List<WebElement> actualOptions = select.getOptions();
        List<String> actualOptionTexts=  BrowserUtils.getElementText(actualOptions);

        Assert.assertEquals(actualOptionTexts, expectedOptions);
    }

    @Then("the user should see the following status options")
    public void theUserShouldSeeTheFollowingStatusOptions(List<String> expectedOptions) {
        Select select = new Select(usersPage.statusDropDown);
        List<WebElement> actualOptions = select.getOptions();
        List<String> actualOptionTexts=  BrowserUtils.getElementText(actualOptions);

        Assert.assertEquals(actualOptionTexts, expectedOptions);
    }
}
