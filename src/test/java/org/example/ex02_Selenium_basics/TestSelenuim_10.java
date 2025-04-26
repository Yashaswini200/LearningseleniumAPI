package org.example.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenuim_10 {
    @Description("open the url")
    @Test
    public void test_selenium_01() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt status
            System.out.println("Thread was interrupted: " + e.getMessage());
        }
//        driver.close();
        driver.quit();
    }
    }
