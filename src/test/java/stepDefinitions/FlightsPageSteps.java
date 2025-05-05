package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.FlightsPage;
import utils.SeleniumUtils;

public class FlightsPageSteps {
    WebDriver driver = Hooks.driver; // Access WebDriver from Hooks
    //HomePage homePage = new HomePage(driver); // Create an instance of LoginPage
    //SeleniumUtils seleniumUtils = new SeleniumUtils(driver); // Create an instance of SeleniumUtils
    FlightsPage flightsPage = new FlightsPage(driver);

    @Then("{string} for flights page should be loaded")
    public void domestic_and_international_flights_page_should_be_loaded(String string) {
        boolean bStatus = flightsPage.verifyFlightsPageHeader();
        if (bStatus) {
            Assert.assertEquals(string, flightsPage.getPageHeaderText());
        }
    }

    @When("the user selects {string} radio button")
    public void selectTripType(String tripType) {
        flightsPage.chooseTripType(tripType);
    }

    @Then("{string}, {string}, {string}, {string} dropdown should be displayed")
    public void verify_expected_dropdown_should_be_displayed(String from, String to, String departure, String travellersNClass) {
        /*flightsPage.verifyFields(from);
        flightsPage.verifyFields(to);
        flightsPage.verifyDepartureFieldDisplayed(departure);
        flightsPage.verifyTravellersClassFieldDisplayed(travellersNClass);*/
        flightsPage.verifyFields(from);
        flightsPage.verifyFields(to);
        flightsPage.verifyFields(departure);
        flightsPage.verifyFields(travellersNClass);
    }

    @Then("{string}, {string}, {string}, {string}, {string} dropdown should be displayed")
    public void verify_expected_dropdown_should_be_displayed_RoundTrip(String from, String to, String departure, String returnFrom, String travellersNClass) {

        flightsPage.verifyFields(from);
        flightsPage.verifyFields(to);
        flightsPage.verifyFields(departure);
        flightsPage.verifyFields(returnFrom);
        flightsPage.verifyFields(travellersNClass);
    }

    @When("the user selects {string} value as {string}")
    public void the_user_selects_value_as(String fromOrToField, String value) {
        // Write code here that turns the phrase above into concrete actions

        flightsPage.selectFromRToValues(fromOrToField, value);
    }
    @When("the user selects {string} month value as {string} and date value as {string}")
    public void the_user_selects_month_value_as_and_date_value_as(String departure, String monthYear, String date) {
        // Write code here that turns the phrase above into concrete actions
        flightsPage.selectDepartureDate(departure, monthYear, date);
    }

    @When("the user selects traveller {string} value as {string}")
    public void the_user_selects_traveller_value_as(String travellerType, String value) {
        // Write code here that turns the phrase above into concrete actions

        flightsPage.selectTravellerCount(travellerType, value);
    }

    @When("the user clicks {string} dropdown")
    public void the_user_clicks_dropdown(String travellersNClass) {
        // Write code here that turns the phrase above into concrete actions
        flightsPage.clickTravellersNClass(travellersNClass);
    }

    @When("the user clicks on {string} option")
    public void the_user_clicks_on_option(String classType) {
        // Write code here that turns the phrase above into concrete actions
        flightsPage.selectTravelClassType(classType);
    }

    @When("the user clicks on done button")
    public void the_user_clicks_on_done_button() {
        // Write code here that turns the phrase above into concrete actions
        flightsPage.clickDoneButton_TravelNClass();
    }

    @When("the user clicks on search flights button")
    public void the_user_clicks_on_search_flights_button() {
        // Write code here that turns the phrase above into concrete actions
        flightsPage.clickSearchFlights();
    }

    @Then("the search the results section should be displayed")
    public void the_search_the_results_section_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(flightsPage.getSearchResultsHeaderText());
    }
}
