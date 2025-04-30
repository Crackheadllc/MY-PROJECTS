package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {
        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

//      Navigate to syntaxprojects website
        drivers.navigate().to("https://syntaxprojects.com/basic-checkbox-demo.php");

//    check the checkbox
      WebElement cb1= drivers.findElement(By.xpath("//input[@id='isAgeSelected']"));
      boolean stateofcb1= cb1.isSelected();
      if(!stateofcb1) {
          cb1.click();
      }

        List<WebElement> checkBoxes = drivers.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkBox : checkBoxes) {
          //  if (checkBox.getAttribute("value").equals("Option-3")) {
                checkBox.click();
            }
        }
    }
//}
