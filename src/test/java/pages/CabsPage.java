package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.WebDriver_DriverManager;
import utils.SeleniumUtils;

public class CabsPage {
    SeleniumUtils seleniumUtils;
    WebDriver driver = WebDriver_DriverManager.getDriver();

    public CabsPage() {
        seleniumUtils = new SeleniumUtils(driver);
    }

    // Locators
    private By outstationRoundTripRadioButton = By.id("outstationRoundTrip");
    private By fromDropdown = By.id("fromDropdown");
    private By toDropdown = By.id("toDropdown");
    private By addStopsLink = By.id("addStops");
    private By stop1Dropdown = By.id("stop1Dropdown");
    private By pickupDatePicker = By.id("pickupDate");
    private By pickupTimePicker = By.id("pickupTime");
    private By returnDatePicker = By.id("returnDate");
    private By searchCabsButton = By.id("searchCabs");
    private By searchResults = By.id("searchResults");

    // Methods
    public void selectOutstationRoundTrip() {
        seleniumUtils.clickElement(driver.findElement(outstationRoundTripRadioButton));
    }

    public void selectFrom(String fromLocation) {
        seleniumUtils.selectDropdownByVisibleText(driver.findElement(fromDropdown), fromLocation);
    }

    public void selectTo(String toLocation) {
        seleniumUtils.selectDropdownByVisibleText(driver.findElement(toDropdown), toLocation);
    }

    public void clickAddStops() {
        seleniumUtils.clickElement(driver.findElement(addStopsLink));
    }

    public void selectStop1(String stopLocation) {
        seleniumUtils.selectDropdownByVisibleText(driver.findElement(stop1Dropdown), stopLocation);
    }

    public void selectPickupDate(String monthYear, String date) {
        seleniumUtils.selectDateFromDatePicker(driver.findElement(pickupDatePicker), monthYear, date);
    }

    public void selectPickupTime(String time) {
        seleniumUtils.selectDropdownByVisibleText(driver.findElement(pickupTimePicker), time);
    }

    public void selectReturnDate(String monthYear, String date) {
        seleniumUtils.selectDateFromDatePicker(driver.findElement(returnDatePicker), monthYear, date);
    }

    public void clickSearchCabs() {
        seleniumUtils.clickElement(driver.findElement(searchCabsButton));
    }

    public boolean isSearchResultsDisplayed() {
        return seleniumUtils.isElementDisplayed(driver.findElement(searchResults));
    }
}