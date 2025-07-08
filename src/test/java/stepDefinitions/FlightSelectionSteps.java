package stepDefinitions;

import pages.FlightSelectionPage;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class FlightSelectionSteps {

    FlightSelectionPage flightSelectionPage = new FlightSelectionPage();

    // From: "Given the user has selected a flight from the comparison view"
    @Given("the user has selected a flight from the comparison view")
    public void user_selects_flight_from_comparison_view() {
        flightSelectionPage.selectFlight();
    }

    // From: "When the user proceeds to the next booking step"
    @When("the user proceeds to the next booking step")
    public void user_proceeds_to_next_booking_step() {
        flightSelectionPage.clickNextStep();
    }

    // From: "Then the selected flight should be highlighted"
    @Then("the selected flight should be highlighted")
    public void verify_flight_is_highlighted() {
        assertTrue("Selected flight is not highlighted", flightSelectionPage.isFlightHighlighted());
    }

    // From: "And the selected flight details should be retained for the booking process"
    @Then("the selected flight details should be retained for the booking process")
    public void verify_flight_details_are_retained() {
        assertTrue("Selected flight details are not retained", flightSelectionPage.areFlightDetailsRetained());
    }
}