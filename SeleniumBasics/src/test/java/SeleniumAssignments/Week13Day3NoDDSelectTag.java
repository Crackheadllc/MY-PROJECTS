package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Week13Day3NoDDSelectTag {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        //Declare the instance

        WebElement DD = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        DD.click();

        // Traverse through the list of options, and select **Mango**.

        List<WebElement> Options = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));

        for (WebElement option : Options) {
            String optionText = option.getText();
            if (optionText.equals("Apple")) {
                option.click();
            }
        }

        // Choose Your Favorite Hobby:
        // Retrieve all options from the "Choose your Favorite Hobby" dropdown.


        WebElement hobDrop = driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        hobDrop.click();

        List<WebElement> OptionsH = driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));

        for (WebElement option : OptionsH) {
            String optionText = option.getText();
            if (optionText.equals("Traveling")) {
                option.click();
            }
        }
    }
}
