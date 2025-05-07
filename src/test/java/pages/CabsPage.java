package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumUtils;

public class CabsPage {
    WebDriver driver;
    SeleniumUtils seleniumUtils;

    // Constructor to initialize WebDriver
    public CabsPage(WebDriver driver) {
        this.driver = driver;
        this.seleniumUtils = new SeleniumUtils(driver);
    }

    // Locators for the cabs page elements
    private By cabsPageHeader = By.xpath("//section[contains(@class, 'HomePagestyles')]//h1");
    private By outstationOneWayRadioButton = By.id("outstationOneWay");
    private By fromField = By.id("fromCity");
    private By toField = By.id("toCity");
    private By pickupDateField = By.id("pickupDate");
    private By pickupTimeField = By.id("pickupTime");
    private By searchButton = By.xpath("//button[text()='Search Cabs']/parent::div[contains(@class, 'ButtonWrap')]");
    private By searchResultsSection = By.id("searchResults");

    public boolean verifyCabsPageHeader() {
        return seleniumUtils.isElementDisplayed(driver.findElement(cabsPageHeader));
    }

    public String getPageHeaderText() {
        return seleniumUtils.getElementText(driver.findElement(cabsPageHeader));
    }

    public void selectOutstationOneWay() {
        seleniumUtils.clickElement(driver.findElement(outstationOneWayRadioButton));
    }

    public void verifyFields(String fieldName) {
        seleniumUtils.isElementDisplayed(driver.findElement(By.id(fieldName)));
    }

    public void selectFromValue(String fromValue) {
        seleniumUtils.sendText(driver.findElement(fromField), fromValue);
    }

    public void selectToValue(String toValue) {
        seleniumUtils.sendText(driver.findElement(toField), toValue);
    }

    public void selectPickupDate(String monthYear, String date) {
        seleniumUtils.clickElement(driver.findElement(pickupDateField));
        seleniumUtils.clickElement(driver.findElement(By.xpath("//p[contains(text(), '" + monthYear + "')]/ancestor::div[contains(@class, 'OuterMonthWrapDiv')]//following-sibling::div[contains(@class, 'CalendarMainWrapperDiv')]//li//span[text()='" + date + "']")));
    }

    public void selectPickupTime(String time) {
        seleniumUtils.sendText(driver.findElement(pickupTimeField), time);
    }

    public void clickSearchCabsButton() {
        seleniumUtils.clickElement(driver.findElement(searchButton));
    }

    public void verifySearchResultsDisplayed() {
        seleniumUtils.isElementDisplayed(driver.findElement(searchResultsSection));
    }
}
