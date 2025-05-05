package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumUtils;

public class BusesPage {
    WebDriver driver;
    SeleniumUtils seleniumUtils;

    public BusesPage(WebDriver driver) {
        this.driver = driver;
        seleniumUtils = new SeleniumUtils(driver);
    }

    private By departureDropdown = By.id("departureDropdown");
    private By busesPageHeader = By.id("busesPageHeader");

    public void chooseTripType(String tripType) {
        seleniumUtils.selectDropdownByVisibleText(By.id("tripTypeDropdown"), tripType);
    }

    public void clickDoneButton_TravelNClass() {
        seleniumUtils.click(By.id("doneButton"));
    }

    public void clickSearchBuses() {
        seleniumUtils.click(By.id("searchBusesButton"));
    }

    public void clickTravellersNClass(String travellersNClassField) {
        seleniumUtils.click(By.id(travellersNClassField));
    }

    public By getDepartureDropdown(String departureField) {
        return By.id(departureField);
    }

    public String getPageHeaderText() {
        return seleniumUtils.getText(busesPageHeader);
    }

    public String getSearchResultsHeaderText() {
        return seleniumUtils.getText(By.id("searchResultsHeader"));
    }

    public void selectDepartureDate(String departureField, String monthYear, String date) {
        seleniumUtils.selectDateFromDatePicker(By.id(departureField), monthYear, date);
    }

    public void selectFromRToValues(String fromOrToField, String fromOrToValue) {
        seleniumUtils.selectDropdownByVisibleText(By.id(fromOrToField), fromOrToValue);
    }

    public void selectTravelClassType(String classType) {
        seleniumUtils.selectDropdownByVisibleText(By.id("travelClassDropdown"), classType);
    }

    public void selectTravellerCount(String travellerType, String noOfTravellers) {
        seleniumUtils.selectDropdownByVisibleText(By.id(travellerType), noOfTravellers);
    }

    public boolean verifyDepartureFieldDisplayed(String webElementName) {
        return seleniumUtils.isElementDisplayed(By.id(webElementName));
    }

    public boolean verifyFields(String webElementName) {
        return seleniumUtils.isElementDisplayed(By.id(webElementName));
    }

    public boolean verifyBusesPageHeader() {
        return seleniumUtils.isElementDisplayed(busesPageHeader);
    }

    public boolean verifyTravellersClassFieldDisplayed(String webElementName) {
        return seleniumUtils.isElementDisplayed(By.id(webElementName));
    }
}