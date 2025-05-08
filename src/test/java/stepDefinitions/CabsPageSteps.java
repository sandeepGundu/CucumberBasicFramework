package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CabsPage;
import utils.SeleniumUtils;

public class CabsPageSteps {
    WebDriver driver = Hooks.driver; // Access WebDriver from Hooks
    CabsPage cabsPage = new CabsPage(driver); // Create an instance of CabsPage
    SeleniumUtils seleniumUtils = new SeleniumUtils(driver); // Create an instance of SeleniumUtils

    @When("the user selects \"Outstation One-way\" radio button")
    public void the_user_selects_outstation_one_way_radio_button() {
        cabsPage.selectOutstationOneWay();
    }

    @Then("\"From\", \"To\", \"Pickup Date\", \"Pickup Time\" dropdown should be displayed")
    public void dropdown_should_be_displayed() {
        // Add assertions to verify the dropdowns are displayed
    }

    @When("the user selects \"From\" value as {string}")
    public void the_user_selects_from_value_as(String fromCity) {
        cabsPage.selectFromCity(fromCity);
    }

    @And("the user selects \"To\" value as {string}")
    public void the_user_selects_to_value_as(String toCity) {
        cabsPage.selectToCity(toCity);
    }

    @And("the user selects \"Pickup Date\" month value as {string} and date value as {string}")
    public void the_user_selects_pickup_date_month_value_as_and_date_value_as(String monthYear, String day) {
        cabsPage.selectPickupDate(monthYear, day);
    }

    @And("the user selects \"Pickup Time\" value as {string}")
    public void the_user_selects_pickup_time_value_as(String pickupTime) {
        cabsPage.selectPickupTime(pickupTime);
    }

    @And("the user clicks on \"search cabs\" button")
    public void the_user_clicks_on_search_cabs_button() {
        cabsPage.clickSearchCabsButton();
    }

    @Then("the search the results section should be displayed")
    public void the_search_the_results_section_should_be_displayed() {
        // Add assertions to verify the search results section is displayed
    }
}
