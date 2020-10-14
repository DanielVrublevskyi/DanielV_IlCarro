package com.HWIlCarro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase2 {
    WebDriver wd;

    @BeforeSuite
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



    @AfterSuite(enabled = false)
    public void tearDown(){
        wd.quit();
    }




    public void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public boolean isSearchbarPresent(){
        return isElementPresent(By.cssSelector(".main-search__sidebar"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public boolean isEmailButtonPresent() {
        return isElementPresent(By.xpath("//h3[contains(.,'About you')]"));
    }

    public void jumpToFooter(){

        wd.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }
}

