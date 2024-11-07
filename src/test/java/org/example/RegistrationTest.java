package org.example;

import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    @Test
    public void Registration(){
        Registration Registration = new Registration(driver);
        Registration.registationform();
      //  Registration.altermessage();
        Registration.logout();

    }

}
