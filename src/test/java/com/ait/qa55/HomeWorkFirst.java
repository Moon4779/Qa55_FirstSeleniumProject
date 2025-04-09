package com.ait.qa55;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;

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

    @Test
    public void findElementsByCssAndSimpleStrategiesTest() {
        // --- Примеры CSS селекторов ---
        WebElement css1 = driver.findElement(By.cssSelector("div.header-logo"));
        WebElement css2 = driver.findElement(By.cssSelector("#small-searchterms"));
        WebElement css3 = driver.findElement(By.cssSelector(".search-box"));
        WebElement css4 = driver.findElement(By.cssSelector("input[type='text']"));
        WebElement css5 = driver.findElement(By.cssSelector("a[href='/login']"));

        // --- Примеры "простых" локаторов ---
        WebElement simple1 = driver.findElement(By.id("newsletter-email"));
        WebElement simple2 = driver.findElement(By.className("footer"));
        WebElement simple3 = driver.findElement(By.linkText("Register"));
        WebElement simple4 = driver.findElement(By.partialLinkText("Log"));
        WebElement simple5 = driver.findElement(By.className("top-menu"));

        System.out.println("ten elements was found !");
    }
    @Test
    public void findElementsByXpathTest() {


        WebElement xpath1 = driver.findElement(By.xpath("//*[@id='dialog-notifications-success']")); // это контейнер для успешных уведомлений
        WebElement xpath2 = driver.findElement(By.xpath("//*[@id='dialog-notifications-error']")); // отображает сообщение об ошибке
        WebElement xpath3 = driver.findElement(By.xpath("//*[@id='bar-notification']")); // элемент div, который отображает уведомления
        WebElement xpath4 = driver.findElement(By.xpath("//*[@id='flyout-cart']")); // div с мини-корзиной — появляется при наведении на корзину в шапке
        WebElement xpath5 = driver.findElement(By.xpath("//*[@id='mob-menu-button']")); // кнопка мобильного меню

        WebElement xpath6 = driver.findElement(By.xpath("//*[contains(@class, 'master-wrapper-content')]")); // в нём лежит всё содержимое
        WebElement xpath7 = driver.findElement(By.xpath("//*[contains(@class, 'header')]")); // это верхняя часть страницы
        WebElement xpath8 = driver.findElement(By.xpath("//*[contains(@class, 'header-logo')]")); // логотип сайта
        WebElement xpath9 = driver.findElement(By.xpath("//*[contains(@class, 'header-links-wrapper')]")); // контейнер для ссылок в правом верхнем углу
        WebElement xpath10 = driver.findElement(By.xpath("//*[contains(@class, 'header-links')]")); // сами ссылки

        System.out.println("Ten elements were found using XPath!");
    }




    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }
}
