package com.telran.tests.alertsWindows;

import com.telran.pages.alertsWindows.AlertsPage;
import com.telran.HomePage;
import com.telran.SidePanelPage;
import com.telran.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).selectAlertsFrameWindows();
        new SidePanelPage(driver).selectAlerts();
    }
    @Test
    public void alertSeeTest(){
        new AlertsPage(driver).acceptToSeeAlert();
    }

    @Test
    public void alertWaitTest(){
        new AlertsPage(driver).acceptTimerAlert();
    }

    @Test
    public void alertConfirmTest(){
        new AlertsPage(driver).chooseConfirmButton("Cancel");
        Assert.assertTrue(new AlertsPage(driver).getConfirmResult().contains("Cancel"));

    }
    @Test
    public void alertSendTextTest(){
        new AlertsPage(driver).sendTextTOAlert("Hello Word");
       Assert.assertTrue(new AlertsPage(driver).getConfirmMessageResult().contains("Word"));
    }
}
