package org.example.ex15_relativelocator;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class lab39_rl_p2 extends TestCaseBoilerPlate {
    @Test
    public void test_js() throws Exception {
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.switchTo().frame("result");

        WebElement submit=driver.findElement(By.xpath("//form[@id='form']/button"));
        WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
        WebElement small=driver.findElement(with(By.tagName("small")).below(username));
Thread.sleep(10000);
driver.quit();
//
    }
}
