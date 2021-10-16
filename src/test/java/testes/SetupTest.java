package testes;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

public class SetupTest extends BaseTestes{

    @Test
    public void testOpeningBrowserandLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e abrimos a URL");
    }

    @Test
    public void testLogin(){

        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();

        home.clickBotaoLogin();
        System.out.println("Click em Sign In na página inicial e direcionou para página de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().
                concat("index.php?controller=authentication&back=my-account")));

        login.fillEmail();
        System.out.println("Preencheu o email");

        login.fillPasswd();
        System.out.println("Preencheu a senha");

        login.clickBotaoSubmitLogin();
        System.out.println("Click em Sign In");

        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou a url da página minha conta");

        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou o texto 'MY ACCOUNT' no h1 da página minha conta");

    }

/*    @Test
    public void testSeach(){

        String quest = "DRESS";
        String questResult = "7";

        //Iniciar páginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        //Fazer pesquisa
        home.doSearch(quest);
        System.out.println("Pesquisou pelo produto");

        //Validar pesquisa
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"", ""), quest);
        assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResult));
        System.out.println("Validou a pesquisa");

    }*/

    @Test
    public void testAcessCategoryTShirts(){
        //Iniciar páginas
        HomePage home = new HomePage();
        CategoryPage category = new CategoryPage();

        //Clicar na categoria T-Shirts
        home.clickCategoryTShirts();
        System.out.println("Clicou na categoria T-Shirt");

        //Validar se ao clicar na categoria T-Shirts ocorre o direcionamento correto
        assertTrue(category.isPageCategoryTShirt());
        System.out.println("Validou o direcionamento");
    }

    @Test
    public void testProductPage(){

        //Acessar categoria T-Shirts
        testAcessCategoryTShirts();

        //Iniciar páginas
        CategoryPage category = new CategoryPage();
        ProductDetailPage pdp = new ProductDetailPage();

        //Salva o nome do produto na página de categoria
        String productNameOnCategoryPage = category.getProductNameOnCategoryPage();

        //Clicar em MORE e direcionar para a página de produto
        category.clickProductDirToProductPage();
        System.out.println("direcionou para a página de protudo");

        //Validar se foi direcionado para a página de detalhes do produto
        assertTrue(pdp.getProductNameOnPDP().equals(productNameOnCategoryPage));
        System.out.println("Validou que houve o direcionamento para a PDP");

    }

    @Test
    public void testAddProductToCartPage(){

        //Acessa a página de produto
        testProductPage();

        //Inicia as páginas
        ProductDetailPage pdp = new ProductDetailPage();
        CartPage cart = new CartPage();

        //Salva o nome do produto na PDP
        String nameProductPDP = pdp.getProductNameOnPDP();

        //Clica no botão Add to Cart
        pdp.clickAddToCartButtonOnPDP();
        System.out.println("Clicou em Add to cart");

        //Clica no botão Preceed to checkout
        pdp.clickProceedToCheckoutButtonOnPDP();
        System.out.println("Clicou em Proceed to checkout");

        //Validar se foi direcionado para a CartPage
        assertTrue(cart.getProductNameOnCartPage().equals(nameProductPDP));
        System.out.println("Validou se foi direcionado corretamente");

    }
}
