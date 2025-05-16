package org.example.ex16_Selenium_exception;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class lab43_timeout {
    public EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver=new EdgeDriver(edgeOptions);


    }
    @Test
    public void test_js() throws Exception {
        driver.get("https://google.com");
        driver.manage().window().maximize();
        try{
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='aby'])")));
        WebElement search=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search.sendKeys("yashu");
        }catch (Exception e){
            throw new RuntimeException(e);
        }


    }
    @AfterTest
    public void closeBrowser() throws  Exception{
        Thread.sleep(10000);
        driver.quit();

    }

}
