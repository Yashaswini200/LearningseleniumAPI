package org.example;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseBoilerPlate {
   public EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver=new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
    }


    @AfterTest
    public void closeBrowser() throws  Exception{
        Thread.sleep(10000);
        driver.quit();

    }
}
