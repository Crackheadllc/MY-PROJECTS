package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week13Day5AdvanceXpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // maximize
        driver.manage().window().maximize();

        // go to website
        driver.get("https://www.syntaxprojects.com/advanceXpath-homework.php");

        //Find the least favorite book
        WebElement least = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        least.sendKeys("GTA V STORY");

        WebElement favorite = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        favorite.sendKeys("Things fall apart");

        WebElement favorite1 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        favorite1.sendKeys("The finance Guy");

        //Find favBooks
        WebElement fav1 = driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        fav1.sendKeys("The art of being YOU");

        WebElement fav2 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        fav2.sendKeys("Bankruptcy");

        WebElement fav3 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        fav3.sendKeys("Try to Fk around");

        // GrandParent
        WebElement grandParent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandParent.sendKeys("GrandParent");

        //Parent
        WebElement papa = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        papa.sendKeys("Resse");

        //child
        WebElement child = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Adams");

        //close the browser
        driver.close();


    }
}
