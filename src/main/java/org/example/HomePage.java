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
    By contactUsLink = By.xpath("//h2[normalize-space()='Contact Us']");

    // Methods
    public void displayContactUs() {
        driver.findElement(contactUsLink).isDisplayed();
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public void clickContactUs() {
        driver.findElement(contactUsLink).click();
    }

}
