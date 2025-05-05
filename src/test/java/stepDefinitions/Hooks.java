package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
//import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import utils.ExtentReportManager;
import java.io.File;

public class Hooks
{
    // Declare WebDriver as a static variable so it can be shared across step definitions
    public static WebDriver driver;
    //private static ExtentReportManager reportManager;

    @Before
    public void setup() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "src/test/lib/chromedriver.exe");

        // Initialize the ChromeDriver
        driver = new ChromeDriver();
        //driver = new org.openqa.selenium.chrome.ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Set an implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("Browser launched successfully.");

    }

    @After
    public void teardown() {

        // Close the browser and quit the WebDriver
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed successfully.");
        }

    }
}
