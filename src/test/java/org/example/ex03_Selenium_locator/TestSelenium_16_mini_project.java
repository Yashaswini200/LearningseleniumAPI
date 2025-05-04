package org.example.ex03_Selenium_locator;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_16_mini_project {
    @Description("verfity that the error message")
    @Test
    public void vwo_free_trial_error(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");
        WebElement a_tag=driver.findElement(By.partialLinkText("Start"));
        a_tag.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("free trail"),"URL does not contain free-trial");
        WebElement emisl=driver.findElement(By.id(""));
        emisl.sendKeys("abcyashu");

        WebElement check=driver.findElement(By.id(""));
        check.click();

        List<WebElement> button=driver.findElements(By.tagName("button"));
        button.get(0).click();




driver.quit();
    }
}
