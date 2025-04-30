package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTable {
    public static WebElement driver;

    public static void main(String[] args) {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

        // goto Syntax HRM projects
        drivers.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//LOGIN
        drivers.findElement(By.id("txtUsername")).sendKeys("Admin");

        drivers.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        drivers.findElement(By.id("btnLogin")).click();

//Click on Pim option
        drivers.findElement(By.id("menu_pim_viewPimModule")).click();

        //Get the column id
List<WebElement> allIDs=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        int count=1;
        for (WebElement id:allIDs){
            String idNo= id.getText();
            if (idNo.equals("22636945")){
                System.out.println(count);
 //fIND the checkbox and click on it
             WebElement checkBox=   driver.findElement(By.xpath("//table/tbody/tr["+count+"]/td[1]"));
             checkBox.click();

            }
            count=count+1;
        }
    }
}
