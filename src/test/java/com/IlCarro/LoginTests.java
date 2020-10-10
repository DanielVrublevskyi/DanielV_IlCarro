package com.IlCarro;

import org.openqa.selenium.By;
//import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
   @BeforeMethod
   public void ensurePreconditions(){

       if(!isLoginFormPresent())
       {
           if (isUserLoggedIn())
           {
               logOut();
           }
           clickLoginTabOnHeader();
       }

   }


    @Test
    public void loginRegisteredUserTest(){


        fillLoginForm(new User().setEmail("aa@bb15.com").setPassword("Aa1234567"));

        submitForm();

        Assert.assertTrue(isUserLoggedIn());
        String email = wd.findElement(By.cssSelector("[href='/account']")).getText();

        Assert.assertEquals(email, "aa@bb15.com");
    }

    public void fillLoginForm(User user) {

        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());

//        type(By.name("email"),"aa@bb15.com");
//        type(By.name("password"),"Aa1234567");
    }


}
