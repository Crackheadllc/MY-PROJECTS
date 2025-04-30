package SeleniumAssignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week13Day7WebElementCommands {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        //get the value of the attribute data of the element
        WebElement retrieveAttribute= driver.findElement(By.xpath("//div[@id='textattr']"));
        String attributeValue= retrieveAttribute.getText();
        System.out.println(attributeValue);

        //find the radio button and check if is selected or not

        WebElement musicFestivalButton= driver.findElement(By.xpath("//input[@value='music_festival']"));
        boolean stateOfMusicFestival= musicFestivalButton.isEnabled();
        System.out.println("Is Music Festival enabled? "+stateOfMusicFestival);
        musicFestivalButton.click();
        stateOfMusicFestival = musicFestivalButton.isSelected();
        System.out.println("Is Music Festival option selected? "+stateOfMusicFestival);

        //check if radioButton is disabled

        WebElement techTalk = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean stateOfTechTalk = techTalk.isEnabled();
        System.out.println("is Tech Talk option button enabled? "+stateOfTechTalk);

        // toggle show more options to display option 3

        WebElement showMoreOptions = driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
        showMoreOptions.click();

        // ensure the art exhibition button is displayed

        WebElement artExhibition = driver.findElement(By.xpath("//input[@value='art_exhibition']"));
        boolean stateOfArtExhibition = artExhibition.isDisplayed();
        System.out.println("is art exhibition displayed? "+stateOfArtExhibition);

        // check the text present in the web element and print it on the console

        WebElement mysteryElement = driver.findElement(By.xpath("//div[@id='hidden_message']"));
        String getTextElement = mysteryElement.getText();
        System.out.println(getTextElement);

        // check if CheckBox1 is enabled, click on it

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        boolean statusOfCheckBox1 = checkBox1.isEnabled();
        System.out.println("is CheckBox1 enabled? "+statusOfCheckBox1);
        checkBox1.click();

        //check if CheckBox2 is disabled

        WebElement checkBox2 = driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
        boolean statusOfCheckBox2 = checkBox2.isEnabled();
        System.out.println("is CheckBox2 enabled? "+statusOfCheckBox2);

        // Text input clear and send some keys

        WebElement inputField = driver.findElement(By.xpath("//input[@id='inputField']"));
        inputField.clear();
        inputField.sendKeys("here is the custom text entered");
    }
}


