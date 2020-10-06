package com.IlCarro;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
// preconditions: user should be logged out



    @BeforeMethod
    public void ensurePreconditions(){
        if(!isSignUpPresentInHeader())
        {
            logOut();
        }
    }


    @Test
    public void testSignUp(){
       wd.findElement(By.cssSelector("[href='/signup']")).click();     //click on SignUp button
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));
        type(By.cssSelector("#first_name"), "BB");
        type(By.cssSelector("#second_name"), "CC");
        type(By.cssSelector("#email"), "aa@bb15.com");
        type(By.cssSelector("#password"),"Aa1234567");


//        wd.findElement(By.cssSelector("#second_name")).click();
//        wd.findElement(By.cssSelector("#second_name")).clear();
//        wd.findElement(By.cssSelector("#second_name")).sendKeys("CC");
//
//        wd.findElement(By.cssSelector("#email")).click();
//        wd.findElement(By.cssSelector("#email")).clear();
//        wd.findElement(By.cssSelector("#email")).sendKeys("aa@bb15.com");
//
//        wd.findElement(By.cssSelector("#password")).click();
//        wd.findElement(By.cssSelector("#password")).clear();
//        wd.findElement(By.cssSelector("#password")).sendKeys("Aa1234567");

//        wd.findElement(By.cssSelector("#check_policy")).click();
        click(By.cssSelector("#check_policy"));
//    click submit button

        submitForm();
//    check login form displayed
        Assert.assertTrue(isLoginFormPresent());
    }

}
