package com.IlCarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class OpenHomePageTests {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");

    }

    @Test
    public void homePageTest extends e(){
        System.out.println("Site is opened");
//        wd.findElement(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));
        System.out.println("Find Car Form: " + isFindCarFormPresent());
        isFindCarFormPresent2();
    }

    public boolean isElementPresent (By locator){
        return wd.findElements(locator).size()>0;
    }

    public boolean isFindCarFormPresent (){
        return isElementPresent(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));

    }

//    public boolean isFindCarFormPresent2(){
//        try{
//            wd.findElement(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));
//            return true;
//        } catch (NoSuchElementException){
//            return false;
//        }
//    }

    public boolean isFindCarFormPresent2(By by){
        return isElementPresent2(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));
    }
    public boolean isElementPresent2(){
        try{
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException){
            return false;
        }
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
