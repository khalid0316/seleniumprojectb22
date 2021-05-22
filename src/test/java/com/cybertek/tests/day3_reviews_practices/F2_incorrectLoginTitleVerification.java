package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_incorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC #2: Facebook incorrect login title verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // below locating the web element and storing it into Weblemebent (object) type variable.
        WebElement inputusername = driver.findElement(By.id("email"));

        // 3.Enter incorrect username //
        inputusername.sendKeys("somethin@gmail.com");

        // 4.Enter incorrect password
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("abcdefg123" + Keys.ENTER);

        // 5.Verify title changed to:
        // Expected: “Log into Facebook”
        String expectedtitle = "Log into Facebook";
        // freezing the code for 5 secs so that chrome can catch the correct title
        Thread.sleep(5000);
        String actualtitle = driver.getTitle();

        if (actualtitle.equals(expectedtitle)){
            System.out.println("Title Verification PASSED!!!");
        }else {
            System.out.println("Title Verification FAILED!!!");
        }

    }
}
