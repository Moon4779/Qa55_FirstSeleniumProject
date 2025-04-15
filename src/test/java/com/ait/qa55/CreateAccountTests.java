package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.navigate().to("https://demowebshop.tricentis.com/");

    }
    @Test
    public void testPositiveAccountCreation() {
        int i = (int)((System.currentTimeMillis()/1000)%3600);
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Anna");
        driver.findElement(By.id("LastName")).sendKeys("Smith");
        driver.findElement(By.id("Email")).sendKeys("test" + i + "@test.com");
        driver.findElement(By.id("Password")).sendKeys("Test1234");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Test1234");
        driver.findElement(By.id("register-button")).click();

        WebElement success = driver.findElement(By.className("result"));
        Assert.assertTrue(success.getText().contains("Your registration completed"));
    }

    @Test
    public void testNegativeTests(){
        int i = (int)((System.currentTimeMillis()/1000)%3600);
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Anna");
        driver.findElement(By.id("LastName")).sendKeys("Smith");
        driver.findElement(By.id("Email")).sendKeys("test" + i + "@test.com");
        driver.findElement(By.id("Password")).sendKeys("Test1234");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("WrongPassword");
        driver.findElement(By.id("register-button")).click();

        WebElement error = driver.findElement(By.cssSelector(".field-validation-error"));
        Assert.assertTrue(error.getText().contains("The password and confirmation password do not match."));


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
