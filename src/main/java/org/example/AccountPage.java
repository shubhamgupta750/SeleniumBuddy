package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AccountPage {
    WebDriver driver;

    // Constructor
    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }


    By accountLink = By.xpath("(//li[@data-id='menu_account'])[1]");
    By username = By.xpath ("//input[@name='loginname']");
    By password = By.xpath ("//input[@name='password']");
    By button = By.xpath("//button[@title='Login']");
    By status = By.xpath("//span[@class= 'maintext']");
    By logout = By.xpath("//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[10]/a");
    By confirmLogout = By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/section/a");
    By logoutStatus = By.xpath("//*[@id=\"banner_slides\"]/div[1]");
// new Resistration
    By resister = By.xpath("//button[@title='Continue']");
    By firstName = By.xpath("//input[@name='firstname']");
    By lastName = By.xpath("//input[@name='lastname']");
    By email = By.xpath("//input[@id='AccountFrm_email']");
    By address = By.xpath("//input[@id='AccountFrm_address_1']");
    By city = By.xpath("//input[@id='AccountFrm_city']");
    By zipCode = By.xpath("//input[@id='AccountFrm_postcode']");
    By loginName = By.xpath("//input[@id='AccountFrm_loginname']");
    By pass = By.xpath("//input[@id='AccountFrm_password']");
    By confirmPass = By.xpath("//input[@id='AccountFrm_confirm']");
    By checkbox = By.xpath("//input[@id='AccountFrm_agree']");
    By submitButton = By.xpath("//button[@title='Continue']");
    By myAccount = By.xpath("//span[@class='maintext']");







    public void displayAccountPage()
    {
        driver.findElement(accountLink).isDisplayed();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(accountLink).click();

    }

    public String getAccountPageTitle()

    {
        return driver.getTitle();
    }

     public void checkLogin()
    {
        driver.findElement(username).sendKeys("Annysmith123");
        driver.findElement(password).sendKeys("Anny@123");
        driver.findElement(button).click();
        if (driver.findElement(status).isDisplayed())
        {
            System.out.println("login succesful");
        }
        else
        {
            System.out.println("login failed");
        }
        driver.findElement(logout).click();
        driver.findElement(confirmLogout).click();
        if (driver.findElement(logoutStatus).isDisplayed()){
            System.out.println("logout succesful");
        }
        else{
            System.out.println("logout failed");
        }

    }

    public void resisterNewUser()
    {
        driver.findElement(accountLink).click();

        driver.findElement(resister).click();
        driver.findElement(firstName).sendKeys("Ash");
        driver.findElement(lastName).sendKeys("smith");
        driver.findElement(email).sendKeys("ashsmith@gmail.com");
        driver.findElement(address).sendKeys("abcd");
        driver.findElement(city).sendKeys("xyza");
        Select regionElement = new Select(driver.findElement(By.xpath("//select[@id='AccountFrm_zone_id']")));
        regionElement.selectByVisibleText("Angus");
        driver.findElement(zipCode).sendKeys("12345");
        Select CountryElement = new Select(driver.findElement(By.xpath("//select[@id='AccountFrm_country_id']")));
        CountryElement.selectByVisibleText("United Kingdom");
        driver.findElement(loginName).sendKeys("Ashsmith");
        driver.findElement(pass).sendKeys("Ash@123");
        driver.findElement(confirmPass).sendKeys("Ash@123");
        driver.findElement(checkbox).click();
        driver.findElement(submitButton).click();
        if (driver.findElement(myAccount).isDisplayed())
        {
            System.out.println("Resistration is succesful");
        }
        else
        {
            System.out.println("Resistation failed");
        }
    }
}

