package pageObjects;

import elementMapper.MyAccountPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountPageElementMapper {

    public MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getMyAccountTextOnMyAccountPage(){
        return pageHeading.getText();
    }

    public String getUserInfo(){
        return userInfo.getText();
    }

    @Step("Preenche o campo de pesquisa")
    public void fillSearch_query_top(String keys){
        search_query_top.sendKeys(keys);
    }

    @Step("Click no botão Submit Search")
    public void clickSubmit_search(){
        submit_search.click();
    }

    @Step("Faz a pesquisa pelo produto desejado")
    public void doSearch(String search){
        fillSearch_query_top(search);
        clickSubmit_search();
    }
}
