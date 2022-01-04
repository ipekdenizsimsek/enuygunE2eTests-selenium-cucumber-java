package com.enuygun.reservation;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com/enuygun/reservation/reservation.feature"},
        glue = {"com.enuygun.reservation.pages",
                "com.enuygun.reservation.steps",
                "com.enuygun.reservation.configure"},
        plugin = {"pretty",
        "json:target/cucumber_json_reports/reservation.json",
        "html:target/reservation-html"})
public class ReservationTest {
}
