package com.telran.pages.alertsWindows;

import com.telran.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id="timerAlertButton")
    WebElement timerAlertButton;

    public AlertsPage acceptTimerAlert() {
        click(timerAlertButton);
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        return this;
    }
    @FindBy(id = "confirmButton")
    WebElement confirmButton;

    public AlertsPage chooseConfirmButton(String text) {
        click(confirmButton);
        if(text != null && text.equals("OK")) {
            driver.switchTo().alert().accept();
        }else if (text != null && text.equals("Cancel")){
            driver.switchTo().alert().dismiss();
        }
        return this;
    }
    @FindBy(id= "confirmResult")
    WebElement confirmResult;

    public String getConfirmResult() {

        return confirmResult.getText();
    }
    @FindBy(id = "promtButton")
    WebElement promtButton;

    public AlertsPage sendTextTOAlert(String message) {
        clickWithJSExecutor(promtButton,0,200);
        if(message != null){
            driver.switchTo().alert().sendKeys(message);
        }
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(id = "promptResult")
    WebElement promptResult;


     public String getConfirmMessageResult() {

         return promptResult.getText();
    }
    @FindBy (id ="alertButton")
    WebElement alertButton;

    public AlertsPage acceptToSeeAlert() {
        click(alertButton);
        driver.switchTo().alert().accept();
        return this;
    }
}
