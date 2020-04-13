/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.justo.techautomation.test;
import com.justo.techautomation.pages.Home;
import com.justo.techautomation.pages.PageTest;
import org.testng.annotations.Test;
import com.justo.techautomation.pages.Session;

/**
 *
 * @author ag_girl_
 */
public class TestHome extends PageTest {
    Home testHome = new Home(driver);
    
    @Test
    public void testHome() {
        Home home = new Home(driver)
                .clickUserIcon()
                .clickLogin();

        Session session = new Session(driver)
                .typeUsername("testuser@example.com")
                .typePassword("test123")
                .clickSubmitlogin();
        System.out.println("hecho");
    }
}
