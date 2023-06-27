package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class LogicExpressionTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up the WebDriver instance
        System.setProperty("webdriver.chrome.driver", "../../lib/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void testSet2() {
        // Navigate to the login page
        driver.get("https://cs.gmu.edu:8443/offutt/coverage/LogicCoverage");

        // Find the login form and enter the expression
        WebElement form = driver.findElement(By.tagName("form"));
        form.findElement(By.name("expression")).sendKeys("");

        /// Click on the truth table button
        form.findElement(By.cssSelector("input[value='Truth Table'][name='action']")).click();

        // Check the results
        boolean EmptyExpression = driver.getPageSource().contains("The expression is empty");
        System.out.println("Truth Table Displayed: " + EmptyExpression);

        // Verify that the truth table was displayed
        assertTrue("Expression was not empty", EmptyExpression);
    }

    @Test
    public void testSet3() {
        // Navigate to the login page
        driver.get("https://cs.gmu.edu:8443/offutt/coverage/LogicCoverage");

        // Find the login form and enter the expression
        WebElement form = driver.findElement(By.tagName("form"));
        form.findElement(By.name("expression")).sendKeys("a ^ b");

        /// Click on the truth table button
        form.findElement(By.cssSelector("input[value='Truth Table'][name='action']")).click();

        // Check the results
        boolean truthTableDisplayed = driver.getPageSource().contains("Truth Table:");
        System.out.println("Truth Table Displayed: " + truthTableDisplayed);

        // Verify that the truth table was displayed
        assertTrue("Truth table not displayed", truthTableDisplayed);
    }

    @Test
    public void testSet4() {
        // Navigate to the login page
        driver.get("https://cs.gmu.edu:8443/offutt/coverage/LogicCoverage");

        // Find the login form and enter the expression
        WebElement form = driver.findElement(By.tagName("form"));
        form.findElement(By.name("expression")).sendKeys("a ^ b");

        /// Click on the truth table button
        form.findElement(By.cssSelector("input[value='GACC'][name='action']")).click();

        // Check the results
        boolean testTableDisplayed = driver.getPageSource().contains("Truth Table:");
        System.out.println("GACC Test Displayed: " + testTableDisplayed);

        // Verify that the truth table was displayed
        assertTrue("GACC not displayed", testTableDisplayed);

        // Check the results
        boolean truthTableDisplayed = driver.getPageSource().contains("Truth Table:");
        System.out.println("Truth Table Displayed: " + truthTableDisplayed);

        // Verify that the truth table was displayed
        assertTrue("Truth table not displayed", truthTableDisplayed);
    }

    @Test
    public void testSet5() {
        // Navigate to the login page
        driver.get("https://cs.gmu.edu:8443/offutt/coverage/LogicCoverage");

        // Find the login form and enter the expression
        WebElement form = driver.findElement(By.tagName("form"));
        form.findElement(By.name("expression")).sendKeys("a ^ b");

        /// Click on the truth table button
        form.findElement(By.cssSelector("input[value='CACC'][name='action']")).click();

        // Check the results
        boolean testTableDisplayed = driver.getPageSource().contains("Truth Table:");
        System.out.println("CACC Test Displayed: " + testTableDisplayed);

        // Verify that the truth table was displayed
        assertTrue("CACC not displayed", testTableDisplayed);

        // Check the results
        boolean truthTableDisplayed = driver.getPageSource().contains("Truth Table:");
        System.out.println("Truth Table Displayed: " + truthTableDisplayed);

        // Verify that the truth table was displayed
        assertTrue("Truth table not displayed", truthTableDisplayed);
    }

    @Test
    public void testSet6() {
        // Navigate to the login page
        driver.get("https://cs.gmu.edu:8443/offutt/coverage/LogicCoverage");

        // Find the login form and enter the expression
        WebElement form = driver.findElement(By.tagName("form"));
        form.findElement(By.name("expression")).sendKeys("a ^ b");

        /// Click on the truth table button
        form.findElement(By.cssSelector("input[value='GACC'][name='action']")).click();

        // Check the results
        boolean testTableDisplayed = driver.getPageSource().contains("Truth Table:");
        System.out.println("RACC Test Displayed: " + testTableDisplayed);

        // Verify that the truth table was displayed
        assertTrue("RACC not displayed", testTableDisplayed);

        // Check the results
        boolean truthTableDisplayed = driver.getPageSource().contains("Truth Table:");
        System.out.println("Truth Table Displayed: " + truthTableDisplayed);

        // Verify that the truth table was displayed
        assertTrue("Truth table not displayed", truthTableDisplayed);
    }

    @Test
    public void testSet7() {
        // Navigate to the login page
        driver.get("https://cs.gmu.edu:8443/offutt/coverage/LogicCoverage");

        // Find the login form and enter the expression
        WebElement form = driver.findElement(By.tagName("form"));
        form.findElement(By.name("expression")).sendKeys("a ^ b");

        /// Click on the truth table button
        form.findElement(By.cssSelector("input[value='GACC'][name='action']")).click();

        // Check the results
        boolean testTableDisplayed = driver.getPageSource().contains("Truth Table:");
        System.out.println("GICC Test Displayed: " + testTableDisplayed);

        // Verify that the truth table was displayed
        assertTrue("GICC not displayed", testTableDisplayed);

        // Check the results
        boolean truthTableDisplayed = driver.getPageSource().contains("Truth Table:");
        System.out.println("Truth Table Displayed: " + truthTableDisplayed);

        // Verify that the truth table was displayed
        assertTrue("Truth table not displayed", truthTableDisplayed);
    }

    @Test
    public void testSet8() {
        // Navigate to the login page
        driver.get("https://cs.gmu.edu:8443/offutt/coverage/LogicCoverage");

        // Find the login form and enter the expression
        WebElement form = driver.findElement(By.tagName("form"));
        form.findElement(By.name("expression")).sendKeys("a ^ b");

        /// Click on the truth table button
        form.findElement(By.cssSelector("input[value='RICC'][name='action']")).click();

        // Check the results
        boolean testTableDisplayed = driver.getPageSource().contains("Truth Table:");
        System.out.println("RIC Test Displayed: " + testTableDisplayed);

        // Verify that the truth table was displayed
        assertTrue("RICC not displayed", testTableDisplayed);

        // Check the results
        boolean truthTableDisplayed = driver.getPageSource().contains("Truth Table:");
        System.out.println("Truth Table Displayed: " + truthTableDisplayed);

        // Verify that the truth table was displayed
        assertTrue("Truth table not displayed", truthTableDisplayed);
    }

    @After
    public void tearDown() {
        // Close the WebDriver instance
        driver.quit();
    }
}
