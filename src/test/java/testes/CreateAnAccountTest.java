package testes;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

@Feature("Fluxo de criação de conta de um novo usuário do ecommerce http://automationpractice.com/")
public class CreateAnAccountTest extends BaseTestes{

    @Test
    @Story("Criar um novo usuário")
    public void testCreateAnAccount() {
        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();

        home.clickSignInButton();
        login.fillEmailCreateAnAccount();

    }


}
