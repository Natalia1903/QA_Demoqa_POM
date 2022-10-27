package com.telran.tests.elemens;

import com.telran.HomePage;
import com.telran.SidePanelPage;
import com.telran.pages.elements.UploadAndDowloadPage;
import com.telran.pages.widgets.SelectMenuPage;
import com.telran.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class UploadAndDownloadTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).selectElements();
        new SidePanelPage(driver).selectUploadAndDownload();
    }

    @Test
    public void testName() {
    }

    @Test
    public void robotKeyEventTest() throws AWTException {
        new UploadAndDowloadPage(driver).performEventKeyUsinRobot();
        //Assert.assertTrue(new UploadAndDowloadPage(driver).getPath().contains("D1.txt"));
    }
    @Test
    public void robotMouseEventTest(){
        new UploadAndDowloadPage(driver).performMouseEventUsingRobot();
    }
}
