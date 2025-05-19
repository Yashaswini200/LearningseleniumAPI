package org.example.ex14_js_shadowdom;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class lab37_js_code_shadowdom extends TestCaseBoilerPlate {
    @Test
    public void test_js() throws Exception{
        driver.get("https://selectorshub.com/xpath-practice-page/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement div_toscroll = driver.findElement(By.xpath("//div[@id='userName']"));
        Thread.sleep(3000);
        WebElement input=(WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"input#pizza\");");
        input.sendKeys("veg loader");
    }
}
