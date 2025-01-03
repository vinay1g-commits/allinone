package com.all.config;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//here we setup the webdriver instances
public class DriverManager {
    public static WebDriver driver;
    //create 3 instances of browser switch case  
    public static WebDriver driverManager(String browser,String device){
        switch (browser.toLowerCase()) {
            case "chrome":
            driver=initChrome(device);
            break;
            case "firefox":
            driver=initFirefox(device);
            break;
            case "edge":
            driver=initEdge(device);    
            break;    
        
            default:
            throw new IllegalArgumentException("wrong browser name:"+browser);
        }
        //driver.manage().window().maximize();
        return driver;
    }
    public static WebDriver initChrome(String device){
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt=new ChromeOptions();
        if (device.equalsIgnoreCase("mobile")){
            opt.setExperimentalOption("mobileEmulation", Map.of("deviceName","Pixel 5"));    
        }
        return new ChromeDriver(opt);
    }
    public static WebDriver initFirefox(String device){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions opt=new FirefoxOptions();
        if (device.equalsIgnoreCase("mobile")){
            opt.addPreference("general.useragent.override", "Mozilla/5.0 (iPhone; CPU iPhone OS 15_0 like Mac OS X)");
        }
        return new FirefoxDriver(opt);
    }
    public static WebDriver initEdge(String device){
        WebDriverManager.edgedriver().setup();
        EdgeOptions opt=new EdgeOptions();
        if (device.equalsIgnoreCase("mobile")){
            opt.setExperimentalOption("mobileEmulation", Map.of("deviceName","Galaxy S20"));    
        }
        return new EdgeDriver(opt);
    }
    /*teardown
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }*/
    //to use driver instance for other classes use getter method
    public static WebDriver getDriver(){
        return driver;
    }

}
