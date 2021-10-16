package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPageElementMapper {

    @FindBy(css = "#cart_summary .cart_description .product-name a")
    public WebElement productNameOnCartPage;
}
