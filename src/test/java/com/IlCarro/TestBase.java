package com.IlCarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    static WebDriver wd;

    @BeforeSuite
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");

    }

    @AfterSuite //(enabled = false)
    public void tearDown(){
        wd.quit();
    }

    public boolean isElementPresent (By locator){

        return wd.findElements(locator).size()>0;
    }

    public boolean isFindCarFormPresent (){
        return isElementPresent(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));

    }

    public boolean isElementPresent2(By by){
        try{
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException ex){
            return false;
        }
    }

    public boolean isFindCarFormPresent2(){
        return isElementPresent2(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));
    }



    protected boolean isLoginFormPresent()
    {
        return isElementPresent(By.cssSelector(".Login_login__right_block__1niYm"));
    }

    public void type(By locator, String text) {
       click(locator);
         wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);//    fill registration form
    }

    public void click(By locator){
        wd.findElement(locator).click();

    }
    public void submitForm(){
        new WebDriverWait(wd,15)
                            .until(ExpectedConditions
                                        .elementToBeClickable(By.cssSelector("[type='submit']"))).click();
    }

    public boolean isSignUpPresentInHeader() {
        return isElementPresent(By.cssSelector("[href='/signup']"));
    }

    public void logOut() {
        wd.findElement(By.xpath("//a[contains(., 'logOut')]")).click();
    }

    public void clickLoginTabOnHeader() {
//        click(By.cssSelector("[href='/login']"));
    wd.findElement(By.cssSelector("[href='/login']")).click();
    }

    protected boolean isUserLoggedIn() {
       return isElementPresent(By.xpath("//a[contains(., 'logOut')]"));
    }


}
