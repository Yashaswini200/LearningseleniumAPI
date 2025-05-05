package org.example.ex10_Action_class;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class lab29_actionclass extends TestCaseBoilerPlate {
    @Test
    public void testaction() {
        String url = "https://www.spicejet.com/";
        driver.get(url);
        WebElement source = driver.findElement(By.xpath("//div[@dat-testid=\"to-testId-orgin\"]/div/div/input"));

        Actions action = new Actions(driver);
        action.moveToElement(source).click().sendKeys("BlR").build().perform();
    }
}
