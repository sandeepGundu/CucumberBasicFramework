package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.WebDriver_DriverManager;
import utils.SeleniumUtils;

public class LoginPage
{
    /*WebDriver driver;

    // Constructor to initialize WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }*/

    SeleniumUtils seleniumUtils;
    WebDriver driver = WebDriver_DriverManager.getDriver();

    public LoginPage() {
        seleniumUtils = new SeleniumUtils(WebDriver_DriverManager.getDriver());
    }

    // Locators for the login page elements
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginButton");

    // Methods to interact with the elements
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
