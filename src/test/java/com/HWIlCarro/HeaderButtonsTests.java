package com.HWIlCarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class HeaderButtonsTests extends TestBase2 {

    @Test
    public void testSearchButton(){
        System.out.println("Site is opened");
        click(By.cssSelector(".header__nav [href='/search']"));
        System.out.println("Search menu is opened:" +isSearchbarPresent());
    }


    @Test
    public void testUserEmailButton() throws InterruptedException {
//     if user logged in

        logIn();

        click(By.cssSelector(".header__nav [href='/account']"));


        String email = wd.findElement(By.cssSelector(".header__nav [href='/account']")).getText();
        System.out.println("Account " + email +" is opened: "+ isEmailButtonPresent());
        jumpToFooter();

    }

    public void logIn() throws InterruptedException {
        click(By.cssSelector(".header__nav [href='/login']"));

        fillLogInForm("aa@bb15.com", "Aa1234567");

        Thread.sleep(2000);
        click(By.cssSelector("[type=submit]"));
    }

    public void fillLogInForm(String email, String password) {
        type(By.name("email"), email);
        type(By.name("password"), password);
    }




    @Test
    public void testAboutYou() throws InterruptedException {
        logIn();
        click(By.cssSelector(".header__nav [href='/account']"));
        Thread.sleep(3000);
        WebElement AYBlock = wd.findElement(By.xpath("//h3[contains(.,'About you')]/.."));

        String name = AYBlock.findElement(By.xpath("ul[1]/li[1]")).getText();
        String email = AYBlock.findElement(By.xpath("ul[1]/li[2]")).getText();
        String phone = AYBlock.findElement(By.xpath("ul[1]/li[3]")).getText();
        String number = AYBlock.findElement(By.xpath("ul[1]/li[4]")).getText();

        System.out.println(name+"\n"+email+"\n"+phone+"\n"+number);
    }
}
