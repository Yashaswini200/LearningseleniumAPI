package org.example.ex18_Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class lab49_table {
    @Test
    public void test_web_table() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        WebElement table=driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));
        List<WebElement>rows_table=table.findElements(By.tagName("tr"));
        for(int i=0;i<rows_table.size();i++){
            List<WebElement> col_table=rows_table.get(i).findElements(By.tagName("td"));
            for(WebElement c:col_table){
                System.out.println(c.getText());

            }
        }
    }
}
