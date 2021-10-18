package pageObjects;

import elementMapper.LoginPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

import java.util.Random;

public class LoginPage extends LoginPageElementMapper {

    //Gerador de email
    String emailAleatorio = "email_de_teste_joao"+ new Random().nextInt() +"@gmail.com";

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Preencher o campo email para conta existente")
    public void fillEmail(){
        email.sendKeys("email_de_teste@gmail.com");
    }

    @Step("Preencher o campo de senha para conta existente")
    public void fillPasswd(){
        passwd.sendKeys("teste123");
    }

    @Step("Click no botão de Sign In para conta existente")
    public void clickButtonSubmitLogin(){
        SubmitLogin.click();
    }

    @Step("Preencher campo de email para criação de nova conta")
    public void fillEmailCreateAnAccount(){
        email_create.sendKeys(emailAleatorio);
        System.out.println("Email criado: "+ emailAleatorio);
    }

    @Step("Click no botão de Criar uma conta")
    public void clickSubmitCreate(){
        SubmitCreate.click();
    }

}
