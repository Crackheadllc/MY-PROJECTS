package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalenderNavigational {
    public static void main(String[] args) {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

        // goto Syntax projects
        drivers.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");

        // Click on the calender
        drivers.findElement(By.xpath("//input[@id='start_date']")).click();

        //get the month
        WebElement month = drivers.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]"));
        String currentMonth = month.getText();

        // Finding the next button
        WebElement nextButton = drivers.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));
        boolean notMonth = true;
        while (notMonth) {
            if (currentMonth.equals("April 2025")) {
                //Selection of the date
                List<WebElement> dates = drivers.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
                for (WebElement date : dates) {
                    String currentDate = date.getText();
                    if (currentDate.equals("6")) {
                        date.click();
                    }
                }
                notMonth = false;
            }
            //click on next
            else {
                nextButton.click();
                currentMonth = month.getText();
            }
        }
    }
}
