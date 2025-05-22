package org.example.ex12_Window;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.util.Set;

public class lab35_window_part1 extends TestCaseBoilerPlate {
    @Test
    public void test() throws Exception{
        driver.get("https://the-internet.herokuapp.com/windows");
        String paretn=driver.getWindowHandle();
        System.out.println(paretn);
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> windowHandles=driver.getWindowHandles();
        System.out.println(windowHandles);
        for(String handle:windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("test passed");
            }
        }
       // driver.switchTo().window(paretn);
Thread.sleep(4000);
    }
}
