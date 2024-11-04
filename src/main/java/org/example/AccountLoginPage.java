package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class AccountLoginPage extends BasePage {
    WebDriver driver;
    public AccountLoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // ----Locators
    By loginLink = By.linkText("Login or register");
    By registerRadioButton = By.id("accountFrm_accountregister");
    By registerContinueButton = By.xpath("//button[@title='Continue']");
    By createUserContinueButton = By.xpath("//button[@title='Continue']");

    By firstNameField = By.id("AccountFrm_firstname");
    By firstNameErrorMessage = By.xpath("//span[text()='First Name must be between 1 and 32 characters!']");

    By lastNameField = By.id("AccountFrm_lastname");
    By lastNameErrorMessage = By.xpath("//span[text()='Last Name must be between 1 and 32 characters!']");

    By emailField = By.id("AccountFrm_email");
    By emailNullErrorMessage = By.xpath("//span[text()='Email Address does not appear to be valid!']");
    By existingEmailErrorMessage = By.xpath("//div[text()='\nError: E-Mail Address is already registered!']");

    By telephoneField = By.id("AccountFrm_telephone");
    By faxField = By.id("AccountFrm_fax");
    By companyField = By.id("AccountFrm_company");

    By address1Field = By.id("AccountFrm_address_1");
    By address1ErrorMessage = By.xpath("//span[text()='Address 1 must be between 3 and 128 characters!']");
    By address2Field = By.id("AccountFrm_address_2");

    By cityField = By.id("AccountFrm_city");
    By cityErrorMessage = By.xpath("//span[text()='City must be between 3 and 128 characters!']");

    By regionStateField = By.id("AccountFrm_zone_id");
    By regionStateErrorMessage = By.xpath("//span[text()='Please select a region / state!']");

    By zipCodeField = By.id("AccountFrm_postcode");
    By zipCodeErrorMessage = By.xpath("//span[text()='Zip/postal code must be between 3 and 10 characters!']");

    By countryField = By.id("AccountFrm_country_id");

    By loginNameField = By.id("AccountFrm_loginname");
    By loginNameNullErrorMessage = By.xpath("//span[text()='Login name must be alphanumeric only and between 5 and 64 characters!']");
    By existingLoginNameErrorMessage = By.xpath("//span[text()='This login name is not available. Try different login name!']");

    By passwordField = By.id("AccountFrm_password");
    By passwordErrorMessage = By.xpath("//span[text()='Password must be between 4 and 20 characters!']");

    By confirmPasswordField = By.id("AccountFrm_confirm");

    By privacyPolicyErrorMessage = By.xpath("//div[text()='\nError: You must agree to the Privacy Policy!']");
    By privacyPolicyCheckBox = By.id("AccountFrm_agree");

    By subscribeRadioButton = By.id("AccountFrm_newsletter1");

    //Methods

    public String getPageTitle(){
        return driver.getTitle();
    }

    public void navigateToCreateAccountPage() {
        click(driver.findElement(loginLink));
        //if loop to check of the register account radio button is checked
        if (driver.findElement(registerRadioButton).isSelected()) {
            click(driver.findElement(registerContinueButton));
        }
        else {
            click(driver.findElement(registerRadioButton));
            click(driver.findElement(registerContinueButton));
        }
    }

    //verify empty form validation messages
    public void checkNullValidations(){
        click(driver.findElement(registerContinueButton));
        isDisplayed(driver.findElement(firstNameErrorMessage));
        isDisplayed(driver.findElement(lastNameErrorMessage));
        isDisplayed(driver.findElement(emailNullErrorMessage));
        isDisplayed(driver.findElement(address1ErrorMessage));
        isDisplayed(driver.findElement(cityErrorMessage));
        isDisplayed(driver.findElement(regionStateErrorMessage));
        isDisplayed(driver.findElement(zipCodeErrorMessage));
        isDisplayed(driver.findElement(loginNameNullErrorMessage));
        isDisplayed(driver.findElement(passwordErrorMessage));
        isDisplayed(driver.findElement(privacyPolicyErrorMessage));
    }

    //verify existing login name validation messages
    public void checkExistingLoginNameValidationMessage() {
        click(driver.findElement(registerContinueButton));
        isDisplayed(driver.findElement(existingLoginNameErrorMessage));
    }

    //verify existing email validation messages
    public void checkExistingEmailValidationMessage() {
        click(driver.findElement(registerContinueButton));
        isDisplayed(driver.findElement(existingEmailErrorMessage));
    }

    //send valid data to create account form
    public void sendDataToCreateAccountForm(Boolean isNewEmail,Boolean isNewLoginName) {
        String randomString = randomStringGenerator(4);
        clearAndSendKeys(driver.findElement(firstNameField), "TestUserfirstname");
        clearAndSendKeys(driver.findElement(lastNameField), "TestUserlastname");
        if(isNewEmail) {
            clearAndSendKeys(driver.findElement(emailField), "TestUser" + randomString + "@email.com");
        }
        else {
            clearAndSendKeys(driver.findElement(emailField), "testabhi@test.com"); //existing user email address
        }
        clearAndSendKeys(driver.findElement(telephoneField), "1234567890");
        clearAndSendKeys(driver.findElement(faxField), "11111");
        clearAndSendKeys(driver.findElement(companyField), "TestUserCompany");
        clearAndSendKeys(driver.findElement(address1Field), "TestUser address 1");
        clearAndSendKeys(driver.findElement(address2Field), "TestUser address 2");
        clearAndSendKeys(driver.findElement(cityField), "TestUser city");
        Select regionDropdown = new Select(driver.findElement(regionStateField));
        regionDropdown.selectByIndex(1);
        clearAndSendKeys(driver.findElement(zipCodeField), "11111");
        Select countryDropdown = new Select(driver.findElement(countryField));
        countryDropdown.selectByVisibleText("United Kingdom");
        if(isNewLoginName) {
            clearAndSendKeys(driver.findElement(loginNameField), "TestUser_Loginname" + randomString);
        }
        else {
            clearAndSendKeys(driver.findElement(loginNameField), "abhi123"); //existing user login name
        }
        clearAndSendKeys(driver.findElement(passwordField), "TestUser_password");
        clearAndSendKeys(driver.findElement(confirmPasswordField), "TestUser_password");
        click(driver.findElement(subscribeRadioButton));
        click(driver.findElement(privacyPolicyCheckBox));
        click(driver.findElement(createUserContinueButton));


    }
}
