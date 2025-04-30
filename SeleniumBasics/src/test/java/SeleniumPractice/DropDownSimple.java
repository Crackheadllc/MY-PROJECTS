package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownSimple {
    public static void main(String[] args) {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

//      Navigate to syntaxprojects website
        drivers.navigate().to("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");

        // Click on the dropdown to display the options
        WebElement DD = drivers.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        DD.click();

        //Get all the options
        List<WebElement> Options=drivers.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

        for(WebElement option:Options){
           String optionText=option.getText();
           if(optionText.equals("Peru")){
               option.click();
           }
        }




    }
}
