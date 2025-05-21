package org.example.ex10_Action_class;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class lab33_actionclass_drapanddrop extends TestCaseBoilerPlate {
    @Test
    public void test() {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions action = new Actions(driver);

        WebElement from=driver.findElement(By.id("column-a"));
        WebElement to=driver.findElement(By.id("column-b"));
        action.dragAndDrop(from,to).build().perform();
    }
}
