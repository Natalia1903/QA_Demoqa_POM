package com.telran.pages.elements;

import com.telran.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.naming.Name;
import java.security.Key;
import java.util.Collection;

public class TextBoxPage extends BasePage {

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="userName")
    WebElement userNameField;

    @FindBy(id="userEmail")
    WebElement userEmailField;

    @FindBy(id="currentAddress")
    WebElement currentAddressField;

    @FindBy(id="permanentAddress")
    WebElement permAddress;

    @FindBy(id="submit")
    WebElement submit;


    public TextBoxPage enterUserTest(String fullName, String email,
                                     String currentAddress, String permanentAddress) {

        hideAd();
        hideFooter();
        type(userNameField, fullName);
        type(userEmailField, email);
        type(currentAddressField, currentAddress);
        type(permAddress, permanentAddress);
        pause(700);
        clickWithJSExecutor(submit,0,400);
        return this;
    }
    @FindBy(id="output")
     WebElement output;

    public String getOutputAddress() {
        pause(700);
        return output.getText();
    }
    @FindBy(id="userName")
    WebElement userName;

    @FindBy(id="userEmail")
    WebElement userEmail;

    @FindBy(id="currentAddress")
    WebElement currentAddress;

    @FindBy(id="permanentAddress")
    WebElement permanentAddress;



    public TextBoxPage keyBoardEvent() {
        //enter username
        type(userName,"Title Hoffman");
        //enter email
        type(userEmail,"hoffmat@gmail.com");
        //enter current address
        typeWithJSExecutor(currentAddress,"Fridrichstr 34, 76131 Karlsruhe",0,200);
        //create object of the Action class
        Actions actions = new Actions(driver);
        //select current address
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        //copy current address
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        //press the tab Key to
        actions.sendKeys(Keys.TAB).perform();
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

      //  System.out.println(currentAddress.getAttribute("value"));
      //  System.out.println(permAddress.getAttribute("value"));
        return this;
    }

    public String getAttribute() {
        return permAddress.getAttribute("value");
    }
}

