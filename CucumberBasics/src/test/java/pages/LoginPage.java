package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilis.CommonMethods;

public class LoginPage extends CommonMethods {

    //object repositories
    @FindBy(id="txtUsername")
    public WebElement usernameField;

    @FindBy(id="txtPassword")
    public WebElement passwordField;

    @FindBy(id="btnLogin")
    public WebElement loginButton;


    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
}
