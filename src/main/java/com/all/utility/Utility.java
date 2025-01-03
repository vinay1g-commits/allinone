package com.all.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//here we write general purpose utitlity methods
public class Utility {
    private WebDriver driver;
    private WebDriverWait wait;

    public Utility(WebDriver driver,int timeout){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }

    public void click(By locator){
        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(locator));
        ele.click();
    }
    public void sendText(By locator,String text) throws InterruptedException{
        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(locator));
        for(char c:text.toCharArray()){
            ele.sendKeys(String.valueOf(c));
            Thread.sleep(500);
        }
    }
}
