package org.example.ex17_data_driven_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class lab46_ddt_testing_poi_real_vwologin {
    public EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver=new EdgeDriver(edgeOptions);


    }

    @Test(dataProvider="getData")
    public void test_js(String email,String password)  {
        System.out.println("email"+email+"and "+"password "+password);
//        EdgeOptions edgeOptions=new EdgeOptions();
//        edgeOptions.addArguments("--start-maximized");
//        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //<input
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi">
        WebElement emailinput=driver.findElement(By.id("login-username"));
        emailinput.sendKeys(email);

        //<input type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe">
        WebElement passwordinput=driver.findElement(By.name("password"));
        passwordinput.sendKeys(password);

        WebElement submit=driver.findElement(By.id("js-login-btn"));
        submit.click();

//        Thread.sleep(3000);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

        WebElement error=driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error.getText(),"Your email, password, IP address or location did not match");

    }
    @DataProvider
    public Object[][] getData(){
        return Utilexcel.getTestdata("sheet1");

    }

    @AfterTest
    public void closeBrowser() throws  Exception{
        Thread.sleep(1000000);
        driver.quit();

    }
}
