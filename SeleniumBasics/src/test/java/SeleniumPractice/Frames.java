package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

//      Navigate to syntaxprojects website
        drivers.navigate().to("https://syntaxprojects.com/handle-iframe.php");
        // Switch focus to the iframe
        drivers.switchTo().frame(0);

//send the topic in the text box
        WebElement topic = drivers.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("Baby");

        drivers.switchTo().defaultContent();

// Switch the focus of driver to iframe 2 having dropdown
        drivers.switchTo().frame("dropdownIframe");

        //Find the dropdown
        WebElement DD = drivers.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(DD);
//select the options
        sel.selectByVisibleText("Big Baby Cat");
// select the main page
        drivers.switchTo().defaultContent();
// select the focus
        drivers.switchTo().frame(0);
//find the nested iframe as WebElement
        WebElement nestedIframe = drivers.findElement(By.xpath("//iframe[@name='checkbox-iframe']"));
// switch the focus to the nested iframe
        drivers.switchTo().frame(nestedIframe);

// find the checkbox
        WebElement cb1 = drivers.findElement(By.xpath("//input[@class='cb1-element']"));
        cb1.click();
    }
}

