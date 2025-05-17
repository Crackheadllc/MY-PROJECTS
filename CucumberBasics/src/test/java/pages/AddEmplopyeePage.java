package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilis.CommonMethods;

public class AddEmplopyeePage extends CommonMethods {


    @FindBy(id="firstName")
    public WebElement firstNameLocator;

    @FindBy(id="middleName")
    public WebElement middleNameLocator;

    @FindBy(id="lastName")
    public WebElement lastNameLocator;

    @FindBy(id="btnSave")
    public WebElement saveButton;

    public AddEmplopyeePage(){
        PageFactory.initElements(driver,this);
    }


}
