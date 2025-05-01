package org.example.ex08_SVG_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.example.ex07_WaitHelper.TestSelenium25_waithelper.wait_time;

public class Lab27_svg_map {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver=new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
    }


    @Test
    public void test_Filpkart_search() throws Exception {
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();
        wait_time(10000);

        List<WebElement> states=driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
for(WebElement state:states){
    System.out.println(state.getDomAttribute("aria-label"));
    if(state.getDomAttribute("aria-label").contains("Tripura")){
        System.out.println("this is state"+state.getText());
        state.click();
    }
}
    }
    @AfterTest
    public void closeBrowser() throws Exception {
        wait_time(10000);
        driver.quit();
    }
}
