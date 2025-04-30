package SeleniumAssignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Week13Day5CSS {
    public static void main(String[] args) throws InterruptedException {

        // declare instance
        WebDriver driver = new ChromeDriver();

        // maximize
        driver.manage().window().maximize();

        // go to website
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        //Print User ID
        WebElement userID = driver.findElement(By.cssSelector("input[id='UserID']"));
        userID.sendKeys("Godwin");

        //Print the  username
        WebElement userName = driver.findElement(By.cssSelector("input[id='UserName']"));
        userName.sendKeys("Crackheadllc");

        //Print lecture
        WebElement intro2Lecture = driver.findElement(By.cssSelector("input[name='LectureIntro']"));
        intro2Lecture.sendKeys("Selenium basics");

        //Print Feedback1
        WebElement feedbackRay = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackRay.sendKeys("I love selenium class");

        //Print Feedback2
        WebElement feedbackDucky = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackDucky.sendKeys("I got all day for this.");

        //Print clientID
        WebElement clientID = driver.findElement(By.cssSelector("input[data-ends='CSSModuleconclientID']"));
        clientID.sendKeys("Client007-SEA-01");

        //Print Email
        WebElement emailID = driver.findElement(By.cssSelector("input[name='email']"));
        emailID.sendKeys("Dongeezybaba1@gmail.com");

        //Print the course Topic
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name='CourseTopic']"));
        courseTopic.sendKeys("CSS HMW Assignment");

        //close the browser
        driver.close();
    }
}


