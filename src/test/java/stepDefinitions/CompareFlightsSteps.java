package stepDefinitions;

import io.cucumber.java.en.*;
import pages.FlightsPage;
import static org.junit.Assert.*;

public class CompareFlightsSteps {

    FlightsPage flightsPage = new FlightsPage();

    // From: "Given the user has selected multiple flights for comparison"
    @Given("the user has selected multiple flights for comparison")
    public void user_has_selected_multiple_flights_for_comparison() {
        flightsPage.selectMultipleFlightsForComparison();
    }

    // From: "When the user navigates to the flight comparison view"
    @When("the user navigates to the flight comparison view")
    public void user_navigates_to_comparison_view() {
        flightsPage.navigateToComparisonView();
    }

    // From: "Then the comparison view should display the following attributes side-by-side for all selected flights"
    @Then("the comparison view should display the following attributes side-by-side for all selected flights:")
    public void comparison_view_displays_attributes(io.cucumber.datatable.DataTable dataTable) {
        assertTrue(flightsPage.verifyComparisonAttributes(dataTable));
    }

    // From: "When the user selects to sort the flights by {string}"
    @When("the user selects to sort the flights by {string}")
    public void user_sorts_flights(String sortingAttribute) {
        flightsPage.sortFlightsByAttribute(sortingAttribute);
    }

    // From: "Then the comparison view should dynamically update to display flights sorted by {string}"
    @Then("the comparison view should dynamically update to display flights sorted by {string}")
    public void comparison_view_updates_dynamically(String sortingAttribute) {
        assertTrue(flightsPage.isComparisonViewSortedBy(sortingAttribute));
    }

    // From: "Given the user has selected a flight in the comparison view"
    @Given("the user has selected a flight in the comparison view")
    public void user_selects_flight_in_comparison_view() {
        flightsPage.selectFlightInComparisonView();
    }

    // From: "When the user proceeds to the booking step"
    @When("the user proceeds to the booking step")
    public void user_proceeds_to_booking_step() {
        flightsPage.proceedToBookingStep();
    }

    // From: "Then the selected flight should remain highlighted and retained for booking"
    @Then("the selected flight should remain highlighted and retained for booking")
    public void selected_flight_remains_highlighted() {
        assertTrue(flightsPage.isSelectedFlightHighlightedAndRetained());
    }

    // From: "When the user changes the sorting attribute to \"Price\""
    @When("the user changes the sorting attribute to \"Price\"")
    public void user_changes_sorting_to_price() {
        flightsPage.sortFlightsByAttribute("Price");
    }

    // From: "Then the comparison view should dynamically update without reloading the page"
    @Then("the comparison view should dynamically update without reloading the page")
    public void comparison_view_updates_without_reload() {
        assertTrue(flightsPage.isComparisonViewUpdatedWithoutReload());
    }

    // From: "And the flights should be displayed in ascending order of price"
    @Then("the flights should be displayed in ascending order of price")
    public void flights_displayed_in_ascending_order_of_price() {
        assertTrue(flightsPage.areFlightsDisplayedInAscendingOrderOfPrice());
    }
}