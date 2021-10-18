package pageObjects;

import elementMapper.CreateAnAccountPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreateAnAccountPage extends CreateAnAccountPageElementMapper {

    public CreateAnAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Selecionar gênero")
    public void clickId_gender1(){
        id_gender1.click();
    }

    @Step("Preencher campo First Name")
    public void fillCustomer_firstname(){
        customer_firstname.sendKeys("Fulano");
    }

    @Step("Preencher campo Last Name")
    public void fillCustomer_lastname(){
        customer_lastname.sendKeys("de Teste");
    }

    @Step("Preencher campo Password")
    public void fillPasswd(){
        passwd.sendKeys("teste1234");
    }

    @Step("Selecionar data de nascimento")
    public void selectDayOfBirth(){
        selectFormDayOfBirth.sendKeys("21");
        selectFormMonthOfBirth.sendKeys("may");
        selectFormYearOfBirht.sendKeys("1996");
    }

    @Step("Preencher campo Company")
    public void fillCompany(){
        company.sendKeys("CWI Software");
    }

    @Step("Preencher campo Adress")
    public void fillAddress1(){
        address1.sendKeys("Test Street, 1234");
    }

    @Step("Preencher campo Adress (Line 2)")
    public void fillAddress2(){
        address2.sendKeys("4th Floor");
    }

    @Step("Preencher campo City")
    public void fillCity(){
        city.sendKeys("Los Angeles");
    }

    @Step("Selecionar estado")
    public void selectId_State(){
        id_state.sendKeys("California");
    }

    @Step("Preencher campo Zip/Postal Code")
    public void fillPostCode(){
        postcode.sendKeys("12345");
    }

    @Step("Preencher campo Mobile Phone")
    public void fillPhone_mobile(){
        phone_mobile.sendKeys("5559999");
    }

    @Step("Preencher campo Assingn an address alias for future reference")
    public void fillAlias(){
        alias.sendKeys("Test Address");
    }

    @Step("Click no botão Register")
    public void clickSubmitAccount(){
        submitAccount.click();
    }
}
