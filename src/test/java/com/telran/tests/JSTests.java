package com.telran.tests;

import com.telran.HomePage;
import com.telran.SidePanelPage;
import com.telran.data.UserData;
import com.telran.pages.JSExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class JSTests extends TestBase{

    @Test
    public void typeAndClickWithJSTest() {
        new HomePage(driver).selectElements();
        new SidePanelPage(driver).selectTextBox();
        new JSExecutor(driver).enterDataWithJS(UserData.USER_NAME, UserData.USER_EMAIL).clickOnSubmitWithJS();
    }

    @Test
    public void checkBoxWithJS() {
        new HomePage(driver).selectForms();
        new SidePanelPage(driver).selectPracticeForm();
        new JSExecutor(driver).checkBoxWithJS().getTitlePageAndURLWithJS();
    }
}
