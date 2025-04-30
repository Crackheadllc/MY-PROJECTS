package SeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week13Day4Alerts {
    public static void main(String[] args) throws InterruptedException {
//      Selenium Week 13, Day 1 WebDriver Commands Assignment

// declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

//  print its page title
        //Navigate to https://syntaxprojects.com/javascript-alert-box-demo-homework.php
        drivers.navigate().to("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

//Click on the button to display alert
        WebElement bAlert = drivers.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        bAlert.click();

        //Accept the alert
        Alert alert = drivers.switchTo().alert();
        alert.accept();

        Thread.sleep(2500);

        //Click on alert button 2
        WebElement Alert2 = drivers.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        Alert2.click();

        alert.dismiss();


        // Click on third alert button
        WebElement Alert3 = drivers.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        Alert3.click();

        //Thread.sleep(2500);

        alert.sendKeys("Godwin M");

        alert.accept();

    //WebElement name= drivers.findElement(By.xpath("//p[@id='prompt-demo']"));
    //String nameText = name.getText();
       // System.out.println(nameText);



    }
}

