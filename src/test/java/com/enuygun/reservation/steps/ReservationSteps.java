package com.enuygun.reservation.steps;

import com.enuygun.reservation.pages.FlightsPage;
import com.enuygun.reservation.pages.HomePage;
import com.enuygun.reservation.pages.PaymentPage;
import com.enuygun.reservation.pages.ReservationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReservationSteps {

    private HomePage homePage;
    private FlightsPage flightsPage;
    private ReservationPage reservationPage;
    private PaymentPage paymentPage;


    @Given("A user navigates to enuygun website")
    public void aUserNavigatesToEnuygunWebsite() {
        this.homePage = new HomePage();
        this.homePage.goToHomePage();
    }

    @And("user searches for depart {string} and selects")
    public void userSearchesForDepartAndSelects(String arg0) {
        this.homePage.searchAndSelectDepartAirportWithWord(arg0);
    }

    @And("user searches for destination {string} and selects")
    public void userSearchesForDestinationAndSelects(String arg0) {
        this.homePage.searchAndSelectDestinationAirportWithWord(arg0);
    }

    @And("user selects dates")
    public void userSelectsDates() {
        this.homePage.selectDepartureDate();
        this.homePage.selectReturnDate();
    }

    @And("clicks ucuz bilet bul button")
    public void clicksUcuzBiletBulButton() {
        this.homePage.clickFindFlights();
    }

    @And("selects flights for both ways")
    public void selectsFlightsForBothWays() {
        this.flightsPage = new FlightsPage();
        this.flightsPage.selectFlight();
    }

    @When("i enter my mail {string} my cellphone {string} my first name {string} my lastname {string} my public id {string} my healthcode {string}")
    public void iEnterMyMailMyCellphoneMyFirstNameMyLastnameMyPublicIdMyHealthcode(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        this.reservationPage = new ReservationPage();
        this.reservationPage.fillForm(arg0, arg1
                ,arg2,arg3,arg4,arg5);
    }
    @And("click odemeye ilerle")
    public void clickOdemeyeIlerle() {
        this.reservationPage.clickProceedToCheckOutBtn();
    }

    @Then("system creates a reservation")
    public void systemCreatesAReservation() {
        this.paymentPage = new PaymentPage();
        this.paymentPage.isPurchaseBtnDisplayed();
    }


    @Then("system shows invalid {string} message")
    public void systemShowsInvalidMessage(String invalidParamName) {
        if (invalidParamName.equals("healthcode")) {
            this.reservationPage.checkInvalidHealthCodeMsgVisible();
        } else if (invalidParamName.equals("publicid")) {
            this.reservationPage.checkInvalidPublicIdMsgVisible();
        }

    }
}
