package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

//    Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

//    Locators
    By heading = By.tagName("h1");
    By loginbox = By.tagName("h2");
    By registerButton = By.xpath("//input[@id='accountFrm_accountregister']");
    By continueButton = By.xpath("//button[normalize-space()='Continue']");
    By loginTextBox = By.xpath("//input[@id='loginFrm_loginname']");
    By passwordTextBox = By.xpath("//input[@id='loginFrm_password']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");

//    Methods
    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public String getloginText(int index) {
        return driver.findElements(loginbox).get(index).getText();
    }

    public void getRegisterButtonValue() {
        driver.findElement(registerButton).isSelected();
    }

    public void verifyContinueButton() {
        driver.findElement(continueButton).isDisplayed();
    }

    public String verifyLoginText() {
        driver.findElement(loginTextBox).sendKeys("sahildeosekar");
        return driver.findElement(loginTextBox).getAttribute("value");
    }

    public String verifyLoginPassword() {
//        getter
        driver.findElement(passwordTextBox).sendKeys("sahil@1234");
        return driver.findElement(passwordTextBox).getAttribute("value");
    }

    public void verifyForgotPasswordLogin(By path) {
        driver.findElement(path).isDisplayed();
    }

    public void verifyLoginButton() {
        driver.findElement(loginButton).isDisplayed();
    }
}
