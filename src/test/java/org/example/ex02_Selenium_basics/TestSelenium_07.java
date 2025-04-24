package org.example.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_07 {
    @Description("open the url")
    @Test
    public void test_selenium_01(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
        driver.quit();
    }
}
