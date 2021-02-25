package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StudentManagementPage extends LoginPage{
    //User Story 6
    @FindBy(xpath = "//table/thead/tr/th")
    public List<WebElement> listOfTableHeaders;


    public void verifyTableHeader(List<String> expectedTHeaders){
        List<String> actualTHeaders= BrowserUtils.getElementText(listOfTableHeaders);

        Assert.assertEquals(expectedTHeaders,actualTHeaders);

    }

}

