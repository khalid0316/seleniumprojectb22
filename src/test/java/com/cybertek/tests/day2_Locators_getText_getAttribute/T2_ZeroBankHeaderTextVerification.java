package com.cybertek.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankHeaderTextVerification {
    public static void main(String[] args) {
        //TC #2: Zero Bank link text verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // LOCATE THE LINK AND STORE INSIDE WebElement

        WebElement zerobanklink = driver.findElement(By.className("brand"));

        //3. Verify link text from top left:
        //Expected: “Zero Bank”
        String expectedLinkText = "Zero Bank";
        String actuallinkText = zerobanklink.getText();
                //driver.findElement(By.className("brand")).getText();

        if (actuallinkText.equals(expectedLinkText)){
            System.out.println("Text Link verification PASSED!");
        }else {
            System.out.println("Text Link verification FAILED!");
        }

        //4. Verify link href attribute value contains:
        //Expected: “index.html”
        String expectedInhrefValue = "index.html";

        String actualHrefvalue = zerobanklink.getAttribute("href");

        if (actualHrefvalue.contains(expectedInhrefValue)){
            System.out.println("HREF attributes verification PASSED!");

        }else{
            System.out.println("HREF attributes verification FAILED!!!");
        }
    }
}
