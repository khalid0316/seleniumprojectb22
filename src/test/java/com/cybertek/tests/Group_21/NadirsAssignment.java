package com.cybertek.tests.Group_21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NadirsAssignment {
    public static void main(String[] args) throws InterruptedException {

        // set up the the driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa3.vytrack.com/user/login");

        Thread.sleep(1500);
        driver.findElement(By.id("prependedInput")).sendKeys("user159");
        Thread.sleep(1500);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        Thread.sleep(1500);
        driver.findElement(By.id("_submit")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification PASSED!");
        }else {

            System.out.println("Title Verification FAILED!");
        }
        Thread.sleep(3500);
        driver.quit();
    }
}
