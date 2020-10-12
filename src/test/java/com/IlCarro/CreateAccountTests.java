package com.IlCarro;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
// preconditions: user should be logged out


    @BeforeMethod (enabled = false)
    public void ensurePreconditions() {
        if (!appManager.getHeader().isSignUpPresentInHeader()) {
            appManager.getUser1().logOut();
        }
    }


    @Test
    public void testSignUp() throws InterruptedException {
        appManager.getUser1().openRegistrationFromHeader();     //click on SignUp button
        Assert.assertTrue(appManager.getUser1().isRegistrationFormOpened());
        appManager.getUser1().fillRegistrationForm(new User()
                            .setFirstName("qqq")
                            .setSecondName("qqq")
                            .setEmail("qq@qq15.com")
                            .setPassword("Aa1234567"));


        appManager.getUser1().selectPolicyCheckBox();
        appManager.getCarHelper().pause(200);
        appManager.getCarHelper().submitForm();

//    check login form displayed
        Assert.assertTrue(appManager.getUser1().isLoginFormPresent());
    }

    @Test (enabled = false)
    public void testNegativeSignUpWithoutPassword() throws InterruptedException {
        appManager.getUser1().openRegistrationFromHeader();     //click on SignUp button
        Assert.assertTrue(appManager.getUser1().isRegistrationFormOpened());

        appManager.getUser1().fillRegistrationForm(new User().setFirstName("Vasya").setSecondName("Katz").setEmail("qq@bb15.com"));

        appManager.getUser1().selectPolicyCheckBox();
        appManager.getCarHelper().pause(200);
        appManager.getCarHelper().submitForm();

        Assert.assertFalse(appManager.getUser1().isLoginFormPresent());
    }


}
