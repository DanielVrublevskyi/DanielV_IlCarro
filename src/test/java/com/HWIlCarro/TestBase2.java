package com.HWIlCarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase2 {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");

    }


    public boolean isElementPresent(By by){
        try{
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException ex){
            return false;
        }
    }



    @AfterMethod(enabled = false)
    public void tearDown(){
        wd.quit();
    }
}

