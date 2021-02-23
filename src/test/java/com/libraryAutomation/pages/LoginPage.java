package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.BrowserUtils;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{


    @FindBy(id="inputEmail")
    public WebElement inputEmailBox;
    @FindBy(id="inputPassword")
    public WebElement inputPasswordBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement errorMessage;
    public void login(String username, String password){
        LoginPage loginPage = new LoginPage();
        loginPage.inputEmailBox.sendKeys(username);
        loginPage.inputPasswordBox.sendKeys(password);
        BrowserUtils.waitUntilClickable(signInButton).click();
    }
    public void loginAs(String role){
        String username;
        String password;
        if(role.equalsIgnoreCase("student")){
            username = ConfigurationReader.getProperty("studentUsername");
            password= ConfigurationReader.getProperty("studentPassword");
            login(username, password);
        } else if(role.equalsIgnoreCase("librarian")){
            username = ConfigurationReader.getProperty("librarianUsername");
            password = ConfigurationReader.getProperty("librarianPassword");
            login(username, password);
        } else{
            throw new RuntimeException("Invalid user type!");
        }
    }
}
