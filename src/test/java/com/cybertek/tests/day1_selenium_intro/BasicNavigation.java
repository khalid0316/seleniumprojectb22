package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        /** 1- setup the browser driver */
        WebDriverManager.chromedriver().setup();

        /** 2- create instance of selenium web driver */
        //this line opens a browser
        WebDriver driver = new ChromeDriver();

        // this line will maximize the browser
        driver.manage().window().maximize();

        // below will work for mac only
        //driver.manage().window().fullscreen();

        /** 3- get the page of tesla */
        driver.get("https://www.tesla.com");

        System.out.println("Current title: " + driver.getTitle());

        String currenturl = driver.getCurrentUrl();
        System.out.println("currenturl = " + currenturl);


        /** Going back using navigations */
        Thread.sleep(2000);
        driver.navigate().back();

        /** Going forward using navigations */
        Thread.sleep(2000); // this putting 3 seconds of wait / stops the code for 3 sec
        driver.navigate().forward();

        /** Refreshing the page using navigation */
        Thread.sleep(2000); // this putting 3 seconds of wait / stops the code for 3 sec
        driver.navigate().refresh();

        /** going to another url using .to()method */
        Thread.sleep(2000); // this putting 3 seconds of wait / stops the code for 3 sec
        driver.navigate().to("https://www.google.com");

        System.out.println("Current Title: " + driver.getTitle());
        System.out.println("currenturl = " + currenturl);

        // below message will close the currently opened browser
        // REMEMBER -> will only close 1 browser or 1 tab
        //driver.close();






    }
}
