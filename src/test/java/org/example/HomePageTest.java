package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    @Test
    public void verifyHomePageTitle() {
        HomePage homePage = new HomePage(driver);
        String title = homePage.getHomePageTitle();
        System.out.println(title);
        Assert.assertEquals(title, "A place to practice your automation skills!");

    }

    @Test
    public void navigateToContactUsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.displayContactUs();
    }

}
