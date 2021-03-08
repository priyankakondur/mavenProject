package tests;


import general.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPages;
import pages.MugsRailsPage;

import java.io.IOException;

public class AddItemsToCartTest extends BaseTest {
    @Test
    public void addMugsRailsItemsToCart() throws IOException {
        MugsRailsPage mugsRailsPage = new MugsRailsPage(driver);
       MugsRailsPage mrp = new MugsRailsPage(driver);
        mrp.addMugItemToCart();
        CartPages cp = new CartPages(driver);
        String cartPage = cp.verifyShoppingCartPage();
        Assert.assertEquals(cartPage,"Shopping Cart");
        cp.clickContinueShopping();
        mrp.addRailsItemToCart();
        cp.getCartTotalAmount();
        takeScreenshot();
    }
}
