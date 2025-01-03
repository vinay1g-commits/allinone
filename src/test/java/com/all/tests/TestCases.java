package com.all.tests;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.all.config.DriverManager;
import com.all.pages.Page;
import io.qameta.allure.testng.AllureTestNg; // Import Allure TestNG listener

@Epic("MakeMyTrip Automation")
@Feature("Test Booking Functionality")
@Listeners(AllureTestNg.class)  // Adding the AllureTestNg listener here
public class TestCases {

    public WebDriver driver;
    public Page pg;

    @BeforeClass
    @Step("Setup the WebDriver and initialize Page Object")
    public void setUp() {
        driver = DriverManager.driverManager("firefox", "desktop");
        pg = new Page(driver);
    }

    @Test(description = "Verify MakeMyTrip Booking Flow")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Booking a flight")
    @Step("Perform MakeMyTrip Booking Test")
    public void testExample() throws Exception {
        try {
            // Test steps
            Allure.step("Navigate to MakeMyTrip website");
            driver.navigate().to("https://www.makemytrip.com/");
            
            Allure.step("Close pop-up");
            pg.closePopup();

            Allure.step("Enter 'From' location");
            pg.enterFromLocation();

        } catch (Exception e) {
            throw e;
        }
    }

    @AfterSuite
    @Step("Close WebDriver")
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
