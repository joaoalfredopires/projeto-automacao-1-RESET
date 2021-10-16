package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPageElementMapper {

    @FindBy(className = "cat-name")
    public WebElement nameCategoryTShirt;

    @FindBy(css = ".product-container .product-image-container")
    public WebElement productContainer;

    @FindBy(css = ".button[title=View]")
    public WebElement buttonMoreDirProductPage;

    @FindBy(css = ".right-block .product-name")
    public WebElement productNameOnCategoryPage;
}
