package com.all.utility;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Allure;
// General purpose utility methods for test automation
public class Utility {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor initializes driver and wait
    public Utility(WebDriver driver, int timeout) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }

    // Method to take a screenshot and attach to Allure report
    public void takeScreenshots() {
        TakesScreenshot screen = (TakesScreenshot) driver;
        byte[] screenshotBytes = screen.getScreenshotAs(OutputType.BYTES); // Capture screenshot as byte array
        Allure.addAttachment("Screenshot on Failure", new ByteArrayInputStream(screenshotBytes)); // Attach the screenshot to Allure
    }

    // Method to click on an element
    public void click(By locator) {
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(locator));
        ele.click();
    }

    // Method to send text to an element (with delays between keystrokes)
    public void sendText(By locator, String text) throws InterruptedException {
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(locator));
        for (char c : text.toCharArray()) {
            ele.sendKeys(String.valueOf(c));
            Thread.sleep(500);
        }
    }
}
