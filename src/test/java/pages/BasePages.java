package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePages {
    //declaration
   @FindBy(id = "link-to-login")
    private WebElement loginButton;
    @FindBy(linkText = "Logout")
    private WebElement logoutButton;
    @FindBy(linkText = "My Account")
    private WebElement myAccountButton;


    // initialization
    public BasePages(WebDriver driver){PageFactory.initElements(driver,this);}

        //utilization
       public void loginFromBasePage() throws InterruptedException {
            loginButton.click();
        }

        public void logout(){
        logoutButton.click();
        }

    }

