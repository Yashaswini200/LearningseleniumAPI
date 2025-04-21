package org.example.ex01_Selenium_basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSElenium_02 {
    @Test
    @Description("open the app.vwo.com")
    public void test_selenum02(){
        //open the url
        EdgeDriver driver=new EdgeDriver();
        //navigate the url
        driver.get("https://app.vwo.com");

        //assert the url
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
    }
}
