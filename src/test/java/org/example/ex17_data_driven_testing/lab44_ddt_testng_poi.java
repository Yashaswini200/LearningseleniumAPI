package org.example.ex17_data_driven_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class lab44_ddt_testng_poi {
    public EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
//        EdgeOptions edgeOptions=new EdgeOptions();
//        edgeOptions.addArguments("--guest");
//        driver=new EdgeDriver(edgeOptions);


    }

    @Test(dataProvider="getData")
    public void test_js(String email,String password)  {
        System.out.println("email"+email+"and "+"password "+password);
    }
@DataProvider
    public Object[][] getData(){
        return  new Object[][]{
                new Object[]{"admin1@gmail.com","pass121"},
                new Object[]{"admin2@gmail.com","pass122"},
                new Object[]{"admin3@gmail.com","pass127899"}
        };
    }
//    @DataProvider
//    public Object[][] getDataxlsx(){
//        return  new Object[][]{
//                new Object[]{"admin1@gmail.com","pass121"},
//                new Object[]{"admin2@gmail.com","pass122"},
//                new Object[]{"admin3@gmail.com","pass123"}
//        };
    //}
    @AfterTest
    public void closeBrowser() throws  Exception{
//        Thread.sleep(10000);
//        driver.quit();

    }

}
