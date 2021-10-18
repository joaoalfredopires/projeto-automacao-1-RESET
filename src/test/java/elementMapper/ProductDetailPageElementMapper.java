package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPageElementMapper {

    @FindBy(css = "h1[itemprop=name]")
    public WebElement productNameOnPDP;

    @FindBy(css = "#add_to_cart > button")
    public WebElement addToCartButtonOnPDP;

    @FindBy(css = "a[title='Proceed to checkout'] > span")
    public WebElement proceedToCheckoutButtonOnModalPDP;

    @FindBy(css = "#our_price_display")
    public WebElement ourPriceDisplay; //Preço do produto na PDP

    public WebElement group_1; //Seletor de tamanho

    public WebElement color_15; //Seletor cor verde

    public WebElement layer_cart_product_quantity; //Confirma a quantidade de produtos a ser adicionada ao carrinho;
}
