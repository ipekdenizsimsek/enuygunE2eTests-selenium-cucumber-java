package com.enuygun.reservation.pages;

import com.enuygun.reservation.configure.Configure;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage() {
        this.driver = Configure.driver;
    }
}
