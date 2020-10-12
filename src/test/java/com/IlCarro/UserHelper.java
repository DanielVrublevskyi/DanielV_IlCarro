package com.IlCarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public boolean isLoginFormPresent()
    {
        return isElementPresent(By.cssSelector(".Login_login__right_block__1niYm"));
    }

    public void logOut() {
        click(By.xpath("//a[contains(., 'logOut')]"));
    }

    public boolean isUserLoggedIn() {
       return isElementPresent(By.xpath("//a[contains(., 'logOut')]"));
    }

    public void fillLoginForm(User user) {

        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());

//        type(By.name("email"),"aa@bb15.com");
//        type(By.name("password"),"Aa1234567");
    }

    public void logIn() {
        fillLoginForm(new User().setEmail("aa@bb15.com").setPassword("Aa1234567"));

        submitForm();
    }

    public void fillRegistrationForm(User user) {
        type(By.name("first_name"), user.getFirstName());
        type(By.name("second_name"), user.getSecondName());
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }

    public void selectPolicyCheckBox() {
        click(By.cssSelector("#check_policy"));
    }

    public boolean isRegistrationFormOpened() {
        return isElementPresent(By.cssSelector("form.signup__fields"));
    }

    public void openRegistrationFromHeader() {
        click(By.cssSelector("[href='/signup']"));
    }
}
