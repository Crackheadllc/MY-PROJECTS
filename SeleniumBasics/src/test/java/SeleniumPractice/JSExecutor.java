package SeleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
    public static void main(String[] args) throws InterruptedException {
        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

        // goto Syntax projects
        drivers.get("https://syntaxprojects.com/simple_context_menu.php");
//button highlight
        WebElement button= drivers.findElement(By.xpath("//button[text()='Hover me!']"));

//JS executor
        JavascriptExecutor js=(JavascriptExecutor)drivers;
        js.executeScript("arguments[0].style.border='3px solid red'",button);

//to scroll down
        js.executeScript("window.scrollBy(0,1000)");

//slow it down to test website
     Thread.sleep(2000);

//to scroll up
        js.executeScript("window.scrollBy(0,-1000)");


       WebElement fileUploadTab= drivers.findElement(By.xpath("//a[text()='File Upload']"));

 //  Click operation
    js.executeScript("arguments[0].click();",fileUploadTab);


    }
}
