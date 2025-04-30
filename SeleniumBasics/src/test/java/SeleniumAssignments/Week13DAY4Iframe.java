package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week13DAY4Iframe {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");

        driver.switchTo().frame(1);
        driver.switchTo().frame("checkboxIframe");

        WebElement checkbox = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        checkbox.click();

        driver.switchTo().defaultContent();
        WebElement iframeWebElement = driver.findElement(By.xpath("//iframe[@id='dropdownIframe']"));
        driver.switchTo().frame(iframeWebElement);

        WebElement dd = driver.findElement(By.xpath("//select [@id='cities']"));
        Select sel=new Select(dd);
        sel.selectByIndex(2);



        // Enter Username

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='Username']"));
        usernameInput.sendKeys("Crackheadllc");
    }
}
