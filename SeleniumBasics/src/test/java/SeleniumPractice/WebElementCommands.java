package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) throws InterruptedException {
        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

//      Navigate to syntaxprojects website
        drivers.navigate().to("https://syntaxprojects.com/selenium_commands_selector.php");

//clear the text box and send some keys
        WebElement textbox = drivers.findElement(By.xpath("//input[@id='textInput']"));
        textbox.clear();
        textbox.sendKeys("hello world");

//find the radion button and check if its selected or not
        WebElement radioButton1 = drivers.findElement(By.xpath("//input[@value='option1']"));
        boolean stateofR1 = radioButton1.isSelected();
        System.out.println("the state of radio button selection in " + stateofR1);
        radioButton1.click();
        stateofR1 = radioButton1.isSelected();
        System.out.println("the state of radio button selection in " + stateofR1);

//check if radiobuttn2 is disabled
        WebElement radioButton2 = drivers.findElement(By.xpath("//input[@value='option2']"));
        boolean stateofR2 = radioButton2.isEnabled();
        System.out.println("the radiobutton2 is enabled " + stateofR2);

//check whether the radio button3 is displayed or not
        WebElement radioButton3 = drivers.findElement(By.xpath("//input[@value='option3']"));
        boolean displaystateofR3 = radioButton3.isDisplayed();
        if (displaystateofR3) {
            System.out.println("the radiobutton3 is displayed");
        } else {
            System.out.println("the radiobutton3 is not displayed");

// click on the toggle visibilty button to display the radiobuttn3

            WebElement radioButtonVisibilityToggle = drivers.findElement(By.xpath("//button[text()='Toggle Visibility of Option 3']"));
            radioButtonVisibilityToggle.click();
            displaystateofR3 = radioButton3.isDisplayed();
            System.out.println("the radiobutton3 is displayed " + displaystateofR3);

//check the text present in the webelement and print it in the console
            WebElement textElement = drivers.findElement(By.xpath("//div[@id='textElement']"));
            String text=textElement.getText();
            System.out.println("the text in the webelement is "+text);

// Get the value of thge attribute data of the element
     WebElement attributeElement = drivers.findElement(By.xpath("//div[@id='attributeElement']"));
     String attributeVal= attributeElement.getAttribute("data-custom-attribute");
     System.out.println("the value of the attribute is .."+attributeVal);
        }
    }
}





//closing the browser
        //drivers.close();
