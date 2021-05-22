package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class F5_Basic_login_authentication {
    public static void main(String[] args) throws InterruptedException {
        //TC#5: Basic login authentication1-Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // 3-Verify title equals:
        //      Expected: Web Orders Login
        String expectedtitle = "Web Orders Login";
        String actualtitle = driver.getTitle();

        if (actualtitle.equals(expectedtitle)){
            System.out.println("Title Verification PASSED!!!");
        }else {
            System.out.println("Title Verification FAILED!!!");
        }

        // 4-Enter username: Tester
       WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester" + Keys.ENTER);

        // 5-Enter password: test
        WebElement passwordinput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordinput.sendKeys("test" + Keys.ENTER);

        // 6-Click “Sign In” button
        driver.findElement(By.className("button")).click();

        // 7-Verify title equals:
        //           Expected: Web Orders

        String titleexp = "Web Orders";
        Thread.sleep(3000);
        driver.getTitle();
        if (actualtitle.equals(titleexp)){
            System.out.println("Title Verification PASSED!!!");
        }else {
            System.out.println("Title Verification FAILED!!!");
        }
        driver.quit();
    }

}
