package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class MakeUp {

    WebDriver driver;

    public MakeUp(WebDriver driver) {
        this.driver = driver;
    }


    //locators
    By ClickonMakeup = By.xpath("//a[normalize-space()='Makeup']");


    // Get Page Title
    public void makeup() {
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
    }
}
