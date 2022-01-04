package com.enuygun.reservation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage extends BasePage {

    private String purchaseBtnPath = "//*[@id=\"Payment-form\"]/div/div[8]/div/div[2]/button";

    public PaymentPage() {
        PageFactory.initElements(driver, this);
    }

    public void isPurchaseBtnDisplayed() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(purchaseBtnPath)));
    }

}
