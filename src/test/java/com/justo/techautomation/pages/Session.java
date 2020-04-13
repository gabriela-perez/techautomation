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
public class Session extends Home {
    @FindBy(id = "id_username")
    WebElement username;

    @FindBy(id = "id_password")
    WebElement password;
    
    @FindBy(xpath = "/html/body/main/div/div[2]/div/div[2]/form/div/div/button")
    WebElement submitlogin;
  
    public Session(WebDriver driver) {
        super(driver);
    }


    
    public Session typeUsername(String usernameParam) {  
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(username));
        username.sendKeys(usernameParam);
        return this;
    }
    
    
    public Session typePassword(String passwordParam) {
        password.sendKeys(passwordParam);
        return this;
    }
    
    public Session clickSubmitlogin() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(submitlogin));
        submitlogin.click();
        return new Session(driver);
    }

    
}
