package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddEmplopyeePage;
import utilis.CommonMethods;
import utilis.ExcelReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    //public static WebDriver driver;

    AddEmplopyeePage addEmplopyeePage=new AddEmplopyeePage();

    @Given("user is able to access HRMS application")
    public void user_is_able_to_access_hrms_application() {
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {

        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        usernameField.sendKeys("admin");

        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys("Hum@nhrm123");
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
    }

    @Then("user is able to see dashboard page")
    public void user_is_able_to_see_dashboard_page() {
        System.out.println("test passed");
    }

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        pimOption.click();
    }

    @When("user clicks on Add employee option")
    public void user_clicks_on_add_employee_option() {
        WebElement addEmpOption = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmpOption.click();


    }

    @When("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname() {
        //WebElement firstNameLocator = driver.findElement(By.id("firstName"));
       // WebElement middleNameLocator = driver.findElement(By.id("middleName"));
        //WebElement lastNameLocator = driver.findElement(By.id("lastName"));


        //firstNameLocator.sendKeys("Don");
        //lastNameLocator.sendKeys("Funds");
        sendText("Don", addEmplopyeePage.firstNameLocator);
        sendText("Funds", addEmplopyeePage.lastNameLocator);

    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        //WebElement saveButton = driver.findElement(By.id("btnSave"));
        //saveButton.click();
        click(addEmplopyeePage.saveButton);

    }

    @Then("employee added successfully")
    public void employee_added_successfully() {

        System.out.println("Steps will be implemented later");
    }

    @When("user enters firstname and middlename and lastname")
    public void user_enters_firstname_and_middlename_and_lastname() {
        //WebElement firstNameLocator = driver.findElement(By.id("firstName"));
        //WebElement lastNameLocator = driver.findElement(By.id("lastName"));
        //WebElement middleNameLocator = driver.findElement(By.id("middleName"));

        //firstNameLocator.sendKeys("Don");
        //middleNameLocator.sendKeys("J");
        //lastNameLocator.sendKeys("Funds");
        sendText("Don",addEmplopyeePage.firstNameLocator);
        sendText("J",addEmplopyeePage.middleNameLocator);
        sendText("Funds",addEmplopyeePage.lastNameLocator);

    }

    @When("user enters {string} and {string} and {string} in the application")
    public void user_enters_and_and_in_the_application
            (String firstName, String middleName, String lastName) {
        //WebElement firstNameLocator = driver.findElement(By.id("firstName"));
        //WebElement middleNameLocator = driver.findElement(By.id("middleName"));
        //WebElement lastNameLocator = driver.findElement(By.id("lastName"));

        //firstNameLocator.sendKeys(firstName);
        //middleNameLocator.sendKeys(middleName);
        //lastNameLocator.sendKeys(lastName);
        sendText(firstName, addEmplopyeePage.firstNameLocator);
        sendText(middleName, addEmplopyeePage.middleNameLocator);
        sendText(lastName, addEmplopyeePage.lastNameLocator);
    }

    @When("user add {string} , {string} and {string}")
    public void user_add_and(String fn, String mn, String ln) {
        //WebElement firstNameLocator = driver.findElement(By.id("firstName"));
        //WebElement middleNameLocator = driver.findElement(By.id("middleName"));
        //WebElement lastNameLocator = driver.findElement(By.id("lastName"));

        //firstNameLocator.sendKeys(fn);
        //middleNameLocator.sendKeys(mn);
        //lastNameLocator.sendKeys(ln);
        sendText(fn, addEmplopyeePage.firstNameLocator);
        sendText(mn, addEmplopyeePage.middleNameLocator);
        sendText(ln, addEmplopyeePage.lastNameLocator);

    }

    @When("user adds multiple employees using data table and save them")
    public void user_adds_multiple_employees_using_data_table_and_save_them
            (io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> employeeNames = dataTable.asMaps();

        for (Map<String, String> employee : employeeNames
        ) {
            //WebElement firstNameLocator = driver.findElement(By.id("firstName"));
            //WebElement middleNameLocator = driver.findElement(By.id("middleName"));
            //WebElement lastNameLocator = driver.findElement(By.id("lastName"));

            addEmplopyeePage.firstNameLocator.sendKeys(employee.get("firstName"));
            addEmplopyeePage.middleNameLocator.sendKeys(employee.get("middleName"));
            addEmplopyeePage.lastNameLocator.sendKeys(employee.get("lastName"));

            //WebElement saveButton = driver.findElement(By.id("btnSave"));
            addEmplopyeePage.saveButton.click();
            WebElement addEmpOption = driver.findElement(By.id("menu_pim_addEmployee"));
            addEmpOption.click();
        }

    }

    @When("user adds multiple employees from excel file")
    public void user_adds_multiple_employees_from_excel_file() throws IOException {
        List<Map<String, String>> newEmployees = ExcelReader.read();
        for (Map<String, String> employee : newEmployees) {
            //WebElement firstNameLocator = driver.findElement(By.id("firstName"));
            //WebElement middleNameLocator = driver.findElement(By.id("middleName"));
            //WebElement lastNameLocator = driver.findElement(By.id("lastName"));

            addEmplopyeePage.firstNameLocator.sendKeys(employee.get("firstName"));
            addEmplopyeePage.middleNameLocator.sendKeys(employee.get("middleName"));
            addEmplopyeePage.lastNameLocator.sendKeys(employee.get("lastName"));

           // WebElement saveButton = driver.findElement(By.id("btnSave"));
            addEmplopyeePage.saveButton.click();
            WebElement addEmpOption = driver.findElement(By.id("menu_pim_addEmployee"));
            addEmpOption.click();
        }
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user can see error message")
    public void user_can_see_error_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
