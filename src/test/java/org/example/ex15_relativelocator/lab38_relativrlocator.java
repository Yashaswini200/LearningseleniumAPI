package org.example.ex15_relativelocator;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class lab38_relativrlocator extends TestCaseBoilerPlate {
        @Test
        public void test_js() throws Exception {
            driver.get("https://awesomeqa.com/practice.html");
            WebElement span=driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));
            driver.findElement(with(By.id("exp-2")).toRightOf(span)).click();
        }
}
