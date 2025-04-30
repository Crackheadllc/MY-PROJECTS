package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Week13Day1RadioButtons {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();

        // go to website
        driver.get("https://www.syntaxprojects.com/basic-radiobutton-demo-homework.php");

        // List of web elements - Beverage options
        List<WebElement> beverageOptions = driver.findElements(By.xpath("//input[@name='beverage']"));

        for (WebElement beverage : beverageOptions) {
            if (beverage.getDomAttribute("value").equals("Juice")) {
                beverage.click();
            }

        }
        // List of web elements - Preferred Working Environment
        List<WebElement> prefWorkingEnv = driver.findElements(By.xpath("//input[@name='working_enviroment']"));

        for (WebElement workStyle : prefWorkingEnv) {
            if (workStyle.getDomAttribute("value").equals("hybrid")) {
                workStyle.click();
            }
        }

        // Enabling the spring button
        WebElement springButton = driver.findElement(By.xpath("//input[@value='spring']"));
        WebElement enableButton = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
        boolean buttonSpring = springButton.isEnabled();

        if (!buttonSpring) {
            enableButton.click();
        }
        springButton.click();

        List<WebElement> fourSeasons = driver.findElements(By.xpath("//input[@name='season']"));
        WebElement showWinterButton = driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        WebElement winterButton = driver.findElement(By.xpath("//input[@value='winter']"));
        boolean winterDisplayStatus = winterButton.isDisplayed();
        System.out.println("was the winter button displayed initially? " + winterDisplayStatus);

        if (!winterDisplayStatus) {
            showWinterButton.click();
        }
        boolean winterDisplayStatusAfterClick = winterButton.isDisplayed();
        System.out.println("is the winter button displayed after click operation? " + winterDisplayStatusAfterClick);

        // choose favorite meal
        List<WebElement> mealChoices = driver.findElements(By.xpath("//input[@name='meal']"));
        for (WebElement meal : mealChoices) {
            if (meal.getDomAttribute("value").equals("lunch")) {
                meal.click();
            }
        }
    }
}
