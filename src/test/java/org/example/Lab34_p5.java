package org.example.ex11_fileupload;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab34_p5 extends TestCaseBoilerPlate {
    @Test
    public void test() {
        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement upload=driver.findElement(By.id("fileToUpload"));
        String workinddir=System.getProperty("user.dir");
        System.out.println(workinddir);
        upload.sendKeys(workinddir+"src/test/java/org/example/Text");
        driver.findElement(By.name("submit")).click();
    }
}
