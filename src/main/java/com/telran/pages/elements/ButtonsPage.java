package com.telran.pages.elements;
import com.telran.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class ButtonsPage extends BasePage {



    public ButtonsPage (WebDriver driver){

        super(driver);
    }
    @FindBy (id = "doubleClickBtn")
    WebElement doubleClickBtn;

    public ButtonsPage doubleClick() {
        Actions actions = new Actions(driver);
        actions.doubleClick().perform();
        return this;
    }
    @FindBy(id ="rightClickBtn")
    WebElement rightClickBtn;

    public ButtonsPage rightClick() {
        Actions actions= new Actions(driver);
        actions.contextClick().perform();
        return this;
    }
    @FindBy(xpath = "//*[text()='Click Me']")
    WebElement clickButton;

    public ButtonsPage clickMeTest() {
        click(clickButton);
        return this;
    }
    @FindBy(id = "dynamicClickMessage")
    WebElement dynamicClickMessage;

    public String getTextDynamicClick() {
        return dynamicClickMessage.getText();
    }
}




