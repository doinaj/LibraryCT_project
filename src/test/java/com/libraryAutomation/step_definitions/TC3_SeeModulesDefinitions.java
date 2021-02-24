package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.LandingPages;
import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class TC3_SeeModulesDefinitions {

    LoginPage loginPage=new LoginPage();
    LandingPages landingPages =new LandingPages();


    @Given("the {string} on the home page")
    public void the_on_the_home_page(String role) {

        loginPage.loginAs(role);
    }

    @Then("the user should see following modules")
    public void the_user_should_see_following_modules(List<String> modules) {
        landingPages.verifyModules(modules);
        Driver.closeDriver();


    }
}