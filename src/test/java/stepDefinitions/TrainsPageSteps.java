package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.SearchResults_Train;
import pages.TrainsPage;

public class TrainsPageSteps
{
    //WebDriver driver = Hooks.driver;
    TrainsPage trainsPage = new TrainsPage();
    SearchResults_Train searchResultsTrain = new SearchResults_Train();

    @Then("{string} for trains page should be loaded")
    public void train_ticket_booking_page_should_be_loaded(String string) {
        boolean bStatus = trainsPage.verifyTrainsPageHeader();
        if (bStatus) {
            Assert.assertEquals(string, trainsPage.getPageHeaderText());
        }
    }

    @When("user selects {string} train type radio button")
    public void selectTrainType(String tripType) {
        trainsPage.chooseTripType(tripType);
    }

    /*@Then("{string}, {string}, {string}, {string}, {string}, {string} fields should be displayed")
    public void verify_expected_dropdown_should_be_displayed(String from, String to, String departure, String today, String tomorrow, String dayAfterTomorrow) {

        trainsPage.verifyFields(from);
        trainsPage.verifyFields(to);
        trainsPage.verifyFields(departure);
        trainsPage.verifyTatkalOptions(today);
        trainsPage.verifyTatkalOptions(tomorrow);
        trainsPage.verifyTatkalOptions(dayAfterTomorrow);
    }*/

    @Then("From, To, Departure, Today, Tomorrow, Day After Tomorrow fields should be displayed")
    public void verify_From_To_Departure_Today_DayAfterTomorrow_dropdown_should_be_displayed() {

        trainsPage.verifyFields("From");
        trainsPage.verifyFields("To");
        trainsPage.verifyFields("Departure");
        trainsPage.verifyTatkalOptions("Today");
        trainsPage.verifyTatkalOptions("Tomorrow");
        trainsPage.verifyTatkalOptions("Day After Tomorrow");
    }

    /*@When("the user selects {string} value as {string}, {string}")
    public void the_user_selects_value_as_given(String fromOrToField, String value1, String value2) {
        // Write code here that turns the phrase above into concrete actions

        trainsPage.selectFromRToValues(fromOrToField, value1, value2);
    }*/
    @When("user selects From value as {string}, {string}")
    public void user_selects_From_value_as_given(String value1, String value2) {
        // Write code here that turns the phrase above into concrete actions

        trainsPage.selectFromValue(value1, value2);
    }

    @When("user selects To value as {string}, {string}")
    public void user_selects_To_value_as_given(String value1, String value2) {
        // Write code here that turns the phrase above into concrete actions

        trainsPage.selectToValue(value1, value2);
    }

    /*@When("the user selects {string} month value as {string} and date value as {string} for the train")
    public void the_user_selects_month_value_as_and_date_value_as_for_train(String departure, String monthYear, String date) {
        // Write code here that turns the phrase above into concrete actions
        trainsPage.selectDepartureDate(departure, monthYear, date);
    }*/

    @When("user selects Departure month value as {string} and date value as {string} for the train")
    public void user_selects_Departure_month_value_as_and_date_value_as_for_train(String monthYear, String date) {
        // Write code here that turns the phrase above into concrete actions
        trainsPage.selectDepartureDate(monthYear, date);
    }

    @When("user clicks on search trains button")
    public void user_clicks_on_search_trains_button() {
        // Write code here that turns the phrase above into concrete actions
        trainsPage.clickSearchTrains();
    }

    @Then("train search results section should be displayed")
    public void search_the_results_section_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        searchResultsTrain.verifyFieldsIn_UpdateSearchPage();
    }
}
