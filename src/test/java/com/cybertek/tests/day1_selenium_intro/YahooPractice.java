package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice {
    public static void main(String[] args) {

        // 1- setup the Webdriver
        WebDriverManager.chromedriver().setup();

        // 2- open Chrome browser
        WebDriver driver = new ChromeDriver();
        // maximize browser
        driver.manage().window().maximize();

        // 3- go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        // 4- verify the title
        String expectedTitle = "Yahoo";

        //actual title
        String actualTitle = driver.getTitle();

        //create our verification code:
        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title is as expected. verification PASSED!");
        }else{
            System.out.println("Title is not as expected.verification FAILED!!!!");
        }
    }
}
