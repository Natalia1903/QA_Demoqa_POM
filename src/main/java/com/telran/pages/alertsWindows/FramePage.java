package com.telran.pages.alertsWindows;

import com.telran.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;
import java.util.List;

public class FramePage extends BasePage {
    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "iframe")
    List<WebElement> frames;

    public FramePage returnListOfFrames() {
        JavascriptExecutor js =(JavascriptExecutor) driver;
        Integer numberOfFrames = Integer.parseInt(js.executeScript("return window.length").toString());
        System.out.println("Number of Frames are" + numberOfFrames);
        System.out.println("Number of Frames are" + frames.size());
        return this;
    }

    public FramePage switchToFrameByIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }
    @FindBy(id = "frame1")
    WebElement frame1;

    @FindBy( id = "sampleHeading")
    WebElement text;

    public FramePage switchToFrameById() {
        driver.switchTo().frame(frame1);
        String frameText = text.getText();
        System.out.println("Text of the Frame1 is " + frameText);
        driver.switchTo().defaultContent();
        return this;
    }

    public FramePage switchToFrameById1() {

        return this;
    }
}
