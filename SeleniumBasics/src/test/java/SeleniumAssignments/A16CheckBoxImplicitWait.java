package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class A16CheckBoxImplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");




        //Global wait implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Button Click and Checkbox Selection
        WebElement clickBR=driver.findElement(By.xpath("//button[@id='show_text_synchronize_three']"));
        clickBR.click();

        WebElement checkbox=driver.findElement(By.xpath("//input[@value='Option-1']"));
        checkbox.click();



    }
}
