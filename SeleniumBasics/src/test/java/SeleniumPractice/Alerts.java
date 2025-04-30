package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

//      Navigate to syntaxprojects website
        drivers.navigate().to("https://syntaxprojects.com/javascript-alert-box-demo.php");

//Click on the button to display alert
        WebElement Alert1 = drivers.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        Alert1.click();

        Thread.sleep(2000);

//Accept the alert
        Alert alert = drivers.switchTo().alert();
        alert.accept();

        //Click on alert button 2
        WebElement Alert2 = drivers.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        Alert2.click();

        Thread.sleep(2000);

        alert.dismiss();

// Click on third alert button
        WebElement Alert3 = drivers.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        Alert3.click();

        // Thread.sleep(2000);

        alert.sendKeys("abracadabra");

        alert.accept();


    }
}
