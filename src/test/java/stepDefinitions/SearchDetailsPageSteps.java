package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SearchDetailsPage;
import utils.SeleniumUtils;

public class SearchDetailsPageSteps
{
    SearchDetailsPage searchDetailsPage = new SearchDetailsPage();

    SeleniumUtils seleniumUtils = new SeleniumUtils(WebDriver_DriverManager.getDriver());
    /*@Then("{string} for hotels page should be loaded")
    public void for_hotels_page_should_be_loaded(String expectedTitle) {
        System.out.println(seleniumUtils.getPageTitle());
        boolean isTitleMatched = seleniumUtils.waitForPageTitle(expectedTitle, 10);
        if (!isTitleMatched) {
            throw new AssertionError("Hotels page did not load with the expected title: " + expectedTitle);
        }
    }*/

    /*@Then("{string} for flights page should be loaded")
    public void domestic_and_international_flights_page_should_be_loaded(String string) {
        boolean bStatus = searchDetailsPage.verifyPageHeader();
        if (bStatus) {
            //Assert.assertEquals(string, flightsPage.getPageHeaderText());
        }
    }*/
}
