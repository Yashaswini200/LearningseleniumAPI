package org.example.ex05_Selenium_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_20_miniProject {
    @Description("verfity that with invalid emial")
    @Test
    public void testclosemodel() throws Exception {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.makemytrip.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));
        WebElement close=driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        close.click();
        Thread.sleep(3000);
        driver.quit();

    }
}
