package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BusPage;

public class BusPageSteps {
    //WebDriver driver = Hooks.driver; // Access WebDriver from Hooks
    BusPage busPage = new BusPage(); // Create an instance of BusPage
    //SeleniumUtils seleniumUtils = new SeleniumUtils(driver); // Create an instance of SeleniumUtils

    @Then("{string} for Bus page should be loaded")
    public void bus_ticket_booking_for_bus_page_should_be_loaded(String busPageHeader) {
        boolean bStatus = busPage.verifyBusPageHeader();
        if (bStatus) {
            Assert.assertEquals(busPageHeader, busPage.getPageHeaderText());
        }
    }

    /*@Then("{string}, {string}, {string}, {string}, {string} fields should be displayed")
    public void from_to_travel_date_fields_should_be_displayed(String from, String to, String travelDate, String today, String tomorrow) {
        busPage.verifyFields(from);
        busPage.verifyFields(to);
        busPage.verifyTravelDateField(travelDate);
        busPage.verifyTravelDateLabels(today);
        busPage.verifyTravelDateLabels(tomorrow);
    }*/

    @And("FROM, TO, Travel Date, Today, Tomorrow fields should be displayed")
    public void from_To_Travel_Date_Today_Tomorrow_fields_should_be_displayed() {
        busPage.verifyFields("FROM");
        busPage.verifyFields("TO");
        busPage.verifyTravelDateField("Travel Date");
        busPage.verifyTravelDateLabels("Today");
        busPage.verifyTravelDateLabels("Tomorrow");
    }

    @When("user opts FROM value as {string}, {string}")
    public void user_opts_from_value_as(String fromValue1, String fromValue2) {
        busPage.selectFromValue(fromValue1, fromValue2);
    }

    @When("user opts TO value as {string}, {string}")
    public void user_opts_To_value_as(String toValue1, String toValue2) {
        busPage.selectToValue(toValue1, toValue2);
    }

    /*@When("the user selects {string} month value as {string} and date value as {string} for the bus")
    public void the_user_selects_travel_date_month_value_as_and_date_value_as_for_the_bus(String travelDateField, String monthYear, String date) {
        busPage.selectTravelDate(travelDateField, monthYear, date);
    }*/

    @When("user selects Travel Date month value as {string} and date value as {string} for the bus")
    public void user_selects_travel_date_month_value_as_and_date_value_as_for_the_bus(String monthYear, String date) {
        busPage.selectTravelDate(monthYear, date);
    }

    @When("user clicks on search bus button")
    public void the_user_clicks_on_search_bus_button() {
        busPage.clickSearchBusButton();
    }

    @Then("bus search results section should be displayed")
    public void the_bus_search_results_section_should_be_displayed() throws InterruptedException {
        busPage.verifyBusSearchResultsDisplayed();
    }
}
