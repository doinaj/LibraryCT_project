package com.libraryAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUsersPage extends BasePage {

    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement usersButton;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement addUserButton;

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement fullNameInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//button[.='Save changes']")
    public WebElement saveChangesButton;

    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement lastNameInTable;

}
