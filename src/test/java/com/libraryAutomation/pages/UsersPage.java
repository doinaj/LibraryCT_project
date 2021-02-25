package com.libraryAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;
import java.util.List;

public class UsersPage extends BasePage{
    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement recordsSelectDropDown;

    @FindBy(xpath = "//table[@id='tbl_users']/thead/tr/th")
    public List<WebElement> tableHeaders;

    @FindBy(id ="user_groups" )
    public WebElement userGroupsDropDown;

    @FindBy(id ="user_status" )
    public WebElement statusDropDown;
}
