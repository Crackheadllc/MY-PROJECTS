package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

        // goto https://syntaxprojects.com/cssSelector.php
        drivers.get("https://syntaxprojects.com/cssSelector.php");

// find the profile ID

        WebElement profileid = drivers.findElement(By.cssSelector("input[id='profileID']"));
        profileid.sendKeys("Don");

//    find the profile box

     WebElement profile= drivers.findElement(By.cssSelector("input#profileBox"));
     profile.sendKeys("amazon");

//       Find the feedback from jenny
        WebElement feedbackByJenny = drivers.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackByJenny.sendKeys("the website is really cool");

//       course topic
      WebElement courseTopic= drivers.findElement(By.cssSelector("input[name*='contentInput']"));
      courseTopic.sendKeys("Selenium");

// intro to css
      WebElement advanceCss= drivers.findElement(By.cssSelector("input[name^='IntroInput']"));
      advanceCss.sendKeys("shortcuts");

//    find css module $
      WebElement cssModule = drivers.findElement(By.cssSelector("input[name$='Input']"));
      cssModule.sendKeys("css");


    }
}
