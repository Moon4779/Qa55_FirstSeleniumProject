package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests {
    WebDriver driver;

    @BeforeMethod
    public  void setUp(){
        driver = new ChromeDriver();
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }

    @Test
    public void testPositiveLogin(){
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("anna.test2025@example.com");
        driver.findElement(By.id("Password")).sendKeys("Test1234");
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();


        WebElement logOutLink = driver.findElement(By.linkText("Log out"));
        Assert.assertTrue(logOutLink.isDisplayed());

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
