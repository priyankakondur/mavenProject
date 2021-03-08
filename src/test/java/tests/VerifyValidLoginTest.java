package tests;
import general.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePages;
import pages.LoginPages;


import java.io.IOException;

public class VerifyValidLoginTest extends BaseTest {
    @Test
    public void enterEmailPassword() throws IOException, InterruptedException {
      BasePages bp = new BasePages(driver);
        bp.loginFromBasePage();
        LoginPages lp = new LoginPages(driver);
       // lp.testLoginIssue();
       lp.setEmail("priyanka.jkondur@gmail.com");
        lp.setPassword("welcome123");
        lp.checkRememberMe();
        lp.clickLoginButton();
        String message = lp.verifyLoginSuccessMessage();
        Assert.assertEquals(message,"Logged in successfully");
        takeScreenshot();
    }

}
