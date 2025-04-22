package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByTagName() {
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.print(element.getText());

        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.print(element1.getText());

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

    }

    @Test
    public void findElementBySimpleLocators() {
        driver.findElement(By.id("city"));

        driver.findElement(By.className("header"));
        System.out.println(driver.findElement(By.className("header")));

        driver.findElement(By.linkText("Let the car work"));
        driver.findElement(By.partialLinkText("car"));
    }
    @Test
    public void findElementByCssSelector(){
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#city"));
        driver.findElement(By.cssSelector(".header"));
        driver.findElement(By.cssSelector("[href='/registration?url=%2Fsearch']"));
        driver.findElement(By.cssSelector("[href*='/registration']"));
        driver.findElement(By.cssSelector("[href^='/registration']"));
        driver.findElement(By.cssSelector("[href$='search']"));
        driver.findElement(By.cssSelector("input#city"));
        driver.findElement(By.cssSelector("div.mobile-header"));
        driver.findElement(By.cssSelector("div.search-card"));
        driver.findElement(By.cssSelector("input#city[type='text']"));

    }
    // //*[@attr='value']

    @Test
    public void findElementByXpath(){
        driver.findElement(By.xpath("//input[@id='city']"));

        driver.findElement(By.xpath("//div[@class='header']"));
        driver.findElement(By.xpath("//h2[contains(.,'Yalla')]"));
        driver.findElement(By.xpath("//h2[text()='Type your data and hit Yalla!']"));
        driver.findElement(By.xpath("//h2/preceding-sibling::*"));
        //srarts-with -> //*[starts-with(@attr,'StartText')]    //элемент <label>, у которого атрибут for начинается с текста "ci".
        driver.findElement(By.xpath("//label[starts-with(@for,'ci')]"));
        //move up    driver.findElement(By.xpath("//a[@class='navigation-link']/.."));
        //parent - roditel'
        driver.findElement(By.xpath("//h1/parent::*"));    driver.findElement(By.xpath("//h1/parent::div"));
        driver.findElement(By.xpath("//h1/.."));
        //ancestor - predki    driver.findElement(By.xpath("//h1/ancestor::*"));
        driver.findElement(By.xpath("//h1/ancestor::div"));    driver.findElement(By.xpath("//h1/ancestor::div[2]"));
        //following-sibling
        driver.findElement(By.xpath("//h1/following-sibling::form"));
        //preceding-sibling - do tekushego na lyubom urovne    driver.findElement(By.xpath("//h2/preceding-sibling::*"));




    }

}
