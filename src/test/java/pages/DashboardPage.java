package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.WebDriver_DriverManager;
import utils.SeleniumUtils;

public class DashboardPage
{
    /*WebDriver driver;

    // Constructor to initialize WebDriver
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }*/

    SeleniumUtils seleniumUtils;
    WebDriver driver = WebDriver_DriverManager.getDriver();

    public DashboardPage() {
        seleniumUtils = new SeleniumUtils(WebDriver_DriverManager.getDriver());
    }

    // Locators for the dashboard page elements
    private By dashboardHeader = By.id("dashboardHeader");

    // Methods to interact with the elements
    public String getDashboardHeaderText() {
        return driver.findElement(dashboardHeader).getText();
    }

}
