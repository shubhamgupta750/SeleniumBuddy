package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {

    WebDriver driver;

    // Constructor
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }



    By cart = By.xpath("//*[@id=\"main_menu_top\"]/li[3]/a");
    By continueShop = By.xpath("//a[@class='btn btn-default mr10']");
    By makeUp = By.xpath("//*[@id=\"categorymenu\"]/nav/ul/li[3]/a");
    By product = By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/div[3]/div[2]/div[1]/div/a");
    By addToCart= By.linkText("Add to Cart");
    By checkOut = By.xpath("//a[@id='cart_checkout1']");
    By username = By.xpath ("//input[@name='loginname']");
    By password = By.xpath ("//input[@name='password']");
    By button = By.xpath("//button[@title='Login']");
    By confirmOrder = By.xpath("//button[@id='checkout_btn']");
    By message = By.linkText("Continue");





    public void OrderItems(){
        driver.findElement(cart).click();
        driver.findElement(continueShop).click();
        driver.findElement(makeUp).click();
        driver.findElement(product).click();
        driver.findElement(addToCart).click();
        driver.findElement(checkOut).click();
        driver.findElement(username).sendKeys("Annysmith123");
        driver.findElement(password).sendKeys("Anny@123");
        driver.findElement(button).click();
        driver.findElement(confirmOrder).click();
        if(driver.findElement(message).isDisplayed())
        {
            System.out.println("Your Order Has Been Processed!");
        }
        else{
            System.out.println("not placed");
        }

    }


}
