package org.example;

import org.testng.annotations.Test;

public class SpecialOfferTest extends BaseTest {

    @Test
    public void addToCart() {
        SpecialOfferPage specialOffer = new SpecialOfferPage(driver);
        specialOffer.addProduct();


    }
}
