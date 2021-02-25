package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Landing_SteepDefinitions {
    LandingPage landingPage = new LandingPage();

    @Then("User click on the {string} module")
    public void user_click_on_the_module(String module) {
        landingPage.clickOnModule(module);
    }


    @And("User verify that default record is {int}")
    public void userVerifyThatDefaultRecordIs(int count) {
        String selectedByDefault = new Select(landingPage.selectRecords).getFirstSelectedOption().getText();
        Assert.assertEquals(count + "", selectedByDefault);
    }

    @And("User verify that show record for {string}options")
    public void userVerifyThatShowRecordForOptions(String options) throws InterruptedException {
        new Select(landingPage.selectRecords).selectByValue(options);
        String actual = new Select(landingPage.selectRecords).getFirstSelectedOption().getText();
        Assert.assertEquals(actual, options);
    }
}
