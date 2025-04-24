package com.ait.qa55;


import com.FirstSeleniumProgect.ContactData;
import com.FirstSeleniumProgect.UserData;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWorkFirst extends BaseTest {


    @Test
    public void openWebsiteTest() {
        System.out.println("Website opened successfully!");
    }

    @Test
    public void findElementsTest() {

        findElements();
    }

    public void findElements() {
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

    @Test
    public void findElementsByCssAndSimpleStrategiesTest() {
        cssSelector();
        simpleLocators();
        System.out.println("ten elements was found !");
    }

    public void simpleLocators() {
        WebElement simple1 = driver.findElement(By.id("newsletter-email"));
        WebElement simple2 = driver.findElement(By.className("footer"));
        WebElement simple3 = driver.findElement(By.linkText("Register"));
        WebElement simple4 = driver.findElement(By.partialLinkText("Log"));
        WebElement simple5 = driver.findElement(By.className("top-menu"));
    }

    public void cssSelector() {
        WebElement css1 = driver.findElement(By.cssSelector("div.header-logo"));
        WebElement css2 = driver.findElement(By.cssSelector("#small-searchterms"));
        WebElement css3 = driver.findElement(By.cssSelector(".search-box"));
        WebElement css4 = driver.findElement(By.cssSelector("input[type='text']"));
        WebElement css5 = driver.findElement(By.cssSelector("a[href='/login']"));
    }

    @Test
    public void findElementsByXpathTest() {

        elementsByXpath();

        System.out.println("Ten elements were found using XPath strategy!");
    }

    public void elementsByXpath() {
        WebElement element1 = driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));
        WebElement element2 = driver.findElement(By.xpath("//*[@id='dialog-notifications-error']"));
        WebElement element3 = driver.findElement(By.xpath("//*[@id='bar-notification']"));
        WebElement element4 = driver.findElement(By.xpath("//*[@id='flyout-cart']"));
        WebElement element5 = driver.findElement(By.xpath("//*[@id='mob-menu-button']"));


        WebElement element6 = driver.findElement(By.xpath("//*[contains(@class,'master-wrapper-content')]"));
        WebElement element7 = driver.findElement(By.xpath("//*[contains(@class,'header')]"));
        WebElement element8 = driver.findElement(By.xpath("//*[contains(@class,'header-logo')]"));
        WebElement element9 = driver.findElement(By.xpath("//*[contains(@class,'header-links-wrapper')]"));
        WebElement element10 = driver.findElement(By.xpath("//*[contains(@class,'header-links')]"));
    }

    @Test
    public void find15ElementsWithXpath() {
        elementsWithXpath();
    }

    public void elementsWithXpath() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Register']")));
        WebElement element8 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='small-searchterms']/parent::*")));
        WebElement element9 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='small-searchterms']/ancestor::form")));
        WebElement element10 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='small-searchterms']/following-sibling::*[1]")));
        WebElement element11 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='small-searchterms']")));

        System.out.println("5 elements were found.");
    }

    @Test
    public void createNewAccountPositiveTest() {
        pageOfRegisrtation();
        fillingOutRegistrationForm();
        uniqeEmail();
        sendForm();
        // Проверка, что регистрация прошла успешно
        eveluetOfSexsessfulRegistration();
    }

    public void eveluetOfSexsessfulRegistration() {
        WebElement successMessage = driver.findElement(By.className("result"));
        Assert.assertTrue(successMessage.getText().contains("Your registration completed"));

        System.out.println("Registration completed successfully!");
    }

    public void sendForm() {
        driver.findElement(By.id("register-button")).click();
    }

    public void uniqeEmail() {
        String uniqueEmail = "anna.test" + System.currentTimeMillis() + "@example.com";
        driver.findElement(By.id("Email")).sendKeys(ContactData.EMAIL);
        driver.findElement(By.id("Password")).sendKeys(UserData.PASSWORD);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(UserData.PASSWORD);
    }

    public void fillingOutRegistrationForm() {
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys(ContactData.Name);
        driver.findElement(By.id("LastName")).sendKeys(ContactData.Last_Name);
    }

    public void pageOfRegisrtation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.linkText("Register")).click();
        WebElement registerHeader = driver.findElement(By.xpath("//h1[text()='Register']"));
        Assert.assertTrue(registerHeader.isDisplayed());
    }
}





