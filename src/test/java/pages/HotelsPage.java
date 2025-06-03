package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.WebDriver_DriverManager;
import utils.SeleniumUtils;

public class HotelsPage
{
    SeleniumUtils seleniumUtils;
    WebDriver driver = WebDriver_DriverManager.getDriver();

    public HotelsPage() {
        seleniumUtils = new SeleniumUtils(WebDriver_DriverManager.getDriver());
    }

    // Locators

    private By hotelPageHeader = By.xpath("//h2[contains(@class, 'Header')]"); // Example locator for header

    private By getDropdown(String dropdownName) {
        return By.xpath("//span[contains(text(),'" + dropdownName + "')]/parent::div");
    }

    private By getButton(String buttonName) {
        return By.xpath("//button[contains(text(),'" + buttonName + "')]");
    }

    private By getField(String fieldName) {
        return By.xpath("//span[contains(text(), '" + fieldName + "')]//following-sibling::input");
    }

    private By getDate(String monthYear, String date) {
        return By.xpath("//div[contains(@aria-label,'" + monthYear + "') and contains(@aria-label,'" + date + "')]");
    }

    private By searchResultsSection = By.id("searchResults");

    // Methods
    public boolean verifyHotelsPageHeader()
    {
        return seleniumUtils.isElementDisplayed(driver.findElement(hotelPageHeader));
    }
    public String getPageHeader() {
        WebElement headerElement = seleniumUtils.waitForElementToBeVisible(hotelPageHeader, 10);
        return headerElement.getText();
    }

    public void verifyDropdownsDisplayed(String... dropdownNames) {
        for (String dropdownName : dropdownNames) {
            WebElement dropdown = seleniumUtils.waitForElementToBeVisible(getDropdown(dropdownName), 10);
            if (dropdown == null || !dropdown.isDisplayed()) {
                throw new AssertionError("Dropdown not displayed: " + dropdownName);
            }
        }
    }

    public void selectFieldValue(String fieldName, String value) {
        WebElement field = seleniumUtils.waitForElementToBeVisible(getField(fieldName), 10);
        seleniumUtils.clickElement(driver.findElement(getDropdown(fieldName)));
        seleniumUtils.sendText(field, value);
    }

    public void selectDate(String fieldName, String monthYear, String date) {
        WebElement field = seleniumUtils.waitForElementToBeVisible(getField(fieldName), 10);
        seleniumUtils.clickElement(field);
        WebElement dateElement = seleniumUtils.waitForElementToBeVisible(getDate(monthYear, date), 10);
        seleniumUtils.clickElement(dateElement);
        //seleniumUtils.clickElement(driver.findElement(getGivenDropdownField(departureField)));
        //seleniumUtils.clickElement(driver.findElement(getDepartureDateXpath(monthYear, date)));
        ////span[contains(text(), 'June 2025')]/ancestor::div[contains(@class,'Month')]//following-sibling::div[contains(@class, 'calendar')]//li[contains(@class, 'date_is_selectable_true')]//span[text()='20']
    }

    public void clickDropdown(String dropdownName) {
        WebElement dropdown = seleniumUtils.waitForElementToBeVisible(getDropdown(dropdownName), 10);
        seleniumUtils.clickElement(dropdown);
    }

    public void selectDropdownValue(String fieldName, int value) {
        WebElement dropdown = seleniumUtils.waitForElementToBeVisible(getDropdown(fieldName), 10);
        seleniumUtils.selectDropdownByIndex(dropdown, value);
    }

    public void clickButton(String buttonName) {
        WebElement button = seleniumUtils.waitForElementToBeClickable(getButton(buttonName), 10);
        seleniumUtils.clickElement(button);
    }

    public void verifySearchResultsDisplayed() {
        WebElement resultsSection = seleniumUtils.waitForElementToBeVisible(searchResultsSection, 10);
        if (resultsSection == null || !resultsSection.isDisplayed()) {
            throw new AssertionError("Search results section is not displayed.");
        }
    }
}
