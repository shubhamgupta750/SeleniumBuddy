package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginJourneyTest extends BaseTest {
	
	@Test
    public void verifyLoginclick() throws InterruptedException {	
	LoginPage text=new LoginPage(driver);
		 text.Loginclicks();
		 text.continuebutton();
		 Thread.sleep(2000);
		 text.creataccount(); 
		String successMessage = text.getSuccessText(); 
		Assert.assertEquals(successMessage, "Congratulations! Your new account has been successfully created!");
	}
}