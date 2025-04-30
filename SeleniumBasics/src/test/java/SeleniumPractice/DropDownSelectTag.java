package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownSelectTag {
    public static void main(String[] args) throws InterruptedException {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

//      Navigate to syntaxprojects website
        drivers.navigate().to("https://syntaxprojects.com/basic-select-dropdown-demo.php");

//                Find the dropdown
//       make sure that u are writing down the xpath to find the select tag
       WebElement DD= drivers.findElement(By.xpath("//select[@id='select-demo']"));
//   As the dropdown has select tag so we can use select class from selenium

//     Declare the instance of the select class
     Select sel = new Select(DD);

//           Select the option sunday
          sel.selectByIndex(1);

          // for observation slow down the visual testing
        Thread.sleep(2000);

//       Select the option wednesday
         sel.selectByValue("Wednesday");

        // for observation slow down the visual testing
        Thread.sleep(2000);

        //select by visible text friday
      sel.selectByVisibleText("Friday");

     //get all the option in the dropdown and print them on the console
        List<WebElement> allOptions = sel.getOptions();
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }


    }
}
