package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BusPage;
import utils.SeleniumUtils;

public class BusPageSteps {
    WebDriver driver = Hooks.driver; // Access WebDriver from Hooks
    BusPage busPage = new BusPage(driver); // Create an instance of BusPage
    SeleniumUtils seleniumUtils = new SeleniumUtils(driver); // Create an instance of SeleniumUtils

    @Then("Bus Ticket Booking for Bus page should be loaded")
    public void bus_ticket_booking_for_bus_page_should_be_loaded() {
        busPage.verifyBusPageLoaded();
    }

    @Then("FROM, TO, Travel Date fields should be displayed")
    public void from_to_travel_date_fields_should_be_displayed() {
        busPage.verifyBusPageLoaded();
    }

    @When("the user selects From value as {string}")
    public void the_user_selects_from_value_as(String fromCity) {
        busPage.selectFromCity(fromCity);
    }

    @When("the user selects To value as {string}")
    public void the_user_selects_to_value_as(String toCity) {
        busPage.selectToCity(toCity);
    }

    @When("the user selects Travel Date month value as {string} and date value as {string} for the bus")
    public void the_user_selects_travel_date_month_value_as_and_date_value_as_for_the_bus(String monthYear, String date) {
        busPage.selectTravelDate(monthYear, date);
    }

    @When("the user clicks on search bus button")
    public void the_user_clicks_on_search_bus_button() {
        busPage.clickSearchBusButton();
    }

    @Then("the bus search results section should be displayed")
    public void the_bus_search_results_section_should_be_displayed() {
        busPage.verifyBusSearchResultsDisplayed();
    }
}
