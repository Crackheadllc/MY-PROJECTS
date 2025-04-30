package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

// declare  the instance

        WebDriver driver = new ChromeDriver();

//maximize the screen
        driver.manage().window().maximize();

//Navigate to syntax projects
        driver.get("https://syntaxprojects.com/input-form-locator.php");

        //Send the first name to the text Box

        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("john");

//send the lastname
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("doe");

// send the email

        WebElement email = driver.findElement(By.className("form-control-01"));
        email.sendKeys("john@does.com");

        //  press the button submit
        WebElement submitBtn = driver.findElement(By.tagName("button"));
        submitBtn.click();

//Click non the first link
        WebElement link1 = driver.findElement(By.linkText("Click Here."));
        link1.click();

        //Click on the second link
        WebElement link2 = driver.findElement(By.partialLinkText("ink"));
        link2.click();

    }
}
