package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class A17StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");


        //print all the rows of the table
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));

        for (WebElement row : allRows) {
            System.out.println(row.getText());

        }
        // just  print column 3
        List<WebElement> countries = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        int count = 1;
        for (WebElement country : countries) {
            String  targetCountry= country.getText();
            if (targetCountry.equals("USA")) {
                //print this particular row
                System.out.println(count);
                WebElement row=driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));

                System.out.println(row.getText());
            }
            count = count + 1;
        }

    }
}
