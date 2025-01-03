package com.all.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.all.locators.Locators;
import com.all.utility.Utility;

//here we write all the page element actions to be performed
public class Page {
    public WebDriver driver;
    public Utility waitFor;
    public Page(WebDriver driver){
        this.driver=driver;
        this.waitFor=new Utility(driver, 15);
    }
    //close pop up
    public void closePopup(){
        waitFor.click(By.xpath(Locators.FIRST_PAGE_CLOSE_BTN));
    }
    public void enterFromLocation() throws InterruptedException{
        waitFor.click(By.xpath(Locators.FROM));
        waitFor.sendText(By.xpath(Locators.FROM_TEXTBOX), "bengaluru");
        waitFor.click(By.xpath(Locators.FROM_DROPDOWN));
    }
}
