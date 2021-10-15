package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillEmail(){
        email.sendKeys("email_de_teste@gmail.com");
    }

    public void fillPasswd(){
        passwd.sendKeys("teste123");
    }

    public void clickBotaoSubmitLogin(){
        SubmitLogin.click();
    }

}
