package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.SeleniumUtils;

public class FlightSelectionPage {
    WebDriver driver = SeleniumUtils.getDriver();

    // Locators
    private By flightOption = By.cssSelector(".flight-option"); // Update with actual selector
    private By nextStepButton = By.id("nextStep"); // Update with actual ID
    private By highlightedFlight = By.cssSelector(".flight-option.highlighted"); // Update with actual selector
    private By flightDetailsContainer = By.id("flightDetails"); // Update with actual ID or selector for flight details

    // Method to select a flight
    public void selectFlight() {
        WebElement flight = driver.findElement(flightOption);
        flight.click();
    }

    // Method to click the next step button
    public void clickNextStep() {
        driver.findElement(nextStepButton).click();
    }

    // Method to verify if the selected flight is highlighted
    public boolean isFlightHighlighted() {
        return driver.findElements(highlightedFlight).size() > 0;
    }

    // Method to verify if the flight details are retained
    public boolean areFlightDetailsRetained() {
        try {
            WebElement flightDetails = driver.findElement(flightDetailsContainer);
            String detailsText = flightDetails.getText();
            return detailsText != null && !detailsText.isEmpty();
        } catch (Exception e) {
            return false; // If the element is not found or text is empty, return false
        }
    }
}