package org.example.ex04_Xpath;
//
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_17_mini_project {
    @Description("verfity that the error message")
    @Test
    public void vwo_free_trial_error() throws Exception{
        WebDriver driver=new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement make_appoint=driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_appoint.click();
        WebElement username=driver.findElement(By.xpath("//*[@id='txt-username']"));
        username.sendKeys("John Doe");
        WebElement password=driver.findElement(By.xpath("//*[@id='txt-password']"));
        password.sendKeys("ThisIsNotAPassword");
        WebElement submit_btn=driver.findElement(By.xpath("//*[@id='btn-login']"));
        submit_btn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        Thread.sleep(5000);
        driver.quit();

    }
}
