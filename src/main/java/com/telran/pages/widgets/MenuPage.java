package com.telran.pages.widgets;

import com.telran.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MenuPage  extends BasePage {
    public MenuPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[.='Main Item 2']")
    WebElement mainItem2;

    @FindBy(xpath = "//*[.='SUB SUB LIST']")
    WebElement subList;

    @FindBy(xpath = "//*[.='Sub Sub Item 2']")
    WebElement subSubItem2;

    public MenuPage selectSubMenu() {
        hideAd();
        hideFooter();
        Actions actions =new Actions(driver);
        //mouse hover menu options 'Main Item 2'
        actions.moveToElement(mainItem2).perform();
        //mouse hover menu options 'subList'
        actions.moveToElement(subList).perform();
        subList.sendKeys(Keys.SHIFT);
        //mouse hover menu options 'subSubItem2'
        actions.moveToElement(subSubItem2).perform();
        subSubItem2.sendKeys(Keys.SHIFT);
        //System.out.println(subSubItem2.getText());
        return this;
    }
}
