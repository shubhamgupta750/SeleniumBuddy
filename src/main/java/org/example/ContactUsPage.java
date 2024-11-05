package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ContactUsPage {
    WebDriver driver;

    // Constructor
    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By heading = By.tagName("h1");
    By address = By.xpath("//*[@class = \"col-md-6 pull-left\"]");
    By phoneNum = By.xpath("//*[@class = 'col-md-6 pull-right']");
    By loginTitel = By.xpath("//*[@class = 'heading3 form_description']");
    By firstName = By.xpath("//*[@id = 'ContactUsFrm_first_name']");
    By email = By.xpath("//*[@id = 'ContactUsFrm_email']");
    By enquiry = By.xpath("//*[@id = 'ContactUsFrm_enquiry']");
    By resetButton = By.xpath("//*[@class='btn btn-default pull-left']");
    By submitButton = By.xpath("//*[@class='btn btn-primary lock-on-click']");

    // Methods
    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public String getContactUsPageTitle() {
        return driver.getTitle();
    }

    public String getAddressText() {
        return driver.findElement(address).getText();
    }

    public String getPhoneText() {
        return driver.findElement(phoneNum).getText();
    }

    public String getLoginSectTitle(){
        return driver.findElement(loginTitel).getText();
    }

    //Method to set First name
    public String setFirstName(String firstName) {
        //sending i/p
        driver.findElement(this.firstName).sendKeys(firstName);

        //to check i/p
        return driver.findElement(this.firstName).getAttribute("value");
    }

    //Method to check password
    public String setEmail(String email) {
        //sending i/p
        driver.findElement(this.email).sendKeys(email);

        //to check i/p
        return driver.findElement(this.email).getAttribute("value");
    }

    //Method to check enquiry
    public boolean setEnquiry(String enquiry) {
        //sending i/p
        driver.findElement(this.enquiry).sendKeys(enquiry);

        //to check i/p
        return driver.findElement(this.enquiry).getAttribute("value").isEmpty();
    }

    //check if reset button is present
    public void  resetButton(){
        driver.findElement(this.resetButton).isDisplayed();
    }

    //check if submit button is present
    public void  submitButton(){
        driver.findElement(this.submitButton).isDisplayed();
    }

}
