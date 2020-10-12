package com.HWIlCarro;

import com.HWIlCarro.TestBase2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class HeaderButtonsTests extends TestBase2 {

    @Test
    public void testSearch(){
        System.out.println("Site is opened");
        wd.findElement(By.cssSelector("header [href='/search']")).click();
        System.out.println("Search menu is opened:" +isSearchbarPresent());
    }

    public boolean isSearchbarPresent(){
        return isElementPresent(By.cssSelector(".main-search__sidebar"));
    }
}
