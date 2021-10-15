package pageObjects;

import elementMapper.HomePageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickBotaoLogin(){
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
