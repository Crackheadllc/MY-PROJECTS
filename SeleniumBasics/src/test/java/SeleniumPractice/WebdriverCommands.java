package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class WebdriverCommands {
    public static void main(String[] args) throws InterruptedException {
 // declare the instance

        WebDriver drivers= new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();
 // goto facebook.com
        drivers.get("https://fb.com");

//      Navigate to syntaxprojects website
        drivers.navigate().to("https://syntaxprojects.com");

//   Go back to fb.com

        drivers.navigate().back();

// go forward to syntaxprojects.com
        drivers.navigate().forward();
//slow down code for purpose of observation
        Thread.sleep(2000);

//    Refresh page
        drivers.navigate().refresh();

//closing the browser
        drivers.close();

    }
}
