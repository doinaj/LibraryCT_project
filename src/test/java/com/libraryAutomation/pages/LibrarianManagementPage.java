package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.WeakHashMap;

public class LibrarianManagementPage extends LoginPage{
    //User Story 10.5
    @FindBy(xpath = "//a[@href='#users']")
    public WebElement usersLinkButton;


    @FindBy(xpath = "//table/thead/tr/th")
    public List<WebElement> listOfUserHeaders;

    public void verifyUserTableHeader(List<String> expectedTHeaders){
        List<String> actualTHeaders= BrowserUtils.getElementText(listOfUserHeaders);

        Assert.assertEquals(expectedTHeaders,actualTHeaders);

    }


}
