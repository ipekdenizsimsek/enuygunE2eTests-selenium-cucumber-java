package com.enuygun.reservation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReservationPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"contact_email\"]")
    private WebElement emailInput;

    @FindBy (xpath = "//*[@id=\"contact_cellphone\"]")
    private WebElement cellphoneInput;

    @FindBy (xpath = "//*[@id=\"firstName_0\"]")
    private WebElement firstNameInput;

    @FindBy (xpath = "//*[@id=\"lastName_0\"]")
    private WebElement lastNameInput;

    @FindBy (xpath = "//*[@id=\"birthDateDay_0\"]")
    private WebElement birthDateDayInput;

    @FindBy (xpath = "//*[@id=\"birthDateDay_0\"]/option[11]")
    private WebElement selectBirthDateDay;

    @FindBy (xpath = "//*[@id=\"birthDateMonth_0\"]")
    private WebElement birthDateMonthInput;

    @FindBy (xpath = "//*[@id=\"birthDateMonth_0\"]/option[7]")
    private WebElement selectBirthDateMonth;

    @FindBy (xpath = "//*[@id=\"birthDateYear_0\"]")
    private WebElement birthDateYearInput;

    @FindBy (xpath = "//*[@id=\"birthDateYear_0\"]/option[14]")
    private WebElement SelectBirthDateYear;

    @FindBy (xpath = "//*[@id=\"publicId_0\"]")
    private WebElement publicIdInput;

    @FindBy (xpath = "//*[@id=\"passenger-form\"]/div[3]/div/div[2]/div[6]/div/div/div[2]/label")
    private WebElement genderSelect;

    @FindBy (xpath = "//*[@id=\"healthCode_0\"]")
    private WebElement healthCodeInput;

    @FindBy (xpath = "//*[@id=\"passenger-form\"]/div[4]/div/div/div[2]/label[2]/div")
    private WebElement supportSelect;

    @FindBy (xpath = "//*[@id=\"passenger-form\"]/div[7]/div[1]/div/div[2]/button")
    private WebElement proceedToCheckoutButton;

    private String invalidPublicIdPopoverPath = " /html/body/div[13]/div[2]";

    private String invalidHealthCodeAlertPath = " //*[@id=\"ReservationGeneralError\"]/div/div/div[2]";

    public ReservationPage() {
        PageFactory.initElements(driver, this);
    }


    public void fillForm(String email, String cellphone, String firstName, String lastName, String publicId, String healthCode) {
        this.emailInput.sendKeys(email);
        this.cellphoneInput.sendKeys(cellphone);
        this.firstNameInput.sendKeys(firstName);
        this.lastNameInput.sendKeys(lastName);
        this.birthDateDayInput.click();
        this.selectBirthDateDay.click();
        this.birthDateMonthInput.click();
        this.selectBirthDateMonth.click();
        this.birthDateYearInput.click();
        this.SelectBirthDateYear.click();
        this.publicIdInput.sendKeys(publicId);
        this.genderSelect.click();
        this.healthCodeInput.sendKeys(healthCode);
        this.supportSelect.click();
    }


    public void clickProceedToCheckOutBtn() {
        this.proceedToCheckoutButton.click();
    }

    public void checkInvalidPublicIdMsgVisible() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(invalidPublicIdPopoverPath)));
    }

    public void checkInvalidHealthCodeMsgVisible() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(invalidHealthCodeAlertPath)));
    }
}
