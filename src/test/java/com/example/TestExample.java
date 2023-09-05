package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; // Import ChromeOptions
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExample {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        // Set Chrome options for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        // Set the path to the ChromeDriver executable (update to your local path)
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Create a new instance of the ChromeDriver with Chrome options
        driver = new ChromeDriver(options);
    }

    @Test
    public void testExample() {
        // Open the website
        driver.get("https://example.com");

        // Verify the page title
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Example Domain");

        // Perform other actions as needed
        // ...

        // Example: Click a link
        // driver.findElement(By.linkText("Link Text")).click();
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

