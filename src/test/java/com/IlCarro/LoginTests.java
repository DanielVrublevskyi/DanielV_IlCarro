package com.IlCarro;

//import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
   @BeforeMethod
   public void ensurePreconditions(){

       if(!appManager.getUser1().isLoginFormPresent())
       {
           if (appManager.getUser1().isUserLoggedIn())
           {
               appManager.getUser1().logOut();
           }
           appManager.getHeader().clickLoginTabOnHeader();
       }

   }


    @Test
    public void loginRegisteredUserTest(){


        appManager.getUser1().fillLoginForm(new User().setEmail("aa@bb15.com").setPassword("Aa1234567"));

        appManager.getUser1().submitForm();

        Assert.assertTrue(appManager.getUser1().isUserLoggedIn());
        String email = appManager.getHeader().getEmailTextFromHeader();
        System.out.println("user's email:" + email);
        Assert.assertEquals(email, "aa@bb15.com");
    }


}
