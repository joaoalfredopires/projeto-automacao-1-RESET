package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageElementMapper {

    @FindBy(css = "#center_column .page-heading")
    public WebElement pageHeading;

    @FindBy(css = ".container .header_user_info a span")
    public WebElement userInfo;

    public WebElement search_query_top;

    @FindBy(css = "#searchbox .btn")
    public WebElement submit_search;
}
