package SeleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week13Day1 {
    public static void main(String[] args) {
//      Selenium Week 13, Day 1 WebDriver Commands Assignment

// declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

// Navigate to google.com
        drivers.get("https://www.google.com");

//  print its page title
        System.out.println("Title after navigating to Google: " + drivers.getTitle());

        //Navigate to https://www.syntaxprojects.com/
        drivers.navigate().to("https://www.syntaxprojects.com/");

// print its page title
        System.out.println("Title after navigating to Syntax Projects: " + drivers.getTitle());

        //Navigate back to www.google.com
        drivers.navigate().back();
        System.out.println("After navigating back, title: " + drivers.getTitle());

        //Refresh the page at www.google.com
        drivers.navigate().refresh();

        //Close the browser after the navigation steps are completed
        drivers.quit();
    }
}

