package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class LandingPages extends BasePage{

    @FindBy(xpath = "//ul[@id='menu_item']//li//a")
    public List<WebElement> links;



    public void verifyModules(List<String> expectedModules){
      List<String> modulesElementText= BrowserUtils.getElementText(links);

      Assert.assertEquals(expectedModules,modulesElementText);

        }

    }


