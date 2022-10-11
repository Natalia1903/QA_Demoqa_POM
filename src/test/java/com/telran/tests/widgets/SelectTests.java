package com.telran.tests.widgets;

import com.telran.HomePage;
import com.telran.SidePanelPage;
import com.telran.pages.widgets.SelectMenuPage;
import com.telran.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).selectWidgets();
        new SidePanelPage(driver).getSelectMenu();
    }

    @Test
    public void oldStyleSelectMenuTest() {
        new SelectMenuPage(driver).oldStyleSelectTest("Blue");
    }
}




