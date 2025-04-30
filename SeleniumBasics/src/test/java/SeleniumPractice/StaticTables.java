package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.List;

public class StaticTables {
    public static void main(String[] args) {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

        // goto Syntax projects
        drivers.get("https://syntaxprojects.com/table-search-filter-demo.php");

 //Print all the rows of the table
List<WebElement> allRows =drivers.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
       for (WebElement row:allRows){
           System.out.println(row.getText());
       }
//Print just the column no#3
        List<WebElement> columnData=drivers.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));

       for (WebElement cData:columnData){
           System.out.println(cData.getText());
       }
//Print the rows in which the status is in "progress"
        List<WebElement> statuses=drivers.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));

       int count=1;
       for (WebElement status:statuses){
           String statusValue= status.getText();
           if (statusValue.equals("in progress")){
               //print this particular row
               System.out.println(count);

               WebElement row= drivers.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+ count +"]"));
               System.out.println(row.getText());

           }
           count=count+1;

       }
    }
}
