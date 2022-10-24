package com.telran.pages.elements;

import com.telran.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.naming.Name;
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
        submit.click();
        return this;
    }
@FindBy(id="output")
WebElement output;

    public String getOutputAddress() {
        pause(700);
        return output.getText();
    }
}

