package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();
        // goto syntaxprojects.com/Xpath.php
        drivers.get("https://syntaxprojects.com/Xpath.php");

        // find the username and send text to it
        WebElement username = drivers.findElement(By.xpath("//input[@id='title']"));
        username.sendKeys("godwin");

        //Find the button and click on it
        WebElement button = drivers.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

//find the security
        WebElement securityQuestion = drivers.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        securityQuestion.sendKeys("what is your school name?");

        // find the text
        WebElement text = drivers.findElement(By.xpath("//label[contains(text(),'amet consectetur adipisicing elit')]"));
        String textofString = text.getText();
        System.out.println(textofString);

//   enter api settings
        WebElement settings = drivers.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        settings.sendKeys("Helloooooeeee");

//   find field1
        WebElement field1 = drivers.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("hello i am field1");

//email2
        WebElement email2 = drivers.findElement(By.xpath("//input[@class='form-control backup' ])[2] "));
        email2.sendKeys("forex@gmail.com");


    }
}
