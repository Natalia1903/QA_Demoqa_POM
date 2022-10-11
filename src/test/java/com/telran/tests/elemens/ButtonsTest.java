package com.telran.tests.elemens;

import com.telran.HomePage;
import com.telran.SidePanelPage;
import com.telran.pages.elements.ButtonsPage;
import com.telran.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ButtonsTest extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).selectElements();
        new SidePanelPage(driver).selectButtons();
    }
    @Test
    public void doubleClickTest(){

        new ButtonsPage(driver).doubleClick();
    }
    @Test
    public void rightClick(){

        new ButtonsPage(driver).rightClick();
    }
    @Test
    public void clickMeTest(){
        new ButtonsPage(driver).clickMeTest();
        Assert.assertTrue(new ButtonsPage(driver).getTextDynamicClick().contains("dynamic click"));
    }


    }

