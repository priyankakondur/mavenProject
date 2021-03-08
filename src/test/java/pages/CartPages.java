package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPages {
    //declaration
    @FindBy(className = "cart-item-delete>a")
    private WebElement deleteFirstItemInCart;
    @FindBy(xpath="//h1[text()='Shopping Cart']")
    private WebElement shoppingCartMessage;
    @FindBy(xpath = "//input[@value='Empty Cart']")
    private WebElement emptyCartButton;
    @FindBy(xpath = "//a[text()='Continue shopping']")
    private WebElement continueShoppingButton;
    @FindBy(xpath="//*[@class='warning cart-total']//following::td[2]")
    private WebElement cartTotalAmount;

    // initialization
    public CartPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //utilization
    public void deleteAnItemFromCart(){
        deleteFirstItemInCart.click();
    }
    public void deleteAllItemsFromCart(){
        emptyCartButton.click();
    }
    public String verifyShoppingCartPage(){
        String shoppingCartPage = shoppingCartMessage.getText();
        return shoppingCartPage;
    }
    public void clickContinueShopping(){
        continueShoppingButton.click();
    }
    public void getCartTotalAmount(){
        String cartamount = cartTotalAmount.getText();
        System.out.println("total cart amount: " +cartamount);

    }
}
