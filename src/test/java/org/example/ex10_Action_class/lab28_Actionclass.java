package org.example.ex10_Action_class;

import org.example.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class lab28_Actionclass extends TestCaseBoilerPlate {
    @Test
    public void testaction(){
        String url="https://awesomeqa.com/practice.html";
        driver.get(url);
        WebElement firstname=driver.findElement(By.name("firstname"));
        Actions action=new Actions(driver);
        action.keyDown(Keys.SHIFT)
                .sendKeys(firstname,"the yashu")
                .keyUp(Keys.SHIFT).build().perform();

    }



}
