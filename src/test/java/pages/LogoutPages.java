package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPages {
    @FindBy(xpath = "//input[@value='Logout']")
    private WebElement submitLogoutButton;
    @FindBy(xpath = "//*[text()='Logged out successfully']")
    private WebElement logoutSuccessMessage;

    // initialization
    public LogoutPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //utilization
    public void clickLogoutButton() {
        submitLogoutButton.click();
    }
    public String verifyLogoutSuccessMessage(){
        String successMessage = logoutSuccessMessage.getText();
        return successMessage;
    }
}
