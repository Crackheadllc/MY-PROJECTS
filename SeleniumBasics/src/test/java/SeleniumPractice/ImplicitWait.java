package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

        // goto https://syntaxprojects.com/synchronization-waits.php
        drivers.get("https://syntaxprojects.com/synchronization-waits.php");

        //Global wait implicit wait
        drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//       Click on the button to show text
        WebElement B1 = drivers.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        B1.click();

        WebElement textMsg = drivers.findElement(By.xpath("//p[contains(text(),'Hello, this message appeared after you clicked the button')]"));
        System.out.println(textMsg.getText());

        //Click on the button to show checkbox
        WebElement B2 = drivers.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        B2.click();
        WebElement radioButton = drivers.findElement(By.xpath("//input[@value='Male']"));
        radioButton.click();
    }
}
