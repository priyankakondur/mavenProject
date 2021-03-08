package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

 public class HomePage {
    //declaration
    @FindBy(id = "home-link")
    private WebElement homeButton;
    @FindBy(id = "link-to-cart")
    private WebElement cartButton;

    @FindBys(@FindBy(xpath = "//h4[text()='Shop by Categories']/following-sibling::div[1]/a"))
    private List<WebElement> allCategories;

    @FindBys(@FindBy(xpath = "//h4[text()='Shop by Brands']/following-sibling::div[1]/a"))
    private List<WebElement> allBrands;

    @FindBy(xpath = "//h1[text()='Mugs']")
    private WebElement mugsTitleMessage;

    @FindBy(xpath = "//h1[text()='Rails']")
    private WebElement railsTitleMessage;

    // initialization
 public HomePage(WebDriver driver){PageFactory.initElements(driver,this);}

    //utilization
    public void clickHomeButton() {
        homeButton.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public List<WebElement> listAllCategories() {
        for (WebElement category:allCategories) {
            System.out.println( category.getText());

        }

        return allCategories;

    }
    public List<WebElement> listAllBrands() {
        for (WebElement brand:allBrands) {
            System.out.println( brand.getText());

        }
        return allBrands;
    }
    public String verifyMugsPage(){
        String mugsTitle = mugsTitleMessage.getText();
        return mugsTitle;
    }
    public String verifyRailsPage(){
        String railsTitle = railsTitleMessage.getText();
        return railsTitle;
    }
}