package org.example;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test
    public void login(){
   // HomePage homePage = new HomePage(driver);
    Login login = new Login(driver);
    login.loginform();

    }


}
