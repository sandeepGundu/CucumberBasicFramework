package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumUtils;

public class BusPage {
    WebDriver driver;
    SeleniumUtils seleniumUtils;

    // Constructor to initialize WebDriver
    public BusPage(WebDriver driver) {
        this.driver = driver;
        this.seleniumUtils = new SeleniumUtils(driver);
    }

    // Locators for the bus page elements
    private By fromField = By.id("fromCity");
    private By toField = By.id("toCity");
    private By travelDateField = By.id("travelDate");
    private By searchBusButton = By.id("searchBusButton");
    private By busSearchResultsSection = By.id("busSearchResults");

    public void verifyBusPageLoaded() {
        seleniumUtils.isElementDisplayed(driver.findElement(fromField));
        seleniumUtils.isElementDisplayed(driver.findElement(toField));
        seleniumUtils.isElementDisplayed(driver.findElement(travelDateField));
        seleniumUtils.isElementDisplayed(driver.findElement(searchBusButton));
    }

    public void selectFromCity(String fromCity) {
        seleniumUtils.selectDropdownValue(driver.findElement(fromField), fromCity);
    }

    public void selectToCity(String toCity) {
        seleniumUtils.selectDropdownValue(driver.findElement(toField), toCity);
    }

    public void selectTravelDate(String monthYear, String date) {
        seleniumUtils.selectDate(driver.findElement(travelDateField), monthYear, date);
    }

    public void clickSearchBusButton() {
        driver.findElement(searchBusButton).click();
    }

    public void verifyBusSearchResultsDisplayed() {
        seleniumUtils.isElementDisplayed(driver.findElement(busSearchResultsSection));
    }
}
