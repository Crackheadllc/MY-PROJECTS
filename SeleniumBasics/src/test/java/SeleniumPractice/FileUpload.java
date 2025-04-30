package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {


        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

        // goto Syntax projects
        drivers.get("https://syntaxprojects.com/upload-image.php");

//Choose file
        WebElement fileButton= drivers.findElement(By.id("image-file"));
        fileButton.sendKeys("/Users/hustl3r/IdeaProjects/SeleniumBasics/screenshot/image.png");

    }
}
