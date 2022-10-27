package com.telran.tests.elemens;

import com.telran.HomePage;
import com.telran.SidePanelPage;
import com.telran.pages.elements.TextBoxPage;
import com.telran.tests.TestBase;
import com.telran.utils.DataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        new HomePage(driver).selectElements();
        new SidePanelPage(driver).selectTextBox();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "usingFile1")
    public void textBoxTestWithDataProviderText(String FullName, String email, String currentAddress,
                                                String permanentAddress) {
                 new TextBoxPage(driver)
                .enterUserTest(FullName, email, currentAddress, permanentAddress);
        Assert.assertTrue(new TextBoxPage(driver).getOutputAddress().contains("Current Address"));



    }
    @Test
    public void keyBordEventTest(){
        new TextBoxPage(driver).keyBoardEvent();
        Assert.assertEquals(new TextBoxPage(driver).getAttribute(),"Fridrichstr 34, 76131 Karlsruhe");
    }
}
