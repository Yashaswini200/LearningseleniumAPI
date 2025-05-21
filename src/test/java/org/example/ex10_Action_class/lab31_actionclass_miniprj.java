package org.example.ex10_Action_class;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.List;

import java.time.Duration;

public class lab31_actionclass_miniprj extends TestCaseBoilerPlate {
@Test
    public void makemytrip() throws Exception{
    String url="https://www.makemytrip.com/";
    driver.get(url);
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
    WebElement close=driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
    close.click();

    WebElement fromcity=driver.findElement(By.id("fromCity"));
    Actions action=new Actions(driver);
    action.moveToElement(fromcity).click().sendKeys("IXC").build().perform();

    List<WebElement> list=  driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
    for(WebElement e:list){
        if(e.getText().contains("Chandigraph Airport")){
            e.click();
        }
    }

}
}
