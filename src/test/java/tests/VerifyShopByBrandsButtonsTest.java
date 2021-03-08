package tests;

import general.BaseTest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


import java.util.List;

public class VerifyShopByBrandsButtonsTest extends BaseTest {
    @Test
    public void selectRailsBrand() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        List<WebElement> brands = hp.listAllBrands();
        brands.get(3).click();
        String brandsTitle = hp.verifyRailsPage();
        Assert.assertEquals(brandsTitle,"Rails");
        Thread.sleep(1000);
    }
}
