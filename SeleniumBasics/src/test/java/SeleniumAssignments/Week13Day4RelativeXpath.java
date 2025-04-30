package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week13Day4RelativeXpath {
    public static void main(String[] args) throws InterruptedException {

        // declare the instance

        WebDriver drivers = new ChromeDriver();

//     Maximize the windows
        drivers.manage().window().maximize();

        // goto www.syntaxprojects.com/Xpath-homework.php
        drivers.get("https://www.syntaxprojects.com/Xpath-homework.php");

// writing my hobbies
      WebElement hobbies=drivers.findElement(By.xpath("//input[@id='yourHobbiesId']"));
      hobbies.sendKeys("hiking,coding,posting memes");

// Create a "click button"
        WebElement button=drivers.findElement(By.xpath("//button[@type='button']"));
        button.click();

//Favorite movies
        WebElement movies=drivers.findElement(By.xpath("//input[@name='favoriteMovies']"));
        movies.sendKeys("The Transporter,24hours,CSI");

// Find text paragraph
      WebElement paragraph=drivers.findElement(By.xpath("//label[contains(text(),'ipsum dolor')]"));
      String textofString=paragraph.getText();
      System.out.println(textofString);

//Write your city
        WebElement city=drivers.findElement(By.xpath("//input[@id='yourCity']"));
        city.sendKeys("Seattle WA");

//write the email
        WebElement email=drivers.findElement(By.xpath("//input[@type='email'][1]"));
        email.sendKeys("whatever@idgaf.com");

//Enter client name
        WebElement clientName=drivers.findElement(By.xpath("//input[@data-detail='one' and @name='clientName']"));
        clientName.sendKeys("CASCADE GROUP INC");

//Enter client ID
       WebElement clientID=drivers.findElement(By.xpath("//input[$data-detail='two' or  @name='clientId']"));
       clientID.sendKeys("00725");

//Enter street number
        WebElement streetNumber=drivers.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNumber.sendKeys("Cherry Ave");

//Enter house number
         WebElement houseNumber=drivers.findElement(By.xpath("//input[@data-detail='two' and @name='HouseNo']"));
         houseNumber.sendKeys("500");



//Pause to observe
            Thread.sleep(5000);

//Close Browseer
        drivers.close();


    }
}
