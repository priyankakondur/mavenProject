package tests;

import general.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.List;



public class VerifyShopByCategoriesButtonsTest extends BaseTest {


    @Test
    public void selectMugsCategory(){
        HomePage hp = new HomePage(driver);
        List<WebElement> categories = hp.listAllCategories();
         categories.get(1).click();
         String mugsTitle = hp.verifyMugsPage();
        Assert.assertEquals(mugsTitle,"Mugs");

    }

}
