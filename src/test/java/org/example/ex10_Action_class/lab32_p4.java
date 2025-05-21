package org.example.ex10_Action_class;

import com.google.errorprone.annotations.Keep;
import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class lab32_p4 extends TestCaseBoilerPlate {
    @Test
    public void test(){
        driver.get("https://thetestingacademy.com/");
        Actions action=new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

    }
}
