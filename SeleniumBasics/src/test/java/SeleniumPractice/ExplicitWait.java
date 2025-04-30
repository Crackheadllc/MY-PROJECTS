package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

        // goto https://syntaxprojects.com/synchronization-explicit-wait.php
        drivers.get("https://syntaxprojects.com/synchronization-explicit-wait.php");       // declare the instance



        // Click on the button to show the alert
        WebElement alertButton = drivers.findElement(By.xpath("//button[@id='show_alert']"));
        alertButton.click();

//wait until the alert appears
        WebDriverWait wait = new WebDriverWait(drivers, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

// Handle the alert
        Alert alert = drivers.switchTo().alert();
        alert.accept();

        // click on the button to change the text and bring the changed text on the console
        WebElement button2 = drivers.findElement(By.xpath("//button[@id='changetext_button']"));
        button2.click();

        // wait until the text is changed
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"), "Ssyntaxtechs"));

        WebElement textMsg = drivers.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(textMsg.getText());
    }
}
