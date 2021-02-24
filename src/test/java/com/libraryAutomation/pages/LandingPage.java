package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LandingPage extends LoginPage {
// need to update this page

    @FindBy(name = "tbl_books_length")
    public WebElement selectRecords;

    public void clickOnModule(String text) {
        WebElement module = Driver.getDriver()
                .findElement(By.xpath("//span[contains(text(),'" + text + "')]"));
        module.click();
    }
}