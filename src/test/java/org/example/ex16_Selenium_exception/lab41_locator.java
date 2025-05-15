package org.example.ex16_Selenium_exception;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lab41_locator {
    public EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver=new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
    }
    @Test
    public void test_js() throws Exception {
        driver.get("https://app.vwo.com/");
        System.out.println("start");
        driver.manage().window().maximize();
        try {
            driver.findElement(By.id("yashu"));

        }catch (NoSuchElementException e){
            System.out.println("not running");
        }
        System.out.println("end");
}
    @AfterTest
    public void closeBrowser() throws  Exception{
        Thread.sleep(10000);
        driver.quit();

    }
}
