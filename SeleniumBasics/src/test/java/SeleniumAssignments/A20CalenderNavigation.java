package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class A20CalenderNavigation {
    public static void main(String[] args) {
        //Declare the instance
        WebDriver driver = new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        //Navigate to https://www.syntaxprojects.com/jquery-date-picker-demo-homework.php

        driver.get("https://www.syntaxprojects.com/jquery-date-picker-demo-homework.php");

        //Select "From" Dates


        driver.findElement(By.id("from_date")).click();
        boolean notFound = true;
        while (notFound) {
            //   continue to click on next month
            WebElement fromMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));

            String getCurrentMonth = fromMonth.getText();
            if (getCurrentMonth.equals("April")) {
                List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
                for (WebElement fromDate : fromDates) {
                    String currentDate = fromDate.getText();
                    if (currentDate.equals("4")) {
                        fromDate.click();
                    }
                }
                //once date found and selected
                notFound = false;

            } else {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }

        }
        //Select "To" Dates

        driver.findElement(By.id("to_date")).click();
        boolean notFound1 = true;
        while (notFound1) {
            //      continue to click on next month
            WebElement toMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));

            String getCurrentMonth = toMonth.getText();
            if (getCurrentMonth.equals("May")) {
                List<WebElement> toDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
                for (WebElement toDate : toDates) {
                    String currentToDate = toDate.getText();
                    if (currentToDate.equals("1")) {
                        toDate.click();
                    }
                }
                //once date found and selected
                notFound1 = false;

            } else {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }

        }

    }
}
