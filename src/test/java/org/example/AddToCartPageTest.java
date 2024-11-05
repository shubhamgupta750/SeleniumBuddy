package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartPageTest extends BaseTest {

	@Test
	public void Addtocartflow() throws InterruptedException {
		AddToCart addtocart = new AddToCart(driver);
		addtocart.Loginclick();
		String text= addtocart.getCheekspageTitle();
		Assert.assertEquals(text, "Cheeks");
	}
}
