package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BaseTest {
    WebDriver driver;
    public ExtentReports extent;
    public ExtentTest test;
    public static void flushDirectory(String dirPath) {
        Path directory = Paths.get(dirPath);

        // Check if the directory exists
        if (Files.exists(directory) && Files.isDirectory(directory)) {
            try {
                // Delete all files and subdirectories
                Files.walk(directory)
                        .sorted((path1, path2) -> path2.compareTo(path1)) // Sort in reverse order to delete subdirectories first
                        .forEach(path -> {
                            try {
                                Files.delete(path);
                            } catch (IOException e) {
                                System.err.println("Failed to delete " + path + ": " + e.getMessage());
                            }
                        });
                System.out.println("Directory flushed successfully: " + dirPath);
            } catch (IOException e) {
                System.err.println("Error while flushing directory: " + e.getMessage());
            }
        } else {
            System.out.println("Directory does not exist: " + dirPath);
        }
    }

    @BeforeSuite
       public void setupExtent()
    {
        flushDirectory("allure-results");
        flushDirectory("allure-report");

    }

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        // Create an instance of ChromeDriver
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");// For opening the browser in headless mode
        options.addArguments("--disable-gpu"); // Optional, for specific configurations
        driver = new ChromeDriver(options);

        // Maximize the browser window
        driver.manage().window().maximize();

        // Example: Navigating to a URL
        driver.get("https://automationteststore.com/");
    }

   @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
