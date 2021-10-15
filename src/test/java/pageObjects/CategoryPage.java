package pageObjects;

import elementMapper.CategoryPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends CategoryPageElementMapper {

    public CategoryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public boolean isPageCategoryTShirt(){
        return getAuthenticationPageCategoryTShirt().contains("T-SHIRTS");
    }

    public String getAuthenticationPageCategoryTShirt(){
        return nameCategoryTShirt.getText();
    }
}
