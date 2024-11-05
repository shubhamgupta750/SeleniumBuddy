package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ContactUsPageTest extends BaseTest {
    @Test
    public void verifyContactUsPageTitle() {
       /* HomePage homePage = new HomePage(driver);
        homePage.displayContactUs();*/

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        String title = contactUsPage.getContactUsPageTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Contact Us");
    }

    @Test
    public void verifyHeadingText() {
        /*HomePage homePage = new HomePage(driver);
        homePage.displayContactUs();*/

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        String heading = contactUsPage.getHeadingText();
        Assert.assertEquals(heading, "CONTACT US");
    }

    @Test
    public void verifyAdress() {
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        String address = contactUsPage.getAddressText();
        //System.out.println(address);
        Assert.assertEquals(address, "Address:\n" +
                "Automation Test Store\n" +
                "123 Main Street\n" +
                "Kensington\n" +
                "London\n" +
                "SW7 1AA");
    }

    @Test
    public void verifyPhone(){
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        String phone = contactUsPage.getPhoneText();
        //System.out.println(phone);
        Assert.assertEquals(phone, "Telephone:\n" + "012345 6781199");
    }

    @Test
    public void verifyLoginText(){
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        String lTitle = contactUsPage.getLoginSectTitle();
        Assert.assertEquals(lTitle, "Contact Us Form");
    }

    @Test
    public void NameInput(){
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        String nameTxt = contactUsPage.setFirstName("First_Name");
        Assert.assertEquals(nameTxt, "First_Name");
    }

    @Test
    public void emailInput(){
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        String nameTxt = contactUsPage.setFirstName("NameOne@gmail.com");
        Assert.assertEquals(nameTxt, "NameOne@gmail.com");
    }

    @Test
    public void enquiryInput(){
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        boolean status = contactUsPage.setEnquiry("Test Enquiry");
        System.out.println(status? "Text Box Empty": "Text Box Not Empty");
    }

    @Test
    public void resetButton() {
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.resetButton();
    }

    @Test
    public void submitButton() {
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.submitButton();
    }


}
