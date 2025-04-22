package org.example.ex02_Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSelenuim_04 {
    public static void main(String[] args){
        //do want to run on chrome or edge
        ChromeDriver driver=new ChromeDriver();
        //do you wnat o t run on chrome then change to edge mostly it is used
        WebDriver driver1=new ChromeDriver();
        driver1=new EdgeDriver();
        driver1=new FirefoxDriver();
        //do you want to run on multiple browers, aws machine

        RemoteWebDriver driver2=new ChromeDriver();
    }
}
