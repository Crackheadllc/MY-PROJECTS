package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

        // goto Syntax projects
        drivers.get("https://syntaxprojects.com/simple_context_menu.php");

//hover the button
        WebElement hoverButton = drivers.findElement(By.xpath("//button[text()='Hover me!']"));

        Actions action = new Actions(drivers);

        action.moveToElement(hoverButton).perform();

//Right click
        WebElement button = drivers.findElement(By.id("show_context_menu"));
        action.contextClick(button).perform();

// Find the dragable
        WebElement dragabale = drivers.findElement(By.id("draggable"));

//find the dropable location
        WebElement dropLoc = drivers.findElement(By.id("droppable"));

        //action.dragAndDrop(dragabale, dropLoc).perform();

        action.clickAndHold(dragabale).moveToElement(dropLoc).release().build().perform();

    }
}
