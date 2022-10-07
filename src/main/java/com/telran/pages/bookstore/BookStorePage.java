package com.telran.pages.bookstore;

import com.telran.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookStorePage extends BasePage {


        public BookStorePage(WebDriver driver) {
            super(driver);

        }

        @FindBy(id = "login")
        WebElement loginButton;

        public LoginPage clickOnLoginButton() {
            click(loginButton);
            return new LoginPage(driver);
        }

        @FindBy(id = "searchBox")
        WebElement searchInput;

        public BookStorePage typeInSearchBookInput(String bookName) {
            type(searchInput, bookName);
            return this;

        }

        @FindBy(xpath = "//*[text()='Git Pocket Guide']")
        WebElement nameOfBook;
        WebElement addToCollectionButton;

        public String takeNameOfBook() {
            return nameOfBook.getText();
        }

        public BookStorePage clickOnBookTitleLink() {
            click(nameOfBook);
            return this;
        }
        @FindBy(css =".text-right fullButton")
        WebElement getAddToCollectionButton;

        public BookStorePage clickOnAddButton() {
            clickWithJSExecutor(addToCollectionButton,0,300);
            pause(500);
            return this;
        }



}

