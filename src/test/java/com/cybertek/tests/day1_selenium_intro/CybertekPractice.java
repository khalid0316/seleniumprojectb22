package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekPractice {
    public static void main(String[] args) {
        // setup browser!
        WebDriverManager.chromedriver().setup();

        //open google chrome browser!
        WebDriver driver = new ChromeDriver();

        //// maximize browser page
        driver.manage().window().maximize();

        // open Cybertek.com website

        driver.get("https://practice.cybertekschool.com");

        //verify title!
        String actualTitle = driver.getTitle();

        String excpectedTitle = "cybertek";

        if (excpectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("Title is as expected. verification PASSED!");
        }else{
            System.out.println("Title is not as expected.verification FAILED!!!!");
        }

    }
}
