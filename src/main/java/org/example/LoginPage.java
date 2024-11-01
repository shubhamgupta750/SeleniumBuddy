package org.example;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    String generatestring = RandomStringUtils.randomAlphabetic(6);
    String Finalstring = generatestring+"@gmail.com";
    
//Locator
   By LoginTextclick= By.xpath("//div//ul//li//a[text()='Login or register']");
   By ContinueBtn = By.xpath("//button[@title='Continue']");
   By FirstName= By.xpath("//input[@id='AccountFrm_firstname']");
   By LastName= By.xpath("//input[@id='AccountFrm_lastname']");
   By Email= By.xpath("//input[@id='AccountFrm_email']");
   By Telephone= By.xpath("//input[@id='AccountFrm_telephone']");
   By Company= By.xpath("//input[@id='AccountFrm_company']");
   By Address1 = By.xpath("//input[@id='AccountFrm_address_1']");
   By City = By.xpath("//input[@id='AccountFrm_city']");
   By Zipcode = By.xpath("//input[@id='AccountFrm_postcode']");
   By country = By.xpath("//select[@id='AccountFrm_country_id']");
   By Loginname= By.xpath("//input[@id='AccountFrm_loginname']");
   By Password= By.xpath("//input[@id='AccountFrm_password']");
   By Passwordconfirm= By.xpath("//input[@id='AccountFrm_confirm']");
   By PrivacyPolicy= By.xpath("//input[@id='AccountFrm_agree']");
   By Continue= By.xpath("//button[@type='submit']");
   By Accntscsmessage= By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']"); 

//Methods
 public void Loginclicks() {
    driver.findElement(LoginTextclick).click();
}

public void continuebutton() {
	 driver.findElement(ContinueBtn).click();
}

public void creataccount() {
	
	driver.findElement(FirstName).sendKeys("rimi");
	driver.findElement(LastName).sendKeys("singh");
	driver.findElement(Email).sendKeys(Finalstring);
	driver.findElement(Telephone).sendKeys("08265862998");
	driver.findElement(Company).sendKeys("Srijan Technology Delhi");
	driver.findElement(Company).sendKeys("Shastri Nagar");
	driver.findElement(Address1).sendKeys("Srijan Technologies");
	driver.findElement(City).sendKeys("Ghazibad");
	WebElement staticdropdown = driver.findElement(By.id("AccountFrm_zone_id"));
	Select dropdown = new Select(staticdropdown);
	dropdown.selectByIndex(3);
	driver.findElement(Zipcode).sendKeys("201017");
	driver.findElement(country).click();
	driver.findElement(Loginname).sendKeys(generatestring);
	driver.findElement(Password).sendKeys("qwe17rty");
	driver.findElement(Passwordconfirm).sendKeys("qwe17rty");
	driver.findElement(PrivacyPolicy).click();
	driver.findElement(Continue).click();
	System.out.println(driver.findElement(Accntscsmessage).getText());
}	

public String getSuccessText() {
    return driver.findElement(Accntscsmessage).getText();
}	
}