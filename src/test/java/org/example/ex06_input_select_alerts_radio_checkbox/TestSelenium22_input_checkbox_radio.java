package org.example.ex06_input_select_alerts_radio_checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium22_input_checkbox_radio {
    @Description("verfity that with invalid emial")
    @Test
    public void test_negative_vwo_login() throws Exception{
        WebDriver driver=new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html\n");
        driver.findElement(By.name("firstname")).sendKeys("Yashu");
        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("exp-2")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
