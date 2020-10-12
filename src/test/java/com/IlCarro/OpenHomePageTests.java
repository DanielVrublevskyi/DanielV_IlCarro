package com.IlCarro;

import org.testng.annotations.Test;

public class OpenHomePageTests extends TestBase{

    @Test
    public void homePageTest(){
        System.out.println("Site is opened");
//        wd.findElement(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));
        System.out.println("Find Car Form: " + appManager.getCarHelper().isFindCarFormPresent());
        appManager.getCarHelper().isFindCarFormPresent2();
    }

    //    public boolean isFindCarFormPresent2(){
//        try{
//            wd.findElement(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));
//            return true;
//        } catch (NoSuchElementException){
//            return false;
//        }
//    }

}
