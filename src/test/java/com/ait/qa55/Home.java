package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    private WebDriver driver;


    public Home(WebDriver driver) {
        this.driver = driver;
    }

    private By homeComponentLocator = By.cssSelector("div:nth-child(2)>div>div>h1");
    private By homeLinkLocator = By.linkText("Home");

    public boolean isHomeComponentPresent() {
        try {
            return driver.findElement(homeComponentLocator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickOnHomeLink() {
        driver.findElement(homeLinkLocator).click();
    }
}

