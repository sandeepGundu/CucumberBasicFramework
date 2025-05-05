package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage
{
    WebDriver driver;

    // Constructor to initialize WebDriver
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators for the dashboard page elements
    private By dashboardHeader = By.id("dashboardHeader");

    // Methods to interact with the elements
    public String getDashboardHeaderText() {
        return driver.findElement(dashboardHeader).getText();
    }

}
