package org.example.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_08 {

    @Description("open the url")
    @Test
    public void test_selenium_01() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("CURA Healthcare service is visible");
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
        driver.quit();
    }
}
