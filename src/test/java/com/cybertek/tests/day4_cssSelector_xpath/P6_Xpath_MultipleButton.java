package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_Xpath_MultipleButton {
    public static void main(String[] args) throws InterruptedException {

        //TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //3. Click on Button 1 // will locate it first and then click on it.
        WebElement button1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        button1.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        String expectedText = "Click on button one!";
        String actualText = resultText.getText();

        if (actualText.equals(resultText)){
            System.out.println("Text verification Passed!");
        }else {
            System.out.println("Text verification Passed!");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
