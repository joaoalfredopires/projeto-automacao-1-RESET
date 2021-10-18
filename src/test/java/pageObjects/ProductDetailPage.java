package pageObjects;

import elementMapper.ProductDetailPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductDetailPage extends ProductDetailPageElementMapper {

    public ProductDetailPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getProductNameOnPDP(){
        return productNameOnPDP.getText();
    }

    public String getTextOurPriceDisplay(){
        return ourPriceDisplay.getText();
    }

    public String getTextLayer_cart_product_quantity(){
        return layer_cart_product_quantity.getText();
    }

    @Step("Clica no botão Add to cart")
    public void clickAddToCartButtonOnPDP(){
        addToCartButtonOnPDP.click();
    }

    @Step("Clica no botão Preceed to checkout no modal")
    public void clickProceedToCheckoutButtonOnPDP(){
        proceedToCheckoutButtonOnModalPDP.click();
    }

    @Step("Seleciona o tamanho desejado do produto")
    public void selectSize(){
        group_1.sendKeys("m");
    }

    @Step("Seleciona a cor desejada do produto")
    public void selectColor(){
        color_15.click();
    }
}
