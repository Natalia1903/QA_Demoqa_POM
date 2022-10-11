package com.telran.tests;

import com.telran.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeMethod
    public void init() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod (enabled = false)
    public void tierDown () {
        driver.quit();
    }

    @BeforeMethod
    public void startTest(Method m) {
        logger.info("Test start. Method " + m.getName());
    }

    @AfterMethod
    public void stopTest(ITestResult result) {
        if (result.isSuccess()) {
            logger.info("PASSED: test method " + result.getMethod().getMethodName());
        } else {
            logger.error("FAILED: test method " + result.getMethod().getMethodName());
            new BasePage(driver).takeScreenshot();
        }
    }
}