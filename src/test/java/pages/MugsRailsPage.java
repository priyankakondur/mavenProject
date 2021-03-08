package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MugsRailsPage {
    //declaration
@FindBy(xpath = "//a[text()='Mugs']")
private WebElement mugsButton;
@FindBy(xpath = "//h4[text()=' Price Range ']/following-sibling::ul/li[3]")
    private WebElement priceRange15_18;
@FindBy(className = "btn btn-primary")
    private WebElement searchFilterForPrice;
@FindBy(xpath = "//*[text()='Ruby on Rails Stein']")
    private WebElement rubyOnRailsSteinItem;
@FindBy(id="add-to-cart-button")
    private WebElement addToCartButton;
    @FindBy(xpath = "//a[text()='Rails']")
    private WebElement railsButton;
@FindBy(xpath= "//h4[text()=' Price Range ']/following-sibling::ul/li[2]")
    private WebElement priceRange10_15;
@FindBy(xpath="//*[text()='Ruby on Rails Mug']")
    private WebElement rubyOnRailsMugItem;


    // initialization
    public MugsRailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //utilization
    public void addMugItemToCart(){
        mugsButton.click();
        priceRange15_18.click();
        rubyOnRailsSteinItem.click();
        addToCartButton.click();

    }
    public void addRailsItemToCart(){
        railsButton.click();
        priceRange10_15.click();
        rubyOnRailsMugItem.click();
        addToCartButton.click();

    }

}
