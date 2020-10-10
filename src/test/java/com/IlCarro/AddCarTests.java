package com.IlCarro;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AddCarTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){

        isPresentElementLetTheCar();
        click(By.xpath("//header/section[1]/ul[1]/li[2]/a[1]"));


    }

    @Test
    public void testFormLetTheCarWork(){
        // click(By.cssSelector(".let-carwork-style_let_car__location__30BIh"));

        type(By.cssSelector("[name='country']"), "Israel");
        type(By.cssSelector(".address"), "Netanya, Herzl St 7");
        type(By.cssSelector(".distance_included"), "501");
        type(By.cssSelector(".serial_number"), "12-100-12");
        type(By.cssSelector(".brand"), "Kia");
        type(By.cssSelector(".model"), "Sorento");
        type(By.cssSelector(".year"), "2010");
        type(By.cssSelector(".engine"), "2.5");
        type(By.cssSelector(".fuel_consumption"), "9");
        type(By.cssSelector(".fuel"), "petrol");
        type(By.cssSelector(".transmition"), "automatic");
        type(By.cssSelector(".wd"), "4WD");
        type(By.cssSelector(".horsepower"), "250");
        type(By.cssSelector(".torque"), "520");
        type(By.cssSelector(".doors"),"4");
        type(By.cssSelector(".seats"), "5");
        type(By.cssSelector(".class"), "C");
        type(By.cssSelector("[name='about']"), "Good car");
        type(By.cssSelector(".type_feature"), "Blind spot warning");
        type(By.cssSelector(".price"), "320");

        submitForm();

    }
}

