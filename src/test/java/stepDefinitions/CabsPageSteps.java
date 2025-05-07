package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CabsPage;
import utils.SeleniumUtils;

public class CabsPageSteps {
    WebDriver driver = Hooks.driver; // Access WebDriver from Hooks
    CabsPage cabsPage = new CabsPage(driver); // Create an instance of CabsPage

    @Then("\"Book Online Cab\" for cabs page should be loaded")
    public void book_online_cab_for_cabs_page_should_be_loaded() {
        boolean bStatus = cabsPage.verifyCabsPageHeader();
        if (bStatus) {
            Assert.assertEquals("Book Online Cab", cabsPage.getPageHeaderText());
        }
    }

    @When("the user selects \"Outstation One-way\" radio button")
    public void the_user_selects_outstation_one_way_radio_button() {
        cabsPage.selectOutstationOneWay();
    }

    @Then("\"From\", \"To\", \"Pickup Date\", \"Pickup Time\" dropdown should be displayed")
    public void from_to_pickup_date_pickup_time_dropdown_should_be_displayed() {
        cabsPage.verifyFields("From");
        cabsPage.verifyFields("To");
        cabsPage.verifyFields("Pickup Date");
        cabsPage.verifyFields("Pickup Time");
    }

    @When("the user selects \"From\" value as \"HYDERABAD CENTRAL UNIVERSITY\"")
    public void the_user_selects_from_value_as_hyderabad_central_university() {
        cabsPage.selectFromValue("HYDERABAD CENTRAL UNIVERSITY");
    }

    @And("the user selects \"To\" value as \"Sanath Nagar\"")
    public void the_user_selects_to_value_as_sanath_nagar() {
        cabsPage.selectToValue("Sanath Nagar");
    }

    @And("the user selects \"Pickup Date\" month value as \"May 2025\" and date value as \"17\"")
    public void the_user_selects_pickup_date_month_value_as_may_2025_and_date_value_as_17() {
        cabsPage.selectPickupDate("May 2025", "17");
    }

    @And("the user selects \"Pickup Time\" value as \"10:00 AM\"")
    public void the_user_selects_pickup_time_value_as_10_00_am() {
        cabsPage.selectPickupTime("10:00 AM");
    }

    @And("the user clicks on \"search cabs\" button")
    public void the_user_clicks_on_search_cabs_button() {
        cabsPage.clickSearchCabsButton();
    }

    @Then("the search results section should be displayed")
    public void the_search_results_section_should_be_displayed() {
        cabsPage.verifySearchResultsDisplayed();
    }
}
