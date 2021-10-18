package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPageElementMapper {

    @FindBy(css = "#cart_summary .cart_description .product-name a")
    public WebElement productNameOnCartPage;

    @FindBy(css = ".cart_quantity input")
    public WebElement cartQuantity;

    public WebElement total_product;

    public WebElement total_price;

    @FindBy(css = ".cart_description .product-name a")
    public WebElement productNameOnPayment;

    @FindBy(css = ".cart_navigation a[title='Proceed to checkout'] span")
    public WebElement buttonProceedToCheckoutSummary;

    @FindBy(css = ".cart_navigation button[type='submit'] span")
    public WebElement buttonSubmit;

    @FindBy(css = "#uniform-cgv span")
    public WebElement checkTermsOfService;

    @FindBy(className = "bankwire")
    public WebElement bankwireButton;

    public WebElement amount;

    @FindBy(css = ".box .cheque-indent .dark")
    public WebElement orderCompleteMessage;

}
