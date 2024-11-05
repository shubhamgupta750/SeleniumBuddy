package org.example;

import org.testng.annotations.Test;

public class OrderPageTest extends BaseTest {

    @Test
    public void CheckOrder()
    {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.OrderItems();
    }

}
