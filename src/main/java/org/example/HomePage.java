package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By contactUsText = By.xpath("//h2[normalize-space()='Contact Us']");
    By loginOrRegisterLink = By.linkText("Login or register");

    // Methods
    public void displayContactUs() {
        driver.findElement(contactUsText).isDisplayed();
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

}
