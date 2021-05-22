package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {
    public static void main(String[] args) {
        //TC #3: Facebook header verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2.Go to https://www.facebook.com
        driver.get("https://facebook.com");

        // 3.Verify header text is as expected:
        WebElement header = driver.findElement(By.className("_8eso"));

        //short cut for auto-enerating variable type
        //alt + ENTER --> WINDOWS
        // Option + ENTER --> MAC


        // Expected: “Connect with friends and the world around you on Facebook.”
        String ecpectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = header.getText();

        if (actualHeader.equals(ecpectedHeader)){
            System.out.println("Header verification PASSED!");
        }else {
            System.out.println("Header Verification FAILED!");
        }
    }

}
