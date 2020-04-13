/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.justo.techautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author ag_girl_
 */
public class Home extends PageTest {

    @FindBy(xpath = "/html/body/header/div/div/div[4]/div[1]/a/svg")
    WebElement usericon;

    @FindBy(id = "action-user")
    WebElement loginbutton;
    
    public Home(WebDriver driver) {
        super();
    }



    public Home clickUserIcon() {
        System.out.println("5");
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(usericon));
        
        usericon.click();
        System.out.println("6");
        return this;
    }

    public Home clickLogin() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(loginbutton));
        loginbutton.click();
        return new Home(driver);
    }

}
