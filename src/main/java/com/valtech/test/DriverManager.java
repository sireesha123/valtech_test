package com.valtech.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    public static WebDriver driver;

    public String browser = "firefox";

    public DriverManager() {
        PageFactory.initElements(driver, this);
    }

    public void openBrowser() {

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "ie":
                driver = new ChromeDriver();
                break;
            default:
                driver = new FirefoxDriver();
        }
    }

    public void navigateTo(String url){
        driver.get(url);
    }

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public void applyWaits(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.quit();
    }
}
