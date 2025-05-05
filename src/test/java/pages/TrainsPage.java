package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumUtils;
public class TrainsPage
{
    WebDriver driver;

    // Constructor to initialize WebDriver
    public TrainsPage(WebDriver driver) {
        this.driver = driver;
    }

    SeleniumUtils seleniumUtils = new SeleniumUtils(driver);

    private By getTrainsTypeOption(String travelType)
    {
        return By.xpath("//h2[text()='" + travelType + "']/parent::li");
    }

    private By getGivenDropdownField(String fieldName)
    {
        return By.xpath("//p[text()='" + fieldName + "']/parent::div");
    }

    private By getTatkalField(String fieldName)
    {
        return By.xpath("//span[text()='" + fieldName + "']/ancestor::button");
    }

    private By getFromToLocationField(String fromOrToLocationType)
    {
        return By.xpath("//span[text()='" + fromOrToLocationType + "']/following-sibling::input");
    }

    private By getFromLocationValueField(String fromLocationValue1, String fromLocationValue2)
    {
        //ul[contains(@class,'FswAutoCompBody')]//p[contains(@class, 'FswAutoCompItemDescTitle') and contains(text(), 'SC')]//span[contains(text(), 'Secunderabad Junction')]
        return By.xpath("//ul[contains(@class,'FswAutoCompBody')]//p[contains(@class, 'FswAutoCompItemDescTitle') and contains(text(), '" + fromLocationValue1 + "')]//span[contains(text(), '" + fromLocationValue2 + "')]");
    }

    public By getDepartureDropdown(String departureField)
    {
        return By.xpath("//span[text()='" + departureField + "']/following-sibling::p[contains(@class, 'FswFldTitle')]");
    }

    public By trainsPageHeader = By.xpath("//div[contains(@class,'home_homePge__bodyHeading')]//h1");

    private By searchTrainsBtn = By.xpath("//span[text()='SEARCH TRAINS']");

    private By trainsSearchResultTxt = By.xpath("//div[@class='listingRhs']//span");

    public void chooseTripType(String tripType)
    {
        seleniumUtils.clickElement(driver.findElement(getTrainsTypeOption(tripType)));
    }

    public boolean verifyTrainsPageHeader()
    {
        return seleniumUtils.isElementDisplayed(driver.findElement(trainsPageHeader));
    }

    public String getPageHeaderText()
    {
        return seleniumUtils.getElementText(driver.findElement(trainsPageHeader));
    }

    public boolean verifyFields(String webElementName)
    {
        return seleniumUtils.isElementDisplayed(driver.findElement(getGivenDropdownField(webElementName)));
    }

    public boolean verifyTatkalOptions(String webElementName)
    {
        return seleniumUtils.isElementDisplayed(driver.findElement(getTatkalField(webElementName)));
    }

    private By getDepartureDateXpath(String monthYear, String date)
    {
        //p[contains(text(), 'May 2025')]/ancestor::div[contains(@class, 'calMnth__mnthNmWrp')]//following-sibling::div[contains(@class, 'calMnth__calDateWrap')]//p[text()='10' and not(contains(@class, 'prevDate'))]
        return By.xpath("//p[contains(text(), '" + monthYear + "')]/ancestor::div[contains(@class, 'calMnth__mnthNmWrp')]//following-sibling::div[contains(@class, 'calMnth__calDateWrap')]//p[text()='" + date + "' and not(contains(@class, 'prevDate'))]");
    }

    public void selectFromRToValues(String fromOrToField, String fromOrToValue1, String fromOrToValue2)
    {
        seleniumUtils.clickElement(driver.findElement(getGivenDropdownField(fromOrToField)));
        seleniumUtils.sendText(driver.findElement(getFromToLocationField(fromOrToField)), fromOrToValue1);
        seleniumUtils.clickElement(driver.findElement(getFromLocationValueField(fromOrToValue1, fromOrToValue2)));
    }

    public void selectDepartureDate(String departureField, String monthYear, String date)
    {
        seleniumUtils.clickElement(driver.findElement(getGivenDropdownField(departureField)));
        seleniumUtils.clickElement(driver.findElement(getDepartureDateXpath(monthYear, date)));
    }

    public void clickSearchTrains()
    {
        seleniumUtils.clickElement(driver.findElement(searchTrainsBtn));
    }

}
