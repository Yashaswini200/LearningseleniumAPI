package org.example.ex17_data_driven_testing;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class lab45_ddt_testng_poi_real {
    public EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){


    }

    @Test(dataProvider="getData")
    public void test_js(String email,String password)  {
        System.out.println("email"+email+"and "+"password "+password);
    }
    @DataProvider
    public Object[][] getData(){
return Utilexcel.getTestdata("sheet1");
        
    }

    @AfterTest
    public void closeBrowser() throws  Exception{
//        Thread.sleep(10000);
//        driver.quit();

    }

}
