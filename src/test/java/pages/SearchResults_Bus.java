package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumUtils;

public class SearchResults_Bus {
    WebDriver driver;

    // Constructor to initialize WebDriver
    public SearchResults_Bus(WebDriver driver) {
        this.driver = driver;
    }

    SeleniumUtils seleniumUtils = new SeleniumUtils(driver);

    private By fromField = By.xpath("//p[text()='FROM']/following-sibling::div//p[contains(@class, 'FswFldTitle')]");
    private By toField = By.xpath("//p[text()='TO']/following-sibling::div//p[contains(@class, 'FswFldTitle')]");
    private By travelDateField = By.xpath("//p[text()='Travel Date']/following-sibling::input");
    private By searchBusButton = By.xpath("//button[text()='SEARCH BUS']");
    private By busSearchResultsSection = By.xpath("//div[contains(@class, 'bus-search-results')]");

    public void verifyFieldsInBusSearchPage() {
        seleniumUtils.isElementDisplayed(driver.findElement(fromField));
        seleniumUtils.isElementDisplayed(driver.findElement(toField));
        seleniumUtils.isElementDisplayed(driver.findElement(travelDateField));
        seleniumUtils.isElementDisplayed(driver.findElement(searchBusButton));
    }

    public void selectFromValue(String fromValue) {
        seleniumUtils.sendText(driver.findElement(fromField), fromValue);
    }

    public void selectToValue(String toValue) {
        seleniumUtils.sendText(driver.findElement(toField), toValue);
    }

    public void selectTravelDate(String monthYear, String date) {
        seleniumUtils.sendText(driver.findElement(travelDateField), monthYear + " " + date);
    }

    public void clickSearchBusButton() {
        seleniumUtils.clickElement(driver.findElement(searchBusButton));
    }

    public void verifyBusSearchResultsSection() {
        seleniumUtils.isElementDisplayed(driver.findElement(busSearchResultsSection));
    }
}
