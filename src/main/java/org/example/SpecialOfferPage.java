package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecialOfferPage {

    WebDriver driver;
    public SpecialOfferPage(WebDriver driver) {
        this.driver = driver;
    }



     By specialOffer= By.xpath("//*[@id=\"main_menu_top\"]/li[1]/a/span");
     By antiAgeCreame = By.xpath("//a[@title='Absolue Eye Precious Cells']");
    // By antiAgeCreame= By.linkText("Absolue Eye Precious Cells");   // by link text
     By addToCart = By.linkText("Add to Cart");
     By cart = By.linkText("Basket");
     By cream = By.xpath("//a[@title='Creme Precieuse Nuit 50ml']");





     public void addProduct(){
         driver.findElement(specialOffer).click();
         driver.findElement(antiAgeCreame).click();
         driver.findElement(addToCart).click();
         driver.navigate().to("https://automationteststore.com/index.php?rt=product/special");
         driver.findElement(cream).click();
         driver.findElement(addToCart).click();
         if(driver.findElement(cart).isDisplayed())
         {
             System.out.println("products added to cart");
         }
         else
         {
             System.out.println("Not added");
         }





     }




}
