package org.example.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenuim_06 {
    @Description("open the url")
    @Test
    public void test_selenium_01(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        System.out.println("title"+driver.getTitle());
        System.out.println("url"+driver.getCurrentUrl());
        System.out.println("pg"+driver.getPageSource());
        driver.quit();
    }
}
