package org.example.ex03_Selenium_locator;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium_15 { @Description("verfity that with invalid emial")
@Test
public void test_negative_vwo_login() throws Exception {
    EdgeOptions edgeOptions = new EdgeOptions();
    edgeOptions.addArguments("--start-maximized");
    WebDriver driver = new EdgeDriver(edgeOptions);
    driver.get("https://app.vwo.com");
    WebElement a_tag=driver.findElement(By.linkText("Start a free trail"));
    a_tag.click();

    Thread.sleep(3000);
    driver.quit();

}
}
