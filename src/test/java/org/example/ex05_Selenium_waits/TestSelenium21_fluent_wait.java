package org.example.ex05_Selenium_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class TestSelenium21_fluent_wait {
    @Description("verfity that with invalid emial")
    @Test
    public void test_negative_vwo_login() throws Exception{
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //<input
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi">
        WebElement emailinput=driver.findElement(By.id("login-username"));
        emailinput.sendKeys("admin@admin.com");

        //<input type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe">
        WebElement passwordinput=driver.findElement(By.name("password"));
        passwordinput.sendKeys("admin");

        WebElement submit=driver.findElement(By.id("js-login-btn"));
        submit.click();

//        Thread.sleep(3000);
        FluentWait<WebDriver> wait=new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
        WebElement error=wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.className("notification-box-description"));
            }
        });
        Assert.assertEquals(error.getText(),"Your email, password, IP address or location did not match");
        driver.quit();

    }
}
