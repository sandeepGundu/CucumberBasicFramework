package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.WebDriver_DriverManager;
import utils.SeleniumUtils;

public class SearchResults_Train
{
    /*WebDriver driver;

    // Constructor to initialize WebDriver
    public SearchResults_Train(WebDriver driver) {
        this.driver = driver;
    }

    SeleniumUtils seleniumUtils = new SeleniumUtils(driver);*/

    SeleniumUtils seleniumUtils;
    WebDriver driver = WebDriver_DriverManager.getDriver();

    public SearchResults_Train() {
        seleniumUtils = new SeleniumUtils(WebDriver_DriverManager.getDriver());
    }

    private By getUpdateSearch_FromField(String fieldName)
    {
        return By.xpath("//p[text()='" + fieldName + "']/following-sibling::div//p[contains(@class, 'FswFldTitle')]");
    }

    private By updateSearch_DateField = By.xpath("//p[text()='DATE']/following-sibling::input");

    private By updateSearchBtn = By.xpath("//button[text()='UPDATE SEARCH']");

    public void verifyFieldsIn_UpdateSearchPage()
    {
        seleniumUtils.isElementDisplayed(driver.findElement(getUpdateSearch_FromField("FROM")));
        seleniumUtils.isElementDisplayed(driver.findElement(getUpdateSearch_FromField("TO")));
        seleniumUtils.isElementDisplayed(driver.findElement(updateSearch_DateField));
        seleniumUtils.isElementDisplayed(driver.findElement(updateSearchBtn));
    }

}
