package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.BusesPage;
import utils.SeleniumUtils;

public class BusesSteps {
    WebDriver driver;
    BusesPage busesPage;
    SeleniumUtils seleniumUtils;

    public BusesSteps() {
        driver = Hooks.driver;
        busesPage = new BusesPage(driver);
        seleniumUtils = new SeleniumUtils(driver);
    }

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        driver.get("https://www.example.com");
    }

    @When("the user chooses {string} from main menu")
    public void the_user_chooses_from_main_menu(String tripType) {
        busesPage.chooseTripType(tripType);
    }

    @Then("{string} for Bus page should be loaded")
    public void for_Bus_page_should_be_loaded(String pageHeader) {
        assert busesPage.getPageHeaderText().equals(pageHeader);
    }

    @Then("{string}, {string}, {string} fields should be displayed")
    public void fields_should_be_displayed(String fromField, String toField, String travelDateField) {
        assert busesPage.verifyFields(fromField);
        assert busesPage.verifyFields(toField);
        assert busesPage.verifyFields(travelDateField);
    }

    @When("the user selects {string} value as {string}")
    public void the_user_selects_value_as(String field, String value) {
        busesPage.selectFromRToValues(field, value);
    }

    @When("the user selects {string} month value as {string} and date value as {string} for the bus")
    public void the_user_selects_month_value_as_and_date_value_as_for_the_bus(String departureField, String monthYear, String date) {
        busesPage.selectDepartureDate(departureField, monthYear, date);
    }

    @When("the user clicks on search bus button")
    public void the_user_clicks_on_search_bus_button() {
        busesPage.clickSearchBuses();
    }

    @Then("the bus search results section should be displayed")
    public void the_bus_search_results_section_should_be_displayed() {
        assert busesPage.getSearchResultsHeaderText().contains("Bus Search Results");
    }
}