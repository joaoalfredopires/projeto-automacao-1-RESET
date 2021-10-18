package pageObjects;

import elementMapper.CartPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartPage extends CartPageElementMapper {

    public CartPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getProductNameOnCartPage(){
        return productNameOnCartPage.getText();
    }

    public String getTextCartQuantity(){
        return cartQuantity.getText();
    }

    public String getTextTotal_Product(){
        return total_product.getText();
    }
    public String getTextTotal_price(){
        return total_price.getText();
    }

    public String getTextProductNameOnPayment(){
        return productNameOnPayment.getText();
    }

    public String getTextAmount(){
        return amount.getText();
    }

    public String getTextOrderCompleteMessage(){
        return orderCompleteMessage.getText();
    }

    @Step("Click em Proceed to checkout na guia Summary do carrinho")
    public void clickButtonProceedToCheckoutSummary(){
        buttonProceedToCheckoutSummary.click();
    }

    @Step("Click no botão Submit para continuar a compra")
    public void clickButtonSubmit(){
        buttonSubmit.click();
    }

    @Step("Aceita os termos de serviço")
    public void clickCheckTermsOfService(){
        checkTermsOfService.click();
    }

    @Step("Click no botão Pay by bankwire")
    public void clickBankwireButton(){
        bankwireButton.click();
    }
}
