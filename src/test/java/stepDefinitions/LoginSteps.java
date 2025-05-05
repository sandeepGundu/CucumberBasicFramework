package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import pages.DashboardPage;
import utils.SeleniumUtils;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps
{
    WebDriver driver = Hooks.driver; // Access WebDriver from Hooks
    LoginPage loginPage = new LoginPage(driver); // Create an instance of LoginPage
    SeleniumUtils seleniumUtils = new SeleniumUtils(driver); // Create an instance of SeleniumUtils

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Navigate to the login page
        seleniumUtils.loadApp();
        System.out.println("Navigated to the login page.");
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        // Code to enter username and password

        /*loginPage.enterUsername("testuser");
        loginPage.enterPassword("password123");
        loginPage.clickLoginButton();*/

        /*String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("User is not on the dashboard page!", expectedTitle, actualTitle);*/

        /*// Locate elements
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        // Use SeleniumUtils methods
        seleniumUtils.sendText(usernameField, "testuser");
        seleniumUtils.sendText(passwordField, "password123");
        seleniumUtils.clickElement(loginButton);*/

        System.out.println("Entered valid credentials.");
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        // Code to verify redirection to the dashboard
        /*System.out.println("User redirected to the dashboard.");
        WebElement dashboardHeader = seleniumUtils.waitForElementToBeVisible(By.id("dashboardHeader"), 10);

        // Verify the dashboard is displayed
        Assert.assertNotNull("Dashboard is not displayed!", dashboardHeader);*/

        System.out.println("User successfully redirected to the dashboard.");
    }

    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String userName, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Enter valid user name: " + userName + ", password: " + password);
    }

    @Then("the user should see the dashboard")
    public void the_user_should_see_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The dashboard is loaded");
    }

    @Then("the user takes a screenshot")
    public void the_user_takes_a_screenshot() {
        seleniumUtils.takeScreenshot("src/test/screenshots/dashboard.png");
    }

    DashboardPage dashboardPage = new DashboardPage(driver);

    @Then("the user should see the dashboard header")
    public void the_user_should_see_the_dashboard_header() {
        String headerText = dashboardPage.getDashboardHeaderText();
        Assert.assertEquals("Welcome to the Dashboard", headerText);
        System.out.println("Dashboard header verified successfully.");
    }
}
