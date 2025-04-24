package com.ait.qa55;

import org.openqa.selenium.WebDriver;

public class App {
    private WebDriver driver;
    private Home home;
    public App(WebDriver driver) {
        this.driver = driver;
        this.home = new Home(driver);
    }

    public Home getHome() {
        return home;
    }
}
