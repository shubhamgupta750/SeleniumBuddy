package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

//    Locators
    By forgotPassword = By.xpath("//a[normalize-space()='Forgot your password?']");
    By forgotLogin = By.xpath("//a[normalize-space()='Forgot your login?']");


    @Test
    public void verifyLoginPageTitle() {
        LoginPage loginpage = new LoginPage(driver);
        String title = loginpage.getHomePageTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Account Login");
    }

    @Test
    public void verifyHeadingText() {
        LoginPage loginpage = new LoginPage(driver);
        String heading = loginpage.getHeadingText();
        Assert.assertEquals(heading, "ACCOUNT LOGIN");
    }

    @Test
    public void verifyNewCustomerBoxText() {
        LoginPage loginpage = new LoginPage(driver);
        String heading = loginpage.getloginText(0);
        Assert.assertEquals(heading, "I AM A NEW CUSTOMER.");
    }

    @Test
    public void verifyRegisterAccountRadioButton() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.getRegisterButtonValue();
    }

    @Test
    public void verifyContinueButton() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.verifyContinueButton();
    }

    @Test
    public void verifyReturningCustomerBoxText() {
        LoginPage loginpage = new LoginPage(driver);
        String heading = loginpage.getloginText(1);
        Assert.assertEquals(heading, "RETURNING CUSTOMER");
    }

    @Test
    public void verifyLoginName() {
        LoginPage loginpage = new LoginPage(driver);
        String logintext = loginpage.verifyLoginText();
        Assert.assertEquals(logintext, "sahildeosekar");
    }

    @Test
    public void verifyLoginPassword() {
        LoginPage loginpage = new LoginPage(driver);
        String passwordtext = loginpage.verifyLoginPassword();
        Assert.assertEquals(passwordtext, "sahil@1234");
    }

    @Test
    public void verifyForgotPassword() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.verifyForgotPasswordLogin(forgotPassword);
    }

    @Test
    public void verifyForgotLogin() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.verifyForgotPasswordLogin(forgotLogin);
    }

    @Test
    public void verifyLogoutButton() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.verifyLoginButton();
    }
}
