package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPageElementMapper {

    public WebElement id_gender1;

    public WebElement customer_firstname;

    public WebElement customer_lastname;

    public WebElement email;

    public WebElement passwd;

    @FindBy(css =".selector #days")
    public WebElement selectFormDayOfBirth;

    @FindBy(css = ".selector #months")
    public WebElement selectFormMonthOfBirth;

    @FindBy(css = ".selector #years")
    public WebElement selectFormYearOfBirht;

    public WebElement company;

    public WebElement address1;

    public WebElement address2;

    public WebElement city;

    public WebElement id_state;

    @FindBy(css = "p #postcode")
    public WebElement postcode;

    public WebElement phone_mobile;

    public WebElement alias;

    public WebElement submitAccount;
}
