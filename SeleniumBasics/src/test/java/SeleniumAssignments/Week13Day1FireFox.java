package SeleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Week13Day1FireFox {
    public static void main(String[] args) {
//      Selenium Week 13, Day 1 WebDriver FireFox Commands Assignment

// declare the instance

        WebDriver drivers = new FirefoxDriver();

//     Maximize the windows
        drivers.manage().window().maximize();


        //Navigate to https://www.syntaxprojects.com/
        drivers.navigate().to("https://www.syntaxprojects.com/");

// print its page title

        String currentUrl = drivers.getCurrentUrl();
        String pageTitle = drivers.getTitle();

        // Print the current URL and page title to the console
        System.out.println("Current URL: " + currentUrl);
        System.out.println("The page title retrieved:: " + pageTitle);



        //Close the browser after the navigation steps are completed
        drivers.quit();
    }
}

