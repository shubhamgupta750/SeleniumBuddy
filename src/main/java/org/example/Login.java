package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Login {
    WebDriver driver;

    public Login(WebDriver driver)
    {
        this.driver = driver;
    }

    // Locators
    By clickonlogin = By.xpath("//a[text()='Login or register']");
    By username = By.id("loginFrm_loginname");
    By password = By.id("loginFrm_password");
    By submit = By.xpath("//button[@title=\"Login\"]");

    //Method
    public void loginform()
    {
            driver.findElement(clickonlogin).click();
            driver.findElement(username).sendKeys("abc");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.findElement(password).sendKeys("xyz");

            driver.findElement(submit).click();




    }





}
