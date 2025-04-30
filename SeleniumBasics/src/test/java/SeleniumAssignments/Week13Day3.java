package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Week13Day3 {
    public static void main(String[] args) {

        // declare  the instance

        WebDriver driver=new ChromeDriver();

//maximize the screen
        driver.manage().window().maximize();

//Navigate to https://www.syntaxprojects.com/locator-homework.php
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        //Send the fullname to the text Box
        WebElement fullName= driver.findElement(By.id("fullName"));
        fullName.sendKeys("Godwin M");

        // Email
        WebElement email = driver.findElement(By.id("yourEmail"));
        email.sendKeys("Codingninja@idk.com");

//click submit button
        WebElement submitBtn= driver.findElement(By.partialLinkText("btn-submit'"));
        submitBtn.click();


        // Close the browser
        driver.quit();
    }
}
