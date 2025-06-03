package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.WebDriver_DriverManager;
import utils.SeleniumUtils;

public class SearchDetailsPage
{
    SeleniumUtils seleniumUtils;
    WebDriver driver = WebDriver_DriverManager.getDriver();

    public SearchDetailsPage() {
        seleniumUtils = new SeleniumUtils(WebDriver_DriverManager.getDriver());
    }

    public By pageHeader = By.xpath("//div[@data-id='flt-srch-wdgt']//h2");

    public boolean verifyPageHeader()
    {
        return seleniumUtils.isElementDisplayed(driver.findElement(pageHeader));
    }
}
