package org.example.ex01_Selenium_basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestSelenium01 {

    @Test
    public void test_VerifyVWOLogin(){
        // Write the code which will execute the perform the ui interactions
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }

}
