package com.IlCarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class OpenHomePageTests extends TestBase{

    @Test
    public void homePageTest(){
        System.out.println("Site is opened");
//        wd.findElement(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));
        System.out.println("Find Car Form: " + isFindCarFormPresent());
        isFindCarFormPresent2();
    }

    //    public boolean isFindCarFormPresent2(){
//        try{
//            wd.findElement(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));
//            return true;
//        } catch (NoSuchElementException){
//            return false;
//        }
//    }

}
