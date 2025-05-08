package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CabsPage {
    WebDriver driver;

    // Constructor to initialize WebDriver
    public CabsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators for the cabs page elements
    private By outstationOneWayRadioButton = By.id("outstationOneWay");
    private By fromDropdown = By.id("fromCity");
    private By toDropdown = By.id("toCity");
    private By pickupDateDropdown = By.id("pickupDate");
    private By pickupTimeDropdown = By.id("pickupTime");
    private By searchCabsButton = By.id("searchCabs");

    // Methods to interact with the cabs page elements
    public void selectOutstationOneWay() {
        driver.findElement(outstationOneWayRadioButton).click();
    }

    public void selectFromCity(String fromCity) {
        driver.findElement(fromDropdown).sendKeys(fromCity);
    }

    public void selectToCity(String toCity) {
        driver.findElement(toDropdown).sendKeys(toCity);
    }

    public void selectPickupDate(String monthYear, String day) {
        driver.findElement(pickupDateDropdown).click();
        // Add logic to select the month and day from the date picker
    }

    public void selectPickupTime(String pickupTime) {
        driver.findElement(pickupTimeDropdown).sendKeys(pickupTime);
    }

    public void clickSearchCabsButton() {
        driver.findElement(searchCabsButton).click();
    }
}
