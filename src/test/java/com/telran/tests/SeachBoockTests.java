package com.telran.tests;

import com.telran.pages.BookStorePage;
import com.telran.pages.HomePage;
import com.telran.pages.data.BookData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeachBoockTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).selectBookStoreApp();

    }
    @Test
    public void searchBookPositiveTest(){
        new BookStorePage(driver).typeInSearchBookInput(BookData.BOOK_NAME);
        Assert.assertTrue(new BookStorePage(driver).takeNameOfBook().contains(BookData.BOOK_NAME));
    }
}
