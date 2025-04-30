package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class A15ExplicitWait {
    public static void main(String[] args) {

        // Setup WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));




        // task1
        WebElement button1 = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        button1.click();
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"), "Ssyntaxtechs"));
        WebElement textMsg = driver.findElement(By.xpath("//h2[@id='headingtext']"));

        System.out.println( textMsg.getText());



        //Enable button

        WebElement btnEnabled = driver.findElement(By.xpath("//button[@id='enable_button']"));
        btnEnabled.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@text()='Button']")));

        WebElement pushBtn = driver.findElement(By.xpath("//button[@text()='Button']"));
        pushBtn.click();


        //Checkbox click

        WebElement checkBox = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkBox.click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));

        WebElement select = driver.findElement(By.xpath("//input[@id='checkbox']"));
        boolean hasBeenSelect = select.isSelected();
        System.out.println(hasBeenSelect);

    }
}
