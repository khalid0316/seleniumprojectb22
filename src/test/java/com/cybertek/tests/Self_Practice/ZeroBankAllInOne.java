package com.cybertek.tests.Self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ZeroBankAllInOne {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/");

        driver.manage().window().maximize();

//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Thread.sleep(3000);

        driver.findElement(By.id("signin_button")).click();


        Thread.sleep(3000);
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password"+ Keys.ENTER);

        driver.findElement(By.id("details-button")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("proceed-link")).click();

        Thread.sleep(3000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero - Account Summary";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASSED - Actual title is the same as expected title");
        }else{
            System.out.println("FAILED: Title verification");
        }

        Thread.sleep(3000);
        driver.findElement(By.id("transfer_funds_tab")).click();

        Thread.sleep(3000);
         WebElement dropdown =  driver.findElement(By.id("tf_fromAccountId"));
         dropdown.click();

        Select savings = new Select(dropdown);
        savings.selectByValue("3");

        Thread.sleep(3000);

        WebElement dropDownMenuChecking = driver.findElement(By.id("tf_toAccountId"));
        dropDownMenuChecking.click();

        Select checking = new Select(dropDownMenuChecking);
        checking.selectByValue("2");

        Thread.sleep(3000);

        driver.findElement(By.className("input-small")).sendKeys("750");

        Thread.sleep(3000);
        driver.findElement(By.id("tf_description")).sendKeys("Save someone from Bankruptcy :)");

    }
}
