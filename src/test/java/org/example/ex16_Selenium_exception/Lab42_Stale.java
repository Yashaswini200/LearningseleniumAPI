package org.example.ex16_Selenium_exception;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab42_Stale {
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

        WebElement submit=driver.findElement(By.xpath("//input[@class=\"truncate\"]"));
        driver.navigate().refresh();
        try {
            submit.sendKeys("liki ");
        }catch (StaleElementReferenceException e){
            WebElement submit1=driver.findElement(By.xpath("//input[@class=\"truncate\"]"));
            submit1.sendKeys("liki ");

        }

    }
    @AfterTest
    public void closeBrowser() throws  Exception{
        Thread.sleep(10000);
        driver.quit();

    }
}
