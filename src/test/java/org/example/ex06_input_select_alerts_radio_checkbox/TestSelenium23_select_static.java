package org.example.ex06_input_select_alerts_radio_checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium23_select_static {
    @Description("verfity that with invalid emial")
    @Test
    public void test_negative_vwo_login() throws Exception{
        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement select=driver.findElement(By.id("dropdown"));
        Select se=new Select(select);
        se.selectByIndex(1);
        se.selectByVisibleText("Option 1");
        se.selectByValue("2");
    }
}
