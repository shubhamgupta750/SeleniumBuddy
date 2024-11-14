package org.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MakeUpTest extends BaseTest {
    public MakeUpTest(WebDriver driver) {
        
    }

    @Test
    public void verifyMakeupPageTitle() {//
        MakeUpTest makeUpTest = new MakeUpTest(driver);
        //MakeUp verifyMakeupPageTitle = null;
        MakeUp verifyMakeupPageTitle = null;
        verifyMakeupPageTitle.makeup();
    }

}