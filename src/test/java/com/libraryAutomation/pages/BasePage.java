package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

import static com.libraryAutomation.utilities.Driver.getDriver;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public String url;

    public void open() {
        getDriver().get(url);
    }


}
