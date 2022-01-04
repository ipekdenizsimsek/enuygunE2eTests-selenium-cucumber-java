package com.enuygun.reservation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

    private static final String PAGE_URL = "https://www.enuygun.com/";

    @FindBy (xpath = "//*[@id=\"OriginInput\"]")
    private WebElement fromInput;

    @FindBy (xpath = "//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]")
    private WebElement selectIstanbul;

    @FindBy (xpath = "//*[@id=\"DestinationInput\"]")
    private WebElement toInput;

    @FindBy (xpath = "//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div")
    private WebElement selectIzmir;

    @FindBy (xpath = "//*[@id=\"DepartureDate\"]")
    private WebElement departureDateButton;

    @FindBy (xpath = "//*[@id=\"FlightSearchForm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[5]/div")
    private WebElement DepartureDate;

    @FindBy (xpath = "//*[@id=\"ReturnDate\"]")
    private WebElement returnDateButton;

    @FindBy (xpath = "//*[@id=\"FlightSearchForm\"]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[7]/div")
    private WebElement returnDate;

    @FindBy(xpath =  "//*[@id=\"FlightSearchForm\"]/div/div[3]/div[2]/button")
    private WebElement findFlightsButton;

    public HomePage () {
        PageFactory.initElements(driver, this);
    }

    public void goToHomePage() {
        driver.get(PAGE_URL);
    }

    public void searchAndSelectDepartAirportWithWord(String searchWord) {
        this.fromInput.click();
        this.fromInput.sendKeys(searchWord);
        this.selectIstanbul.click();
    }
    public void searchAndSelectDestinationAirportWithWord(String searchWord) {
        this.toInput.click();
        this.toInput.sendKeys(searchWord);
        this.selectIzmir.click();
    }

    public void selectDepartureDate() {
        this.departureDateButton.click();
        this.DepartureDate.click();
    }
    public void selectReturnDate() {
        this.returnDateButton.click();
        this.returnDate.click();
    }
    public void clickFindFlights() {
        this.findFlightsButton.click();
    }
}
