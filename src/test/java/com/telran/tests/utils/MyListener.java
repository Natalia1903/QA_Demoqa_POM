package com.telran.tests.utils;

import com.telran.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MyListener extends AbstractWebDriverEventListener {

    Logger logger = LoggerFactory.getLogger(MyListener.class);

    public MyListener(){
        super();
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        super.beforeFindBy(by, element, driver);
        logger.info("Start search" + by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        super.afterFindBy(by, element, driver);
        logger.info(by +"was found");
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        super.onException(throwable, driver);
        logger.info("We have a throwable -->" +throwable.getMessage());
        logger.info("We have a throwable -->" +throwable.getLocalizedMessage());
        logger.info("We have a throwable -->" +throwable.getStackTrace());

        int index =(int) (System.currentTimeMillis()/1000)%3600;
        String link = "/screenshots/screen" + index + ".png";

        BasePage page = new BasePage(driver);
        page.takeScreenshotListener(link);

        logger.info("This is link with error" + link);
    }
}
