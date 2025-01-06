package com.all.tests;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.all.config.DriverManager;
import com.all.pages.Page;
import com.all.utility.Utility;
import io.qameta.allure.testng.AllureTestNg; // Import Allure TestNG listener

@Epic("MakeMyTrip Automation")
@Feature("Test Booking Functionality")
@Listeners(AllureTestNg.class)  // Adding the AllureTestNg listener here
public class TestCases {

    public WebDriver driver;
    public Page pg;
    private Utility utility;  // Declare an instance of Utility class

    @BeforeClass
    @Step("Setup the WebDriver and initialize Page Object")
    public void setUp() {
        DriverManager.driverManager("firefox", "desktop");
        driver = DriverManager.getDriver();
        pg = new Page(driver);
        utility = new Utility(driver, 10); // Initialize Utility with the driver and timeout
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
            utility.takeScreenshots();  // Capture screenshot if test fails
            throw e; // Re-throw the exception to fail the test
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
