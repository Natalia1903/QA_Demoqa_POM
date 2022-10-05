package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="userName-value")
    WebElement logNameText;

    @FindBy(id= "submit")
    WebElement logOutButton;

    public ProfilePage verifyUserName(String userName) {
        if (logNameText.getText().equalsIgnoreCase(userName)) {
            System.out.println("Correct user name: " + logNameText.getText());
        } else{
            System.out.println("Incorrect user name: " + logNameText.getText());
        }
        return this;
    }
    public LoginPage logOut(){
        click(logOutButton);
        return new LoginPage(driver);
    }
    @FindBy (id = " delete-record-undefined")
    List<WebElement>trashList;
    WebElement okButton;

    public ProfilePage deleteBook() {
        trashList.get(0).click();
        pause(500);
        click(okButton);
        pause(500);
        assertAlert();
        return this;
    }

    private void assertAlert() {
    }
}
