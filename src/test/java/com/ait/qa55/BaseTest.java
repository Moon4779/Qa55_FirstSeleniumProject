package com.ait.qa55;

import fw.ApplicationManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static ApplicationManager app;
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        String browser = System.getProperty("browser", "chrome");
        app = new ApplicationManager(browser);
        app.init();
        driver = app.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }


}
