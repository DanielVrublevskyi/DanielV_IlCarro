package com.IlCarro;

import org.openqa.selenium.By;
//import org.testng.Assert;
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


        type(By.name("email"),"aa@bb15.com");
        type(By.name("password"),"Aa1234567");

        submitForm();


    }


}