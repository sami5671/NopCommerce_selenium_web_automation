package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SearchPage;
import pages.CartPage;

public class NopCommerceTest extends BaseTest {

    @Test
    public void verifyAddToCartFlow() {

        LoginPage login = new LoginPage(driver);
        SearchPage search = new SearchPage(driver);
        CartPage cart = new CartPage(driver);

        login.login("testuser@gmail.com", "test123");
        Assert.assertTrue(login.isLoginSuccessful(), "Login Failed");

        search.searchProduct("MacBook");

        cart.addToCart();
        Assert.assertTrue(cart.isProductAdded(), "Product not added to cart");
    }
}
