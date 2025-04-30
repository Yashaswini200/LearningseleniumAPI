package org.example.ex05_Selenium_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium18_waits {
    @Description("verfity that the error message")
    @Test
    public void vwo_free_trial_error() throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
Thread.sleep(3000);//jvm to halt
    }
}
