package com.telran;

import com.telran.pages.alertsWindows.AlertsPage;
import com.telran.pages.alertsWindows.BrowserWindowsPage;
import com.telran.pages.alertsWindows.FramePage;
import com.telran.pages.alertsWindows.NestedFramesPage;
import com.telran.pages.bookstore.ProfilePage;
import com.telran.pages.elements.ButtonsPage;
import com.telran.pages.elements.TextBoxPage;
import com.telran.pages.forms.PracticeFormPage;
import com.telran.pages.interactions.DragAndDropPage;
import com.telran.pages.widgets.MenuPage;
import com.telran.pages.widgets.SelectMenuPage;
import com.telran.pages.widgets.SliderPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanelPage extends BasePage {

    public SidePanelPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(css = ".show #item-3")
    WebElement profileButton;


    public ProfilePage selectProfile() {
        clickWithJSExecutor(profileButton, 0, 500);
        return new ProfilePage(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alertsButton;


    public AlertsPage selectAlerts() {
        clickWithJSExecutor(alertsButton, 0, 300);
        return new AlertsPage(driver);

    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindowsButton;

    public BrowserWindowsPage selectBrowserWindows() {
        clickWithJSExecutor(browserWindowsButton, 0, 200);
        return new BrowserWindowsPage(driver);
    }

    @FindBy(xpath = "//span[.='Buttons']")
    WebElement buttons;

    public ButtonsPage selectButtons() {
        clickWithJSExecutor(buttons, 0, 500);
        return new ButtonsPage(driver);
    }


    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;

    public SelectMenuPage getSelectMenu() {
        clickWithJSExecutor(selectMenu,0,300);
        SelectMenuPage selectMenuPage = new SelectMenuPage(driver);
        return selectMenuPage;
    }
    @FindBy (xpath = "//span[.='Frames']")
    WebElement frames;

    public FramePage selectFrame() {
        clickWithJSExecutor(frames,0,300);
        return new FramePage(driver);
    }
    @FindBy (xpath = "//span[.='Nested Frames']")
    WebElement nestedFrames;

    public NestedFramesPage selectNestedFrames() {
        clickWithJSExecutor(nestedFrames,0,300);
        return new NestedFramesPage(driver);
    }

    @FindBy (xpath = "//span[.='Practice Form']")
    WebElement practiceForm;

    public PracticeFormPage selectPracticeForm() {
        click(practiceForm);
        return new PracticeFormPage(driver);

    }
    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;

    public DragAndDropPage selectDroppable() {
        clickWithJSExecutor(droppable,0,500);
        return new DragAndDropPage(driver);
    }
    @FindBy(xpath = "//span[.='Droppable']")
    WebElement menu;

    public MenuPage selectMenuItem() {
        clickWithJSExecutor(menu,0,500);
        return new MenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Slider']")
    WebElement slider;

    public SliderPage selectSlider() {
        clickWithJSExecutor(slider,0,500);
        return new SliderPage(driver);
    }

    @FindBy(xpath = "//span[.='Text Box']")
    WebElement textBox;


    public TextBoxPage selectTextBox() {
        clickWithJSExecutor(textBox,0,600);
        return new TextBoxPage(driver);
    }
}

