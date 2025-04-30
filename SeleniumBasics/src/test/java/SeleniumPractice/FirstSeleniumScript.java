package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
    public static void main(String[] args) {
// Create an object of the webdriver interface
        WebDriver driver = new ChromeDriver();
//navigate the browser to syntax project website
        driver.get("https://syntaxprojects.com/");
// Get the current url and print it on the console
        String url = driver.getCurrentUrl();
        System.out.println("the current url is: " + url);

// Close the browser
        driver.quit();
    }
}
