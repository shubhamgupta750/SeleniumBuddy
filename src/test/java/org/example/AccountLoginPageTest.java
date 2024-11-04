package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountLoginPageTest extends BaseTest {

    @Test
    public void verifyCreateAccountPageTitle() {
        AccountLoginPage accountLoginPage = new AccountLoginPage(driver);
        accountLoginPage.navigateToCreateAccountPage();
        Assert.assertEquals(accountLoginPage.getPageTitle(), "Create Account");
    }

    @Test
    public void verifyMandatoryFieldValidation(){
        AccountLoginPage accountLoginPage = new AccountLoginPage(driver);
        accountLoginPage.navigateToCreateAccountPage();
        accountLoginPage.checkNullValidations();
    }

    @Test
    public void verifyCreateAccount(){
        AccountLoginPage accountLoginPage = new AccountLoginPage(driver);
        accountLoginPage.navigateToCreateAccountPage();
        accountLoginPage.sendDataToCreateAccountForm(true,true);
        Assert.assertEquals(accountLoginPage.getPageTitle(), "Your Account Has Been Created!");
    }

    @Test
    public void verifyCreateAccountWithExistingEmail(){
        AccountLoginPage accountLoginPage = new AccountLoginPage(driver);
        accountLoginPage.navigateToCreateAccountPage();
        accountLoginPage.sendDataToCreateAccountForm(false,true);
        accountLoginPage.checkExistingEmailValidationMessage();
    }

    @Test
    public void verifyCreateAccountWithExistingLoginName(){
        AccountLoginPage accountLoginPage = new AccountLoginPage(driver);
        accountLoginPage.navigateToCreateAccountPage();
        accountLoginPage.sendDataToCreateAccountForm(true,false);
        accountLoginPage.checkExistingLoginNameValidationMessage();
    }


}
