package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ContactUsPageTest extends BaseTest {
    @Test
    public void verifyContactUsPageTitle() {
        //HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.clickOnContactUs();


        String title = contactUsPage.getContactUsPageTitle();
        Assert.assertEquals(title, "Contact Us");
    }

    @Test
    public void verifyHeadingText() {
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.clickOnContactUs();

        String heading = contactUsPage.getHeadingText();
        Assert.assertEquals(heading, "CONTACT US");
    }
}
