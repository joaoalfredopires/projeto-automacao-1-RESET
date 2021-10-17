package pageObjects;

import elementMapper.HomePageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("CLick no botão SignIn na página inicial direcionando para a página de login")
    public void clickSignInButton(){
        login.click();
    }


    public void fillSearch_query_top(String keys){
        search_query_top.sendKeys(keys);
    }

    public void clickSubmit_search(){
        submit_search.click();
    }

    public void doSearch(String quest){
        fillSearch_query_top(quest);
        clickSubmit_search();
    }

    public void clickCategoryTShirts(){
        categoryTShirtsMenu.click();
    }
}
