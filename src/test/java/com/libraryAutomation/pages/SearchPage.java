package com.libraryAutomation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends LoginPage {

    @FindBy(className = "control-label col-md-4")
    public WebElement bookManagement;

    @FindBy(id = "book_categories")
    public WebElement bookCategories;

    @FindBy(xpath = "//*[@id=\"book_categories\"]/option[1]")
    public WebElement allBooks;

    @FindBy(xpath = "//*[@id=\"book_categories\"]/option[2]")
    public WebElement firstBooks;
    @FindBy(xpath = "//*[@id=\"book_categories\"]/option[3]")
    public WebElement secondBook;
    @FindBy(xpath = "//*[@id=\"book_categories\"]/option[4]")
    public WebElement thirdBook;


    }

