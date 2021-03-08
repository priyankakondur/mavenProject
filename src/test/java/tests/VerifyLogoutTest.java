package tests;

import general.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePages;
import pages.LogoutPages;

import java.io.IOException;

public class VerifyLogoutTest extends BaseTest {
    @Test
    public void logout() throws IOException {
        BasePages bp = new BasePages(driver);

        bp.logout();
        LogoutPages lout = new LogoutPages(driver);
        String message = lout.verifyLogoutSuccessMessage();
        Assert.assertEquals(message, "Logged out successfully");
        takeScreenshot();
    }
}