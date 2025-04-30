package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Week13Day1CheckBoxes {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();

        //get the url
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        //perform the newsletter  click button if is not selected
        WebElement cb1 = driver.findElement(By.xpath("//input[@id='newsletter']"));
        boolean stateOfcb1 = cb1.isSelected();
        if (!stateOfcb1) {
            cb1.click();
        }

        //check all the boxes, and get the values reading and cooking

        List<WebElement> hobbies = driver.findElements(By.xpath("//input[@class='cb-element']"));
        for (WebElement hobby : hobbies) {
            if (hobby.getDomAttribute("value").equals("reading")
                    || hobby.getDomAttribute("value").equals("cooking")) {
                hobby.click();
            }
        }

        // Verify that the **Support** and **Music** checkboxes are not displayed by default.
        // Click on the "Show Checkboxes" button, and then select the **Music** checkbox

        WebElement supportBox = driver.findElement(By.xpath("//input[@type='checkbox' and @class='checkbox-field'][1]"));
        WebElement musicBox = driver.findElement(By.xpath("//input[@type='checkbox' and @value='Music']"));
        WebElement showInterestSection = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
        boolean supportDisplay = supportBox.isDisplayed();
        boolean musicDisplay = musicBox.isDisplayed();
        System.out.println("is support box displayed? " + supportDisplay);
        System.out.println("is music box displayed " + musicDisplay);
        if (!supportDisplay && !musicDisplay) {
            showInterestSection.click();
        }

        boolean supportStatusAfterClick = supportBox.isEnabled();
        boolean musicBoxAfterClick = musicBox.isEnabled();
        System.out.println("is support box displayed? " + supportStatusAfterClick);
        System.out.println("is music box displayed? " + musicBoxAfterClick);

        //Verify that the **Receive Notifications** checkbox is disabled.
        //Click on the "Enable Checkboxes" button, and then select the **Receive Notifications** checkbox.

        List<WebElement> preferences = driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        WebElement enablePreferences = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        for (WebElement preference : preferences) {
            if (preference.getDomAttribute("value").equals("Receive-Notifications")) {
                enablePreferences.click();
                preference.click();
            }
        }
    }
}
