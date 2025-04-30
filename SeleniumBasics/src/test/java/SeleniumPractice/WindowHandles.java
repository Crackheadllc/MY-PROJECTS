package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.Set;

public class WindowHandles {
    private static WebDriver driver;

    public static void main(String[] args) {
        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

//      Navigate to syntaxprojects website
        drivers.navigate().to("https://syntaxprojects.com/window-popup-modal-demo.php");

//Get window handle of the main page and print it out on the console
        String mainPageWH = drivers.getWindowHandle();
        System.out.println("the window handle of the main page is " + mainPageWH);

        //Click on the buttons fb and insta
        WebElement igBtn = drivers.findElement(By.xpath("//a[text()=' Follow On Instagram ']"));

        WebElement fbBtn = drivers.findElement(By.xpath("//a[text()=' Like us On Facebook ']"));

        //Click them
        igBtn.click();
        fbBtn.click();

//task:send keys to fb.com input
        //get all the window handle
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            String url = driver.getCurrentUrl();
            if (url.equals("https://www.facebook.com/syntaxtechs/")) {
                //Find the textbox and send some keys
                WebElement inputBox = driver.findElement(By.xpath("(//input[@name='email' ])[2]"));
                inputBox.sendKeys("hello");
                break;
            }
        }
        System.out.println("the current focus of driver is on window " + driver.getCurrentUrl());
        driver.switchTo().window(mainPageWH);
        System.out.println("the current focus of driver is on window " + driver.getCurrentUrl());

    }
}
