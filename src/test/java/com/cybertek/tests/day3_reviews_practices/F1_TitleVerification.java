package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) {
        //TC #1: Facebook title verification
        // 1.Open Chrome browser
        // setup WebDriverManager
        WebDriverManager.chromedriver().setup();
        //Open Chrome Driver
        WebDriver driver = new ChromeDriver();
        // this will maximize the page
        driver.manage().window().maximize();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3.Verify title:
        // Expected: “Facebook -Log In or Sign Up”
        String excpectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(excpectedTitle)){
            System.out.println("Title verification PASSED!!");
        }else {
            System.out.println("title Verification FAILED!!");
        }

    }
}
