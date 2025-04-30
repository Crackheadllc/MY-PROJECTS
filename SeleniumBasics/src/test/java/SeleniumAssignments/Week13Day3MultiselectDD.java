package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Week13Day3MultiselectDD {
    private static WebElement DropDownSelectTag;

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        //Use the **Select** class to select the option **"Pear"** from the dropdown.
        WebElement fruitDD = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));

        // declare the instance of the select class
        Select sel = new Select(fruitDD);


        // select pear by index
        sel.selectByIndex(3);

        Thread.sleep(3000);
        // Use the **getAllOptions** method to retrieve all options
        // from the dropdown and print them on the console.
        List<WebElement> allDropOptions = sel.getOptions();
        for (WebElement option : allDropOptions) {
            System.out.println(option.getText());
        }

        // verify that the **Select** dropdown is multi-select by checking the
        WebElement multiDrop = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select selMul = new Select(multiDrop);
        boolean selOp = selMul.isMultiple();
        System.out.println();
        System.out.println("The dropdown is multiselect " + selOp);

        //Using the **Select** class, make the following selections:
        selMul.selectByIndex(1);
        selMul.selectByIndex(2);
        selMul.selectByIndex(4);

        Thread.sleep(3000);

        // get all selected
        WebElement getAllSelect = driver.findElement(By.xpath("//button[@id='get_all']"));
        getAllSelect.click();
        WebElement msg = driver.findElement(By.xpath("//p[@class='get_selected_values']"));
        String attributeValue = msg.getText();
        System.out.println(attributeValue);


        Thread.sleep(5000);
        // After a delay of 5 seconds, deselect the **Traveling** option
        // using the **Select** class.
        selMul.deselectByIndex(1);

        Thread.sleep(5000);
        String attributeValue2 = msg.getText();
        System.out.println(attributeValue2);
    }
}