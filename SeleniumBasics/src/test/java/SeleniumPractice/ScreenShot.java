package SeleniumPractice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws IOException {


        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

        // goto Syntax HRM website
        drivers.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

   //Cast the driver to take a screenshot
        TakesScreenshot ss= (TakesScreenshot) drivers;

// take screenshot
     File screenshot=ss.getScreenshotAs(OutputType.FILE);
// save the ss to a place in ur project
        FileUtils.copyFile(screenshot,new File("screenshot/image.png"));


    }
}
