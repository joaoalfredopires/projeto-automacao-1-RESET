package pageObjects;

import elementMapper.ProductDetailPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductDetailPage extends ProductDetailPageElementMapper {

    public ProductDetailPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getProductNameOnPDP(){
        return productNameOnPDP.getText();
    }

    public void clickAddToCartButtonOnPDP(){
        addToCartButtonOnPDP.click();
    }

    public void clickProceedToCheckoutButtonOnPDP(){
        proceedToCheckoutButtonOnModalPDP.click();
    }
}
