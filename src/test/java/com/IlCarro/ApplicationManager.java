package com.IlCarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    CarHelper car1;
    WebDriver wd;
    UserHelper user1;
    HeaderHelper header;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");

        user1 = new UserHelper(wd);
        car1 = new CarHelper(wd);
        header = new HeaderHelper(wd);
    }

    public void stop() {
        wd.quit();
    }



    public CarHelper getCarHelper() {
        return car1;
    }

    public UserHelper getUser1() {
        return user1;
    }

    public HeaderHelper getHeader() {
        return header;
    }
}
