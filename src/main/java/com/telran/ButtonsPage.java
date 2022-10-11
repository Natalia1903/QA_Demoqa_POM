package com.telran;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage{

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="doubleClickBtn")
    WebElement doubleClickBtn;

    public ButtonsPage doubleClick() {
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).perform();
        return this;
    }

    @FindBy(id="doubleClickMessage")
    WebElement doubleClickMessage;

    public String getConfirmMessageDoubleClickButton() {
        return doubleClickMessage.getText();
    }

    @FindBy(id="rightClickBtn")
    WebElement rightClickBtn;

    public ButtonsPage rightClick() {
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickBtn).perform();
        pause(1000);
        return this;
    }
    @FindBy(id="rightClickMessage")
    WebElement rightClickMessage;

    public String getConfirmMessageRightClickButton() {

        return rightClickMessage.getText();
    }

    @FindBy(xpath = "//*[text()='Click Me']")
    WebElement clickMeBtn;

    public ButtonsPage clickMe() {
        click(clickMeBtn);
        return this;

    }

    @FindBy(id="dynamicClickMessage")
    WebElement dynamicClickMessage;

    public String getConfirmMessageClickMeButton() {

        return dynamicClickMessage.getText();
    }
}
