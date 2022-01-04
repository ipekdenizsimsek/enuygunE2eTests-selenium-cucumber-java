package com.enuygun.reservation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage extends BasePage {


    @FindBy(xpath = "//*[@id=\"SearchRoot\"]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div[16]/div/div[2]/div/div[5]/button")
    private WebElement departureFlight;

    @FindBy (xpath = "//*[@id=\"SearchRoot\"]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[12]/div/div[2]/div/div[4]/button")
    private WebElement returnFlight;

    public FlightsPage() {
        PageFactory.initElements(driver, this);
    }

    public void scrollToTheFlight() {
        JavascriptExecutor jse = (JavascriptExecutor)this.driver;
        jse.executeScript("window.scrollBy(0,1500)");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
    }

    public void selectFlight() {
        this.scrollToTheFlight();
        this.departureFlight.click();
        this.scrollToTheFlight();
        this.returnFlight.click();
    }

}
