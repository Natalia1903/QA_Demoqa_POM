package com.telran.tests;

import com.telran.pages.BookStorePage;
import com.telran.pages.HomePage;
import com.telran.pages.LoginPage;
import com.telran.pages.data.BookData;
import com.telran.pages.data.UserData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddBookTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).selectBookStoreApp();
        new BookStorePage(driver).clickOnLoginButton();
        new LoginPage(driver).login(UserData.USER_NAME, UserData.USER_PASSWORD);
    }

    @Test
    public void searchBookTestWithRegistration(){
        new BookStorePage(driver).typeInSearchBookInput(BookData.BOOK_NAME);
        Assert.assertTrue(new BookStorePage(driver).takeNameOfBook().contains(BookData.BOOK_NAME));
    }
}
