package com.IlCarro;

import org.openqa.selenium.By;
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

        fillCarForm(new Car().setCountry("Israel").setAddress("Netanya, Herzl St 7").setDistance("501").setSereailNumber("12-100-12")
                .setBrand("Kia").setModel("Sorento").setYear("2010").setEngine("2.5").setFuelConsumption("9").setFuel("petrol")
                .setTransmission("automatic").setWd("4WD").setHorsePower("250").setTorque("520").setDoors("4").setSeats("5").setCarClass("C")
                .setAbout("Good car").setFeatures("Blind spot warning").setPricePerDay("320"));

        submitForm();

    }

    public void fillCarForm(Car car) {
        type(By.cssSelector("[name='country']"), car.getCountry());
        type(By.cssSelector(".address"), car.getAddress());
        type(By.cssSelector(".distance_included"), car.getDistance());
        type(By.cssSelector(".serial_number"), car.getSereailNumber());
        type(By.cssSelector(".brand"), car.getBrand());
        type(By.cssSelector(".model"), car.getModel());
        type(By.cssSelector(".year"), car.getYear());
        type(By.cssSelector(".engine"), car.getEngine());
        type(By.cssSelector(".fuel_consumption"), car.getFuelConsumption());
        type(By.cssSelector(".fuel"), car.getFuel());
        type(By.cssSelector(".transmition"), car.getTransmission());
        type(By.cssSelector(".wd"), car.getWd());
        type(By.cssSelector(".horsepower"), car.getHorsePower());
        type(By.cssSelector(".torque"), car.getTorque());
        type(By.cssSelector(".doors"), car.getDoors());
        type(By.cssSelector(".seats"), car.getSeats());
        type(By.cssSelector(".class"), car.getCarClass());
        type(By.cssSelector("[name='about']"), car.getAbout());
        type(By.cssSelector(".type_feature"), car.getFeatures());
        type(By.cssSelector(".price"), car.getPricePerDay());
    }

    @Test
    public void testFormLetTheCarWork2(){
        fillCarForm(new Car().setCountry("Israel").setAddress("Netanya, Herzl St 7").setDistance("501").setSereailNumber("12-100-15")
                .setBrand("Renault").setModel("Megane").setYear("2010").setEngine("2.5").setFuelConsumption("9").setFuel("petrol")
                .setTransmission("automatic").setWd("4WD").setHorsePower("250").setTorque("520").setDoors("4").setSeats("5").setCarClass("C")
                .setAbout("Good car").setFeatures("Blind spot warning").setPricePerDay("320"));
        submitForm();
    }
}

