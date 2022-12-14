package com.telran.pages.bookstore;

import com.telran.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="userName")
    WebElement userName;

    @FindBy(id="password")
    WebElement password;

    @FindBy( id="login")
    WebElement loginBtn;

    public ProfilePage login(String name, String pwd) {
        type(userName,name);
        type(password,pwd);
        click(loginBtn);
        return new ProfilePage(driver);
    }

    public LoginPage loginNegative(String name,String pwd) {
        type(userName,name);
        type(password,pwd);
        click(loginBtn);
        return this;
    }
}
