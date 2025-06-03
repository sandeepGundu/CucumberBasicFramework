package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.WebDriver_DriverManager;
import utils.SeleniumUtils;

public class BusPage {
    /*WebDriver driver;
    SeleniumUtils seleniumUtils;

    // Constructor to initialize WebDriver
    public BusPage(WebDriver driver) {
        this.driver = driver;
        this.seleniumUtils = new SeleniumUtils(driver);
    }*/

    SeleniumUtils seleniumUtils;
    WebDriver driver = WebDriver_DriverManager.getDriver();

    public BusPage() {
        seleniumUtils = new SeleniumUtils(WebDriver_DriverManager.getDriver());
    }


    // Locators for the bus page elements
    private By busPageHeader = By.xpath("//section[contains(@class, 'HomePagestyles')]//h1");
    private By busSearchResults_UpdateResults = By.xpath("//span[text()='UPDATE SEARCH']/ancestor::button");
    private By searchButton = By.xpath("//button[text()='Search Bus']/parent::div[contains(@class, 'ButtonWrap')]");

    private By getGivenInputField(String fieldName)
    {
        return By.xpath("//div[contains(@class, 'InputText')]//label[text()='" + fieldName + "']//following-sibling::input");
    }

    private By getFromRToFieldOption(String fromValue1, String fromValue2)
    {
        return By.xpath("//div[contains(@id, 'downshift')]//div[@role='option']//span[contains(text(), '" + fromValue1 + ", " + fromValue2 + "')]");
    }

    public By getTravelDateInputField(String travelDate)
    {
        return By.xpath("//div[contains(@class, 'DateWrapper')]//input");
    }

    public By getDateFields(String labelName)
    {
        return By.xpath("//div[contains(@class, 'DateWrapper')]//span[contains(text(), '" + labelName + "')]");
    }

    private By getTravelDateXpath(String monthYear, String date)
    {
        //p[contains(text(), 'May 2025')]/ancestor::div[contains(@class, 'calMnth__mnthNmWrp')]//following-sibling::div[contains(@class, 'calMnth__calDateWrap')]//p[text()='10' and not(contains(@class, 'prevDate'))]
        return By.xpath("//p[contains(text(), '" + monthYear + "')]/ancestor::div[contains(@class, 'OuterMonthWrapDiv')]//following-sibling::div[contains(@class, 'CalendarMainWrapperDiv')]//li//span[text()='" + date + "']");
    }

    public boolean verifyBusPageHeader()
    {
        return seleniumUtils.isElementDisplayed(driver.findElement(busPageHeader));
    }

    public String getPageHeaderText()
    {
        return seleniumUtils.getElementText(driver.findElement(busPageHeader));
    }

    public void verifyFields(String fieldName)
    {
        seleniumUtils.isElementDisplayed(driver.findElement(getGivenInputField(fieldName)));
    }

    public void verifyTravelDateField(String fieldName)
    {
        seleniumUtils.isElementDisplayed(driver.findElement(getTravelDateInputField(fieldName)));
    }

    public void verifyTravelDateLabels(String labelName)
    {
        seleniumUtils.isElementDisplayed(driver.findElement(getDateFields(labelName)));
    }

    /*public void selectFromRToValues(String fromOrToField, String fromOrToValue1, String fromOrToValue2)
    {
        seleniumUtils.clickElement(driver.findElement(getGivenInputField(fromOrToField)));
        seleniumUtils.sendText(driver.findElement(getGivenInputField(fromOrToField)), fromOrToValue1);
        seleniumUtils.clickElement(driver.findElement(getFromRToFieldOption(fromOrToValue1, fromOrToValue2)));
    }*/

    public void selectFromValue(String fromOrToValue1, String fromOrToValue2)
    {
        seleniumUtils.clickElement(driver.findElement(getGivenInputField("FROM")));
        seleniumUtils.sendText(driver.findElement(getGivenInputField("FROM")), fromOrToValue1);
        seleniumUtils.clickElement(driver.findElement(getFromRToFieldOption(fromOrToValue1, fromOrToValue2)));
    }

    public void selectToValue(String fromOrToValue1, String fromOrToValue2)
    {
        seleniumUtils.clickElement(driver.findElement(getGivenInputField("TO")));
        seleniumUtils.sendText(driver.findElement(getGivenInputField("TO")), fromOrToValue1);
        seleniumUtils.clickElement(driver.findElement(getFromRToFieldOption(fromOrToValue1, fromOrToValue2)));
    }

    public void selectTravelDate(String monthYear, String date)
    {
        seleniumUtils.clickElement(driver.findElement(getTravelDateInputField("Travel Date")));
        seleniumUtils.clickElement(driver.findElement(getTravelDateXpath(monthYear, date)));
    }

    public void clickSearchBusButton() {
        seleniumUtils.clickElement(driver.findElement(searchButton));
    }

    public void verifyBusSearchResultsDisplayed() throws InterruptedException {
        seleniumUtils.isElementDisplayed(driver.findElement(busSearchResults_UpdateResults));
        Thread.sleep(10000);
    }
}
