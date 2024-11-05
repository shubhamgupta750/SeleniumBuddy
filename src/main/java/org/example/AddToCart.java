package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {

	WebDriver driver;

	// Constructor
	public AddToCart(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	By LoginText = By.xpath("//ul/li/a[text()='Login or register']");
	By LoginName = By.xpath("//input[@id='loginFrm_loginname']");
	By Password = By.xpath("//input[@id='loginFrm_password']");
	By Loginbtn = By.xpath("//button[@type='submit']");
	By hoverElement = By
			.xpath("//ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=36']");
	By Cheeks = By.xpath("//a[contains(text(), 'Cheeks')]");

	// Methods
	public void Loginclick() {
		driver.findElement(LoginText).click();
		driver.findElement(LoginName).sendKeys("NupurGoel");
		driver.findElement(Password).sendKeys("automationteststore");
		driver.findElement(Loginbtn).click();
		WebElement hoverElement = driver.findElement(
        By.xpath("//ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=36']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(hoverElement).perform();
		driver.findElement(Cheeks).click();

	}
	public String getCheekspageTitle() {
		return driver.getTitle();
	}
}