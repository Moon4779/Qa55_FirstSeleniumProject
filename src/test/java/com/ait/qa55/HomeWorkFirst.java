package com.ait.qa55;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; // <-- Важно!
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWorkFirst {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }

    @Test
    public void openWebsiteTest() {
        System.out.println("Website opened successfully!");
    }

    @Test
    public void findElementsTest() {

        WebElement element1 = driver.findElement(By.id("dialog-notifications-success"));
        WebElement element2 = driver.findElement(By.id("dialog-notifications-error"));
        WebElement element3 = driver.findElement(By.id("bar-notification"));
        WebElement element4 = driver.findElement(By.id("flyout-cart"));
        WebElement element5 = driver.findElement(By.id("mob-menu-button"));


        WebElement element6 = driver.findElement(By.className("master-wrapper-content"));
        WebElement element7 = driver.findElement(By.className("header"));
        WebElement element8 = driver.findElement(By.className("header-logo"));
        WebElement element9 = driver.findElement(By.className("header-links-wrapper"));
        WebElement element10 = driver.findElement(By.className("header-links"));


        System.out.println("ten elements was found !");
    }


    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }
}
