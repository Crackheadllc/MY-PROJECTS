package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
    public static void main(String[] args) throws InterruptedException {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

//      Navigate to syntaxprojects website
        drivers.navigate().to("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        // find the dropdown
        WebElement DD = drivers.findElement(By.xpath("//select[@id='multi-select']"));

        //check if dropdown is multiselect
        Select sel=new Select(DD);
        boolean Multisel=sel.isMultiple();
        System.out.println("the dropdown is multiselect: "+Multisel);

        sel.selectByIndex(0);

        sel.selectByVisibleText("New Jersey");

        sel.selectByValue("Texas");

        Thread.sleep(2000);

        sel.deselectByIndex(0);

    }
}
