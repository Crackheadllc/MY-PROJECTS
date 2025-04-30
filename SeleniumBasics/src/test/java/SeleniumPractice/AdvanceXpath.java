package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
    public static void main(String[] args) {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

        // goto syntaxprojects.com/advanceXpath.php
        drivers.get("https://syntaxprojects.com/advanceXpath.php");

//      find input 2
        WebElement input2 = drivers.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        input2.sendKeys("harrypotter");

//  find the input textbox
        WebElement textbox2 = drivers.findElement(By.xpath("//input[@id='least-favorite']//preceding-sibling::input[2]"));
        textbox2.sendKeys("lordoftherings");

//      find textbox3

        WebElement textbox3 = drivers.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        textbox3.sendKeys("abcdef");

    }
}
