package com.telran.pages.widgets;

import com.telran.BasePage;
import com.telran.HomePage;
import com.telran.SidePanelPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectMenuPage extends BasePage {

    public SelectMenuPage(WebDriver driver) {
        super(driver);
    }

    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).selectWidgets();
        new SidePanelPage(driver).getSelectMenu();
    }

    @Test
    public void oldStyleSelectTest(String blue) {
        new SelectMenuPage(driver).selectOlStyle("Blue");
    }

    @FindBy(id = "oldSelectMenu")
    WebElement oldSelectMenu;

    public SelectMenuPage selectOlStyle(String text) {
        Select select = new Select(oldSelectMenu);
        select.selectByVisibleText(text);
        System.out.println(select.getFirstSelectedOption().getText() + " <-- It is first");

        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
        return this;
    }

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[3]")
    WebElement multiSelectDropDown;

    @FindBy(xpath = "//html")
    WebElement space;

    public SelectMenuPage clickOnMultiSelectDropDown(String text) {
        clickWithJSExecutor(multiSelectDropDown, 0, 300);
        driver.findElement(By.xpath(String.format("//div[text()='%s']", text))).click();
        pause(1000);
        click(space);
        return this;

    }

    // %s - string
    // %d - int

    @FindBy(css = ".css-xb97g8")
    WebElement deselect;

    public SelectMenuPage deselect() {
        click(deselect);
        return this;

    }

    @FindBy(id = "react-select-4-input")
    WebElement selectInput;

    public SelectMenuPage clickOnMultiSelectDropDown1(String text, String text1, String text2) {
        selectInput.sendKeys(text);
        selectInput.sendKeys(Keys.ENTER);
        selectInput.sendKeys(text1);
        selectInput.sendKeys(Keys.ENTER);
        selectInput.sendKeys(text2);
        selectInput.sendKeys(Keys.ENTER);
        click(space);
        return this;
    }

    @FindBy(id = "cars")
    WebElement cars;

    public SelectMenuPage clickStandardMultiSelect() {
        Select multi = new Select(cars);
        if (multi.isMultiple()) {
            multi.selectByIndex(0);
            multi.selectByIndex(1);
            multi.selectByIndex(2);
            multi.selectByIndex(3);

        }
        List<WebElement> options = multi.getAllSelectedOptions();
        for (WebElement element : options) {
            System.out.println(element.getText() + " <-- multi");
        }
        return this;
    }

    @FindBy(xpath = "(//div[text()='Select Option'])")
    WebElement selectValue;


    public SelectMenuPage clickOnSelectOption(String text) {
        clickWithJSExecutor(selectValue,0, 200);
        driver.findElement(By.xpath(String.format("//div[text()='%s']", text))).click();
        return this;
    }


    @FindBy(xpath = "//*[text()='Select Title']")
    WebElement selectTitle;


    public SelectMenuPage clickOnSelectOneTitle(String text) {
        clickWithJSExecutor(selectTitle, 0, 300);
        driver.findElement(By.xpath(String.format("//div[text()='%s']", text))).click();

        return this;
    }

    @FindBy(xpath = "//*[text()='Dr.']")
    WebElement title;


}
