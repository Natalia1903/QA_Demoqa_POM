package com.telran.pages.elements;

import com.telran.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class LinksPage extends BasePage {
    public LinksPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "a")
    List<WebElement>links;

    public LinksPage checkAllLinks() {
        System.out.println("Total links on the Webpage:" + links.size());
        String url ="";
        Iterator<WebElement> iterator = links.iterator();
        while (iterator.hasNext()){
            url = iterator.next().getText();
            System.out.println(url);
        }
        return this;
    }

    public LinksPage checkBrokenLinks() {
        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            verifyLinks(url);

        }
        return this;
    }

    private void verifyLinks(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            // create url connection and get status code
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode()>=400){
                System.out.println(linkUrl + "-" + httpURLConnection.getResponseCode()+"is a broken link");
            }else {
                System.out.println(linkUrl + "-" + httpURLConnection.getResponseMessage());
            }
        } catch (Exception e){
            System.out.println(linkUrl + "-"+ e.getMessage()+"is a broken link");
        }

    }
   /* @FindBy(id="moved")
    WebElement moved;

    public LinksPage getTextMovedClick() {
        return new click().getText();
    }*/



}
