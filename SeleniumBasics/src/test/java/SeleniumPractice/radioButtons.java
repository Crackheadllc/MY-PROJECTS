package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButtons {
    public static void main(String[] args) throws InterruptedException {
        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

//      Navigate to syntaxprojects website
        drivers.navigate().to("https://syntaxprojects.com/basic-radiobutton-demo.php");

//Find and select the radio button male if its not selected
        WebElement maleRB = drivers.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));

//Check if radio button is selected
        boolean stateoofRb = maleRB.isSelected();
        if (!stateoofRb) {
            maleRB.click();
        }
//make sure that the selection is done
        boolean selectionOfmaleRb = maleRB.isSelected();
        System.out.println("The male radio button is selected " + selectionOfmaleRb);

// find the age group element
        List<WebElement> ageOpt = drivers.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement age : ageOpt) {


            if (age.getAttribute("value").equals("15 - 50")) {
                age.click();

            }
        }
    }
}
