package org.example;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

//This will be the foundation for all other page classes.
// It will contain shared methods that all pages might use, such as sendKeys, click, and other common actions.

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String randomStringGenerator(int length) {
        String randomString;
        randomString = RandomStringUtils.randomAlphanumeric(length);
        return randomString;
    }

    public void clearAndSendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void isDisplayed(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.isDisplayed();
    }


}

