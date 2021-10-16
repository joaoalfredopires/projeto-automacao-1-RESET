package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.ws.wsaddressing.W3CEndpointReference;

public class ProductDetailPageElementMapper {

    @FindBy(css = "h1[itemprop=name]")
    public WebElement productNameOnPDP;

    @FindBy(css = "#add_to_cart > button")
    public WebElement addToCartButtonOnPDP;

    @FindBy(css = "a[title='Proceed to checkout'] > span")
    public WebElement proceedToCheckoutButtonOnModalPDP;

}
