package org.example.ex12_Window;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class TestProjectInterview  {
    public EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver=new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws Exception {
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
Thread.sleep(5000);
String parent=driver.getWindowHandle();
List<WebElement> list_heap=driver.findElements(By.cssSelector("[data-qa=\\\"yedexafobi\\\"]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(list_heap.get(1)).click().build().perform();
        Set<String> allhand=driver.getWindowHandles();
        for(String hands:allhand){
            if(!hands.equals(parent)){
                driver.switchTo().frame("heatmap-iframe");
                WebElement clickmap=driver.findElement(By.cssSelector("[data-qa=\"liqokuxuba\"]"));
                clickmap.click();
            }
        }

    }
    @AfterTest
    public void closeBrowser() throws  Exception{
        Thread.sleep(100000);
        driver.quit();

    }
}
