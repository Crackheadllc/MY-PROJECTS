package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KEYS {
    public static void main(String[] args) throws InterruptedException {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

        // goto Syntax projects
        drivers.get("https://syntaxprojects.com/keypress.php");

 //find the text box
        WebElement inputBox = drivers.findElement(By.xpath("//input[@type='text']"));
        inputBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        inputBox.sendKeys(Keys.TAB);
    }
}
