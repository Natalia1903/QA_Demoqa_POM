package com.telran.tests.alertsWindows;

import com.telran.HomePage;
import com.telran.SidePanelPage;
import com.telran.pages.alertsWindows.FramePage;
import com.telran.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class FramesTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).selectAlertsFrameWindows();
        new SidePanelPage(driver).selectFrame();
    }

    @Test
    public void framesTest(){
        new FramePage(driver).returnListOfFrames();
    }
    @Test
    public void switchToFrameByIndexTest(){
        new FramePage(driver).switchToFrameByIndex(1);
    }

    @Test
    public void  switchToFrameByIdTest(){
        new FramePage(driver).switchToFrameById();
        //Assert.assertTrue(new FramePage(driver).switchToFrameById1().contains("This"));

    }


}
