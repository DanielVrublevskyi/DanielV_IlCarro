//package com.Copy.IlCarro;
//
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class CreateAccountTests extends TestBase {
//// preconditions: user should be logged out
//
//
//    @BeforeMethod
//    public void ensurePreconditions() {
//        if (!isSignUpPresentInHeader()) {
//            logOut();
//        }
//    }
//
//
//    @Test
//    public void testSignUp() throws InterruptedException {
//        wd.findElement(By.cssSelector("[href='/signup']")).click();     //click on SignUp button
//        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));
//        fillRegistrationForm(new User()
//                            .setFirstName("CC")
//                            .setSecondName("BB")
//                            .setEmail("aa@bb15.com")
//                            .setPassword("Aa1234567"));
//
//
//
////        wd.findElement(By.cssSelector("#second_name")).click();
////        wd.findElement(By.cssSelector("#second_name")).clear();
////        wd.findElement(By.cssSelector("#second_name")).sendKeys("CC");
////
////        wd.findElement(By.cssSelector("#email")).click();
////        wd.findElement(By.cssSelector("#email")).clear();
////        wd.findElement(By.cssSelector("#email")).sendKeys("aa@bb15.com");
////
////        wd.findElement(By.cssSelector("#password")).click();
////        wd.findElement(By.cssSelector("#password")).clear();
////        wd.findElement(By.cssSelector("#password")).sendKeys("Aa1234567");
//
//
////        wd.findElement(By.cssSelector("#check_policy")).click();
//        click(By.cssSelector("#check_policy"));
////    click submit button
//
//
//        pause(200);
//        submitForm();
////    check login form displayed
//        Assert.assertTrue(isLoginFormPresent());
//    }
//
//    public void pause(int millis) throws InterruptedException {
//        Thread.sleep(millis);
//    }
//
//    public void fillRegistrationForm(User user) {
//        type(By.name("#first_name"), user.getFirstName());
//        type(By.name("#second_name"), user.getSecondName());
//        type(By.name("#email"), user.getEmail());
//        type(By.name("#password"), user.getPassword());
//    }
//
//    @Test
//    public void testSignUpWithoutPassword() throws InterruptedException {
//        wd.findElement(By.cssSelector("[href='/signup']")).click();     //click on SignUp button
//        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));
//
//        fillRegistrationForm(new User().setFirstName("Vasya").setSecondName("Katz").setEmail("qq@bb15.com"));
//
//        click(By.cssSelector("#check_policy"));
//        pause(200);
////        submitForm();
//        Assert.assertTrue(isLoginFormPresent());
//    }
//
//
//
//}
