package org.example.ex18_Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class lab48_testingselenium {
    @Test
    public void test_web_table(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        String first="//table[@id=\\\"customer\\\"]/tbody/tr[";
        String second="]/td[";
        String third="]";
        int row=driver.findElements(By.xpath("//table[@id=\"customer\"]/tbody/tr")).size();
        int coloumn=driver.findElements(By.xpath("//table[@id=\\\"customer\\\"]/tbody/tr[2]/td")).size();
        System.out.println(row);
        System.out.println(coloumn);
        for(int i=2;i<=row;i++){
            for(int j=1;j<=coloumn;j++)
            {
                String dynamic_path=first+i+second+j+third;
                System.out.println(dynamic_path);
                String data=driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data);
                if(data.contains("Helen Bennett")){
                    String cou=dynamic_path+"/following-sibling::td";
                    String cou_text=driver.findElement(By.xpath(cou)).getText();
                    System.out.println(cou_text);
                }
            }
        }
    }

}
