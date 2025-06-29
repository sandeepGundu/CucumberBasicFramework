package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HotelsPage;
import pages.SearchDetailsPage;
import utils.SeleniumUtils;

public class HotelsPageSteps
{
    HotelsPage hotelsPage = new HotelsPage();

    SeleniumUtils seleniumUtils = new SeleniumUtils(WebDriver_DriverManager.getDriver());

    /*@Then("{string} for hotels page should be loaded")
    public void for_hotels_page_should_be_loaded(String expectedTitle) {
        System.out.println(seleniumUtils.getPageTitle());
        boolean isTitleMatched = seleniumUtils.waitForPageTitle(expectedTitle, 10);
        if (!isTitleMatched) {
            throw new AssertionError("Hotels page did not load with the expected title: " + expectedTitle);
        }
    }

    @And("{string} for hotels header should be displayed")
    public void for_hotels_header_should_be_displayed(String expectedHeader) {
        boolean bStatus = hotelsPage.verifyHotelsPageHeader();
        if(bStatus)
        {
            String actualHeader = hotelsPage.getPageHeader();
            if (!actualHeader.equals(expectedHeader)) {
                throw new AssertionError("Expected header: " + expectedHeader + ", but got: " + actualHeader);
            }
        }
    }

    @Then("{string}, {string}, {string}, {string} dropdown should be displayed in Hotel's page")
    public void dropdown_should_be_displayed(String whereTo, String checkIn, String checkOut, String guestsAndRooms) {
        hotelsPage.verifyDropdownsDisplayed(whereTo, checkIn, checkOut, guestsAndRooms);
    }*/

    /*@When("the user selects {string} value as {string}")
    public void the_user_selects_value_as(String field, String value) {
        hotelsPage.selectFieldValue(field, value);
    }*/

    /*@When("user selects Hotel's {string} value as {string}")
    public void user_selects_hotels_value_as(String field, String value) {
        hotelsPage.selectFieldValue(field, value);
    }

    @When("the user selects {string} month value as {string} and date value as {string}")
    public void the_user_selects_month_value_as_and_date_value_as(String field, String monthYear, String date) {
        hotelsPage.selectDate(field, monthYear, date);
    }

    @When("the user clicks {string} dropdown")
    public void the_user_clicks_dropdown(String dropdownName) {
        hotelsPage.clickDropdown(dropdownName);
    }

    @And("the user selects {string} value as {int}")
    public void the_user_selects_value_as(String field, int value) {
        hotelsPage.selectDropdownValue(field, value);
    }

    @And("user clicks on {string} button")
    public void user_clicks_on_button(String buttonName) {
        hotelsPage.clickButton(buttonName);
    }

    @Then("the search results section should be displayed")
    public void the_search_results_section_should_be_displayed() {
        hotelsPage.verifySearchResultsDisplayed();
    }*/
}
