package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;

public class BasicCalenders {
    private static Object driver;

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

 //click on leave tab
 drivers.findElement(By.id("menu_leave_viewLeaveModule")).click();

 //Click on the calender icon
        drivers.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]")).click();

//select the month from the dropdown
        WebElement month= drivers.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

        Select sel=new Select(month);
        sel.selectByVisibleText("Jul");

 // select the year from the DD
      WebElement year= drivers.findElement(By.xpath("//select[@class='ui-datepicker-year']"));

      Select sel1=new Select(year);
      sel1.selectByVisibleText("2010");

//Select the date

    List<WebElement> dates= drivers.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement date:dates){
            if (date.getText().equals("4")){
                date.click();
            }
        }
    }
}
