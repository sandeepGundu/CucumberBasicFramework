package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CabsPage;

public class CabsPageSteps {
    CabsPage cabsPage = new CabsPage();

    @When("user selects {string} radio button")
    public void user_selects_radio_button(String radioButton) {
        if (radioButton.equalsIgnoreCase("Outstation Round trip")) {
            cabsPage.selectOutstationRoundTrip();
        }
    }

    @Then("{string}, {string}, {string}, {string}, {string} dropdown should be displayed")
    public void dropdown_should_be_displayed(String from, String to, String pickupDate, String pickupTime, String returnDate) {
        Assert.assertTrue(cabsPage.isDropdownDisplayed(from));
        Assert.assertTrue(cabsPage.isDropdownDisplayed(to));
        Assert.assertTrue(cabsPage.isDropdownDisplayed(pickupDate));
        Assert.assertTrue(cabsPage.isDropdownDisplayed(pickupTime));
        Assert.assertTrue(cabsPage.isDropdownDisplayed(returnDate));
    }

    @When("user selects From value as {string}")
    public void user_selects_from_value_as(String fromLocation) {
        cabsPage.selectFrom(fromLocation);
    }

    @When("user selects To value as {string}")
    public void user_selects_to_value_as(String toLocation) {
        cabsPage.selectTo(toLocation);
    }

    @When("user clicks on Add Stops link to add a stop")
    public void user_clicks_on_add_stops_link_to_add_a_stop() {
        cabsPage.clickAddStops();
    }

    @Then("user selects {string} value as {string}")
    public void user_selects_value_as(String stop, String stopLocation) {
        if (stop.equalsIgnoreCase("Stop 1")) {
            cabsPage.selectStop1(stopLocation);
        }
    }

    @When("user selects Pickup Date month value as {string} and date value as {string}")
    public void user_selects_pickup_date(String monthYear, String date) {
        cabsPage.selectPickupDate(monthYear, date);
    }

    @When("user selects Pickup Time value as {string}")
    public void user_selects_pickup_time(String time) {
        cabsPage.selectPickupTime(time);
    }

    @When("user selects Return Date month value as {string} and date value as {string}")
    public void user_selects_return_date(String monthYear, String date) {
        cabsPage.selectReturnDate(monthYear, date);
    }

    @When("clicks on search cabs button")
    public void clicks_on_search_cabs_button() {
        cabsPage.clickSearchCabs();
    }

    @Then("cabs search results should be displayed")
    public void cabs_search_results_should_be_displayed() {
        Assert.assertTrue(cabsPage.isSearchResultsDisplayed());
    }
}