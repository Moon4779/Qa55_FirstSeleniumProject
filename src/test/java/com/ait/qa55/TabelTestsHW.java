package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TabelTestsHW {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
    }

    @Test
    public void findElementTableWithXpathTest() {

        List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
        System.out.println("Всего строк: " + rows.size());
        for (WebElement row : rows) {
            System.out.println(row.getText()); // Получаем все строки таблицы
        }
        WebElement row3 = driver.findElement(By.xpath("//table//tr[4]"));
        System.out.println("3 : " + row3.getText()); // Получаем конкретную строку (например, 3)
        WebElement item1 = driver.findElement(By.xpath("//table//tr[7]/td[1]"));
        System.out.println("box (7 row, 1 colom): " + item1.getText()); // Получаем конкретную ячейку: 1-я колонка в 7-й строке
        WebElement canada = driver.findElement(By.xpath("//table//tr[8]/td[last()]"));
        System.out.println("last box it the 8 row : " + canada.getText()); // Получаем последнюю колонку в 8-й строке
    }






    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
