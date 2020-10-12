package com.IlCarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends HelperBase{

    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    public boolean isSignUpPresentInHeader() {
        return isElementPresent(By.cssSelector("[href='/signup']"));
    }

    public void clickLoginTabOnHeader() {
//        click(By.cssSelector("[href='/login']"));
        click(By.cssSelector("[href='/login']"));
    }

    public boolean isPresentElementLetTheCar() {
        return isElementPresent(By.xpath("//a[contains(., 'logOut')]"));
    }

    public String getEmailTextFromHeader() {
        return wd.findElement(By.cssSelector("[href='/account']")).getText();
    }
}
