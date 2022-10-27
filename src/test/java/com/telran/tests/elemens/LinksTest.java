package com.telran.tests.elemens;

import com.telran.HomePage;
import com.telran.SidePanelPage;
import com.telran.pages.elements.LinksPage;
import com.telran.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksTest extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).selectElements();
        new SidePanelPage(driver).selectLinks();
    }




    @Test
    public void checkLinksTest (){
        new LinksPage(driver).checkAllLinks().checkBrokenLinks();
        Assert.assertTrue(new LinksPage(driver).getTextMoved().contains("Moved Permanently"));

    }

}
