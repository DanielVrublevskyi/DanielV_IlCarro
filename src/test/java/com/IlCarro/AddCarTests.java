package com.IlCarro;

import org.testng.annotations.Test;

public class AddCarTests extends TestBase{


    @Test
    public void testFormLetTheCarWorkForLoggedUser() throws InterruptedException {


        if(!appManager.getUser1().isUserLoggedIn()){
            appManager.getUser1().logIn();
        }

        appManager.getCarHelper().openAddCarFromHeader();
        appManager.getCarHelper().fillCarForm(new Car().setCountry("Israel").setAddress("Netanya, Herzl St 7").setDistance("501").setSereailNumber("121-95-121")
                .setBrand("Kia").setModel("Sorento").setYear("2010").setEngine("V6").setFuelConsumption("9").setFuel("petrol")
                .setTransmission("automatic").setWd("4WD").setHorsePower("250").setTorque("520").setDoors("4").setSeats("5").setCarClass("C")
                .setAbout("Good car").setFeatures("Blind spot warning").setPricePerDay("320"));

        appManager.getCarHelper().pause(1000);
        appManager.getCarHelper().submitForm();

    }

    @Test
    public void NegativeTestAddCarWithoutDoorsInfo() throws InterruptedException {
        appManager.getCarHelper().fillCarForm(new Car().setCountry("Israel").setAddress("Netanya, Herzl St 7").setDistance("501").setSereailNumber("132-18-128")
                .setBrand("Kia").setModel("Sorento").setYear("2010").setEngine("V6").setFuelConsumption("9").setFuel("petrol")
                .setTransmission("automatic").setWd("4WD").setHorsePower("250").setTorque("520").setSeats("5").setCarClass("C")
                .setAbout("Good car").setFeatures("Blind spot warning").setPricePerDay("320"));

        appManager.getCarHelper().pause(1000);
        appManager.getCarHelper().submitForm();

    }

    @Test
    public void testFormLetTheCarWorkForNotLoggedUser() throws InterruptedException {
        if(appManager.getUser1().isUserLoggedIn()){
            appManager.getUser1().logOut();
        }
        appManager.getCarHelper().openAddCarFromHeader();
        appManager.getCarHelper().fillCarForm(new Car().setCountry("Israel").setAddress("Netanya, Herzl St 7").setDistance("501").setSereailNumber("121-95-121")
                .setBrand("Kia").setModel("Sorento").setYear("2010").setEngine("V6").setFuelConsumption("9").setFuel("petrol")
                .setTransmission("automatic").setWd("4WD").setHorsePower("250").setTorque("520").setDoors("4").setSeats("5").setCarClass("C")
                .setAbout("Good car").setFeatures("Blind spot warning").setPricePerDay("320"));

        appManager.getCarHelper().pause(1000);
        appManager.getCarHelper().submitForm();

    }


}

