package testes;

import io.qameta.allure.*;
import org.junit.Test;
import pageObjects.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//DESAFIO WEB - FLUXO DE COMPRA

@Feature("Fluxo de compra realizada com sucesso")
public class FullPurchaseTest extends BaseTestes{

    @Test
    @Description("Fazer a compra de um produto a partir da tela inicial")
    @Severity(SeverityLevel.CRITICAL)
    public void testFullPurchase(){

        //Iniciar as páginas
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        MyAccountPage myAccountPage = new MyAccountPage();
        SearchPage searchPage = new SearchPage();
        ProductDetailPage pdp = new ProductDetailPage();
        CartPage cartPage = new CartPage();

        //Salva o nome do produto escolhido
        String nameProductOnSearchPage = searchPage.getTextProductPrintedChiffonDress();

        //Na página inicial, clica em Sign In
        homePage.clickSignInButton();

        //Ná página de login, preenche os dados com usuário já cadastrado e faz login
        loginPage.fillEmail();
        loginPage.fillPasswd();
        loginPage.clickButtonSubmitLogin();

        //Na página My Account faz pesquisa por produto e clica no produto escolhido
        myAccountPage.doSearch("dress");
        searchPage.clickProductPrintedChiffonDress();

        //Na PDP(Product Detail Page) valida se o produto é o mesmo selecionado na página de pesquisa
        assertEquals(pdp.getProductNameOnPDP(), nameProductOnSearchPage);

        //Salva quantidade e preço do produto escolhido
        String priceProductOnPDP = pdp.getTextOurPriceDisplay();
        String qtdProductOnPDPModal = pdp.getTextLayer_cart_product_quantity();

        //Adiciona produto ao carrinho
        pdp.selectSize();
        pdp.selectColor();
        pdp.clickAddToCartButtonOnPDP();
        pdp.clickProceedToCheckoutButtonOnPDP();

        //Verifica as informações do carrinho
        assertEquals(cartPage.getProductNameOnCartPage(), nameProductOnSearchPage);
        assertEquals(cartPage.getTextCartQuantity(), qtdProductOnPDPModal);
        assertEquals(cartPage.getTextTotal_Product(), priceProductOnPDP);

        //Salva quantidade e preço do produto escolhido
        String totalPriceOnCart = cartPage.getTextTotal_price();

        //Click em Proceed to checkout na guia Summary
        cartPage.clickButtonProceedToCheckoutSummary();

        //Click em Proceed to checkout na guia Address
        cartPage.clickButtonSubmit();

        //Aceita os termos de serviço e segue para o pagamento
        cartPage.clickCheckTermsOfService();
        cartPage.clickButtonSubmit();

        //Validação final de nome do produto e valor
        assertEquals(cartPage.getTextProductNameOnPayment(), nameProductOnSearchPage);
        assertEquals(cartPage.getTextTotal_Product(), priceProductOnPDP);

        //Escolhe o método de pagamento bank wire
        cartPage.clickBankwireButton();
        assertEquals(cartPage.getTextAmount(), totalPriceOnCart);  //Valida se o valor total da ordem bancária é o mesmo do carrinho.

        //Finaliza a compra
        cartPage.clickButtonSubmit();

        //Valida se a compra foi finalizada com sucesso
        assertTrue(cartPage.getTextOrderCompleteMessage().equalsIgnoreCase("Your order on My Store is complete."));

    }
}
