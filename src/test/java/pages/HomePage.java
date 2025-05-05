package pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
    WebDriver driver;

    // Constructor to initialize WebDriver
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators for the home page elements
    private By getHeaderMenuItem(String menuItemName)
    {
        return By.xpath("//header[contains(@class, 'header-sticky')]//span[contains(@class, 'header-sprite nav-icon')]//following-sibling::span[contains(text(), '" + menuItemName + "')]/ancestor::a");
    }

    public void clickMainMenuItem(String menuItemName)
    {
        driver.findElement(getHeaderMenuItem(menuItemName)).click();
    }
}
