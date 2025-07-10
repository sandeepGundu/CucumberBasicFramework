package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.WebDriver_DriverManager;
import utils.SeleniumUtils;

public class FlightsPage
{
    /*WebDriver driver;

    // Constructor to initialize WebDriver
    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    SeleniumUtils seleniumUtils = new SeleniumUtils(driver); */// Create an instance of SeleniumUtils

    /*WebDriver driver = Hooks.driver; // Access WebDriver from Hooks
    SeleniumUtils seleniumUtils = new SeleniumUtils(driver); // Create an instance of SeleniumUtils
*/

    SeleniumUtils seleniumUtils;
    WebDriver driver = WebDriver_DriverManager.getDriver();

    public FlightsPage() {
        seleniumUtils = new SeleniumUtils(WebDriver_DriverManager.getDriver());
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    // Locators for the Flights page elements
    public By flightsPageHeader = By.xpath("//div[@data-id='flt-srch-wdgt']//h2");

    private By getTravelTypeOption(String travelType)
    {
        return By.xpath("//p[text()='" + travelType + "']/parent::li");
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    private By getGivenDropdownField(String fieldName)
    {
        return By.xpath("//span[text()='" + fieldName + "']/parent::div");
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    private By getFromToLocationField(String fromOrToLocationType)
    {
        return By.xpath("//span[text()='" + fromOrToLocationType + "']/following-sibling::input");
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    private By getFromLocationValueField(String fromLocationValue)
    {
        //return By.xpath("//ul[@id='autoSuggest-list']//li//span[contains(@class,'autoCompleteSubTitle')][contains(text(), 'HYD')]");
        return By.xpath("//ul[@id='autoSuggest-list']//span[@class='autoCompleteSubTitle' and normalize-space()='(" + fromLocationValue + ")']");
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public By getDepartureDropdown(String departureField)
    {
        return By.xpath("//span[text()='" + departureField + "']/following-sibling::p");
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    private By departureDropdown = By.xpath("//span[text()='Departure']/following-sibling::p");

    private By getDepartureDateXpath(String monthYear, String date)
    {
        return By.xpath("//div[contains(text(), '" + monthYear + "')]/ancestor::div[@class='DayPicker-Month']//div[@class='DayPicker-Week']//div[contains(@class, 'DayPicker-Day') and @aria-disabled= 'false']//p[text()='" + date + "']");
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    private By travellersNClassDropdown = By.xpath("//span[contains(text(), 'Travellers & Class')]//following-sibling::p");

    private By getTravellersNClassDropdown(String travellerNClassLabel)
    {
        return By.xpath("//span[contains(text(), '" + travellerNClassLabel + "')]//following-sibling::p");
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}
    private By getTravellersIncrement(String travellerType)
    {
        return By.xpath("//p[text()='" + travellerType + "']//following-sibling::div//span[3]");
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    private By getTravellersDecrement(String travellerType)
    {
        return By.xpath("//p[text()='" + travellerType + "']//following-sibling::div//span[3]");
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    private By getTravellersCountXpath(String travellerType)
    {
        return By.xpath("//p[text()='" + travellerType + "']//following-sibling::div//span[2]");
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    private By getTravellersClassXpath(String travellerClass)
    {
        return By.xpath("//p[text()='Travel Class']//following-sibling::ul//li[text()='" + travellerClass + "']");
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    private By travellersNClass_doneBtn = By.xpath("//a[text()='Done']");

    private By travellersNClass_CancelBrn = By.xpath("//a[text()='Cancel']");

    private By searchFlightsBtn = By.xpath("//span[text()='SEARCH FLIGHTS']");

    private By flightsSearchResultTxt = By.xpath("//div[@class='listingRhs']//span");

    public boolean verifyFlightsPageHeader()
    {
        return seleniumUtils.isElementDisplayed(driver.findElement(flightsPageHeader));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public String getPageHeaderText()
    {
        return seleniumUtils.getElementText(driver.findElement(flightsPageHeader));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public void chooseTripType(String tripType)
    {
        seleniumUtils.clickElement(driver.findElement(getTravelTypeOption(tripType)));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public boolean verifyFields(String webElementName)
    {
        return seleniumUtils.isElementDisplayed(driver.findElement(getGivenDropdownField(webElementName)));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public boolean verifyDepartureFieldDisplayed(String webElementName)
    {
        return seleniumUtils.isElementDisplayed(driver.findElement(departureDropdown));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public boolean verifyTravellersClassFieldDisplayed(String webElementName)
    {
        return seleniumUtils.isElementDisplayed(driver.findElement(travellersNClassDropdown));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public void selectFromRToValues(String fromOrToField, String fromOrToValue)
    {
        seleniumUtils.waitForElementToBeVisible(getGivenDropdownField(fromOrToField), 5);
        if(fromOrToField.equalsIgnoreCase("From") || fromOrToField.equalsIgnoreCase("Where to"))
        {
            seleniumUtils.clickElement(driver.findElement(getGivenDropdownField(fromOrToField)));
        // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

        seleniumUtils.sendText(driver.findElement(getFromToLocationField(fromOrToField)), fromOrToValue);
        seleniumUtils.clickElement(driver.findElement(getFromLocationValueField(fromOrToValue)));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public void selectFromValue(String value)
    {
        seleniumUtils.waitForElementToBeVisible(getGivenDropdownField("From"), 5);
        seleniumUtils.clickElement(driver.findElement(getGivenDropdownField("From")));
        seleniumUtils.sendText(driver.findElement(getFromToLocationField("From")), value);
        seleniumUtils.clickElement(driver.findElement(getFromLocationValueField(value)));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public void selectToValue(String value)
    {
        seleniumUtils.waitForElementToBeVisible(getFromToLocationField("To"), 5);
        seleniumUtils.clickElement(driver.findElement(getFromToLocationField("To")));
        seleniumUtils.sendText(driver.findElement(getFromToLocationField("To")), value);
        seleniumUtils.clickElement(driver.findElement(getFromLocationValueField(value)));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public void selectDepartureDate(String monthYear, String date)
    {
        seleniumUtils.clickElement(driver.findElement(getGivenDropdownField("Departure")));
        seleniumUtils.clickElement(driver.findElement(getDepartureDateXpath(monthYear, date)));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public void selectReturnDate(String monthYear, String date)
    {
        seleniumUtils.clickElement(driver.findElement(getGivenDropdownField("Return")));
        seleniumUtils.clickElement(driver.findElement(getDepartureDateXpath(monthYear, date)));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public void clickTravellersNClass(String travellersNClassField)
    {
        seleniumUtils.clickElement(driver.findElement(getGivenDropdownField(travellersNClassField)));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public void selectTravellerCount(String travellerType, String noOfTravellers)
    {
        String selectedCount = seleniumUtils.getElementText(driver.findElement(getTravellersCountXpath(travellerType)));
        if(!selectedCount.equals(noOfTravellers))
        {
            while (Integer.parseInt(selectedCount) != Integer.parseInt(noOfTravellers)){
                seleniumUtils.clickElement(driver.findElement(getTravellersIncrement(travellerType)));
                selectedCount = seleniumUtils.getElementText(driver.findElement(getTravellersCountXpath(travellerType)));
                if(Integer.parseInt(selectedCount) == Integer.parseInt(noOfTravellers))
                    break;
            // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}
        // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public void selectTravelClassType(String classType)
    {
        seleniumUtils.clickElement(driver.findElement(getTravellersClassXpath(classType)));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public void clickDoneButton_TravelNClass()
    {
        seleniumUtils.clickElement(driver.findElement(travellersNClass_doneBtn));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public void clickSearchFlights()
    {
        seleniumUtils.clickElement(driver.findElement(searchFlightsBtn));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}

    public String getSearchResultsHeaderText()
    {
        return seleniumUtils.getElementText(driver.findElement(flightsSearchResultTxt));
    // Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}
// Locators
    By comparisonView = By.id("comparison-view");
    By flightRows = By.cssSelector(".flight-row");
    By sortDropdown = By.id("sort-dropdown");
    By highlightedFlight = By.cssSelector(".flight-row.highlighted");

    public void selectMultipleFlightsForComparison() {
        List<WebElement> flights = driver.findElements(By.cssSelector(".flight-select-checkbox"));
        for (int i = 0; i < 2; i++) {
            flights.get(i).click();
        }
    }

    public void navigateToComparisonView() {
        driver.findElement(By.id("compare-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(comparisonView));
    }

    public boolean verifyComparisonAttributes(DataTable dataTable) {
        List<String> expectedAttributes = dataTable.asList();
        List<WebElement> attributeHeaders = driver.findElements(By.cssSelector(".comparison-header"));
        List<String> actualAttributes = attributeHeaders.stream().map(WebElement::getText).collect(Collectors.toList());
        return actualAttributes.containsAll(expectedAttributes);
    }

    public void sortFlightsByAttribute(String attribute) {
        WebElement dropdown = driver.findElement(sortDropdown);
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[text()='" + attribute + "']"));
        option.click();
    }

    public boolean isComparisonViewSortedBy(String attribute) {
        // Implement logic to verify sorting based on the attribute
        return true; // Placeholder for actual implementation
    }

    public void selectFlightInComparisonView() {
        driver.findElement(By.cssSelector(".flight-row .select-button")).click();
    }

    public void proceedToBookingStep() {
        driver.findElement(By.id("proceed-to-booking")).click();
    }

    public boolean isSelectedFlightHighlightedAndRetained() {
        return driver.findElement(highlightedFlight).isDisplayed();
    }

    public boolean isComparisonViewUpdatedWithoutReload() {
        // Implement logic to verify dynamic update without reload
        return true; // Placeholder for actual implementation
    }

    public boolean areFlightsDisplayedInAscendingOrderOfPrice() {
        // Implement logic to verify flights are displayed in ascending order of price
        return true; // Placeholder for actual implementation
    }
}
