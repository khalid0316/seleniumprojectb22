package com.cybertek.Utilities;

// TASK: NEW METHOD CREATION.
// Method name : getDriver
// Static method
// Accepts String arg: browserType
 //  -  this args will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static void main(String[] args) {
        //return(getDriver());
        getDriver("chrome");
    }

    public static WebDriver getDriver(String browserType){
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriver chrome = new ChromeDriver();
            //System.out.println("Chrome PASSED!!");
            return chrome;
        }else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriver firefox = new FirefoxDriver();
            //System.out.println("Firefox PASSED!!");
            return firefox;
        }else {
            System.out.println("ERROR , Browser not found");
        }
        return null;
    }
}
