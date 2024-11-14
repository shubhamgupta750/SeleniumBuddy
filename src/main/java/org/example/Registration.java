package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Registration {
    WebDriver driver;

    public Registration(WebDriver driver)
    {
        this.driver = driver;
    }

    //locators
    By clickonlogin = By.xpath("//a[text()='Login or register']");
    By clickoncontinue = By.xpath("//button[@title=\"Continue\"]");
    By firstname = By.xpath("//input[@id='AccountFrm_firstname']");
    By Lastname = By.xpath("//input[@id='AccountFrm_lastname']");
    By Email = By.xpath("//input[@id='AccountFrm_email']");
    By Telephone = By.xpath("//input[@id='AccountFrm_telephone']");
    By Address = By.xpath("//input[@id='AccountFrm_address_1']");
    By City = By.xpath("//input[@id='AccountFrm_city']");
    By Zipcode = By.xpath("//input[@id='AccountFrm_postcode']");
    By loginname = By.xpath("//input[@id='AccountFrm_loginname']");
    By Password = By.xpath("//input[@id='AccountFrm_password']");
    By ConfirmPassword = By.xpath("//input[@id='AccountFrm_confirm']");
    By Checkbox = By.xpath("//input[@id='AccountFrm_agree']");
    //after creation of account
    By Submit = By.xpath("//button[@title=\"Continue\"]  ");
    By successmessage = By.xpath("//h1[@class=\"heading1\"]");
    By Continue =  By.xpath("//a[@title='Continue']");
   // By Altermessage = By.xpath("//div[@class='alert alert-error alert-danger']");
    //Method

    public void registationform() {
        driver.findElement(clickonlogin).click();
        driver.findElement(clickoncontinue).click();

      //  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        driver.findElement(firstname).sendKeys("abc");
        driver.findElement(Lastname).sendKeys("asd");

        driver.findElement(Email).sendKeys("ab142578@testmail.com");

       // driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(Telephone).sendKeys("1234567");
        driver.findElement(Address).sendKeys("23 abc");
        driver.findElement(City).sendKeys("USA");
        Select regionElement = new Select(driver.findElement(By.xpath("//select[@id='AccountFrm_zone_id']")));
        regionElement.selectByVisibleText("Bristol");
        driver.findElement(Zipcode).sendKeys("123456");

        driver.findElement(loginname).sendKeys("12qwerty");

       // driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(Password).sendKeys("123456");
        driver.findElement(ConfirmPassword).sendKeys("123456");
       // driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(Checkbox).click();
        driver.findElement(Submit).click();
        driver.findElement(Continue).click();
        //driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);




        if(driver.findElement(successmessage).isDisplayed())
        {
            System.out.println("Successmessage= Account created");
        }
           else {
                System.out.println("Failed");
            }

        }

    //logout
       By accountclick = By.xpath("(//span[contains(@class,'menu_text')][normalize-space()='Account'])[1]");
        By logoutclick = By.xpath("(//span[text()=\"Logout\"])[1]");
            public void logout() {
         WebElement account= driver.findElement(accountclick);
           Actions action = new Actions(driver);
           //mousehover action
                action.moveToElement(account).perform();
            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

            driver.findElement(logoutclick).click();

            String pagetitle = driver.getTitle();
            System.out.println(pagetitle);
}
}





