package org.example.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium_11 {
    @Description("options")
    @Test
    public void test_selenium_01(){
        EdgeOptions edgeOptions=new EdgeOptions();
//        edgeOptions.addArguments("--window-size=1280,720");
//        edgeOptions.addArguments("--window-size=800,720");
//        edgeOptions.addArguments("--incognito");
//        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--headless");


        EdgeDriver driver=new EdgeDriver(edgeOptions);
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
