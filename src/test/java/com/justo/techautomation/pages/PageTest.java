/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.justo.techautomation.pages;

//import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author ag_girl_
 */
public class PageTest {

    public WebDriver driver;

    @BeforeMethod
    public void getDriver() {

        System.setProperty("webdriver.chrome.driver", "/Users/ag_girl_/NetBeansProjects/WebDriver/chromedriver");
        //PageTest.driver = new ChromeDriver();
        System.out.println("uno");
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        System.out.println("2");
        driver.get("https://justo.mx/home/");
        System.out.println("3");

    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("4");
        driver.quit();
    }
}
