package org.example.ex02_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium_13 {
    @Description("option calss")
    @Test
    public void test01() throws Exception{
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addExtensions(new File(""));
        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com");
    }

}
