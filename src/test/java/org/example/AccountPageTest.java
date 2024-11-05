package org.example;

import org.testng.annotations.Test;

public class AccountPageTest extends BaseTest
{



    @Test
    public void verifyAccountPageTitle()
    {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.displayAccountPage();

        String PageTittle= accountPage.getAccountPageTitle();
        System.out.println(PageTittle);


    }


    @Test
     public void CheckLogin()
    {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.displayAccountPage();
        accountPage.checkLogin();

   }

   @Test
    public void resisterNewUser()
    {
       AccountPage accountPage = new AccountPage(driver);
       accountPage.resisterNewUser();

   }
}
