package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
    WebDriver driver;
   //declaration
    @FindBy(id = "spree_user_email")
    private WebElement emailField;
    @FindBy(css = "[type='password']")
    private WebElement passwordField;
    @FindBy(id = "spree_user_remember_me")
    private WebElement rememberMeCheckbox;
    @FindBy(xpath = "//input[@value='Login']")
    private WebElement submitLoginButton;
    @FindBy(xpath = "//*[text()='Logged in successfully']")
    private WebElement loginSuccessMessage;

  // initialization
  public LoginPages(WebDriver driver) {
      this.driver= driver;
      PageFactory.initElements(driver, this);
}

   //utilization
    public void setEmail(String email) {
        emailField.sendKeys(email);
    }
    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }
    public void checkRememberMe() {
        rememberMeCheckbox.click();
    }
    public void clickLoginButton() {
        submitLoginButton.click();
    }
    public void clickRememberMe(){
        if (rememberMeCheckbox.isSelected()) {
            System.out.println("Remember me checkbox is already selected");
        }
        else{
            System.out.println("checking remember me checkbox now");
            rememberMeCheckbox.click();
        }

    }
    public String verifyLoginSuccessMessage(){
      String successMessage = loginSuccessMessage.getText();
      return successMessage;
    }
    public void testLoginIssue(){
        System.out.println("testLogin Issue -----------------");
    }
}
