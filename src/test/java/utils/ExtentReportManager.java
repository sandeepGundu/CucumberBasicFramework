package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportManager {

    private static ExtentReports extent;
    private static ExtentHtmlReporter htmlReporter;
    private static ExtentTest test;

    // Initialize Extent Reports
    public static ExtentReports initializeReport(String reportPath) {
        htmlReporter = new ExtentHtmlReporter(reportPath);
        htmlReporter.config().setDocumentTitle("Automation Test Report");
        htmlReporter.config().setReportName("Test Execution Report");
        htmlReporter.config().setTheme(com.aventstack.extentreports.reporter.configuration.Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        return extent;
    }

    // Get ExtentTest instance
    public static ExtentTest createTest(String testName) {
        test = extent.createTest(testName);
        return test;
    }

    // Flush the report
    public static void flushReport() {
        extent.flush();
    }
}