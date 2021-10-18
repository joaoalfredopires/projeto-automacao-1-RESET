package testes;

import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.CreateAnAccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utils.Browser;

import static org.junit.Assert.assertTrue;

//DESAFIO WEB - FLUXO DE CRIAÇÃO DE CONTA

@Feature("Fluxo de criação de conta de um novo usuário do ecommerce http://automationpractice.com/")
public class CreateAnAccountTest extends BaseTestes{

    @Test
    @Description("Criar um novo usuário")
    @Severity(SeverityLevel.CRITICAL)
    public void testCreateAnAccount() {
        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        CreateAnAccountPage createAnAccount = new CreateAnAccountPage();
        MyAccountPage myAccount = new MyAccountPage();

        //Click em Sign In na tela inicial
        home.clickSignInButton();

        //Preenche o campo de email para usuário não cadastrado na pagina de login e clica em Create an account
        login.fillEmailCreateAnAccount();
        login.clickSubmitCreate();

        //Preenche o formulário de cadastro
        createAnAccount.clickId_gender1();
        createAnAccount.fillCustomer_firstname();
        createAnAccount.fillCustomer_lastname();
        createAnAccount.fillPasswd();
        createAnAccount.selectDayOfBirth();
        createAnAccount.fillCompany();
        createAnAccount.fillAddress1();
        createAnAccount.fillAddress2();
        createAnAccount.fillCity();
        createAnAccount.selectId_State();
        createAnAccount.fillPostCode();
        createAnAccount.fillPhone_mobile();
        createAnAccount.fillAlias();
        createAnAccount.clickSubmitAccount();

        //Validar se a conta foi criada e se foi direcionado para página My Account
        assertTrue(myAccount.getMyAccountTextOnMyAccountPage().equalsIgnoreCase("My account" ));
        System.out.println("Validou o texto MY ACCOUNT na página My Account.");

        assertTrue(myAccount.getUserInfo().equalsIgnoreCase("Fulano de Teste"));
        System.out.println("Validou o nome completo do usuário no Menu do topo da página.");

    }


}
