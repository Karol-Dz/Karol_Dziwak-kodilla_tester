package com.kodilla.selenium.homework;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class KodillaStoreTest {

    WebDriver driver;
    WebDriverWait wait;

    Map<String, Integer> expectedResults = new HashMap<>() {{
        put("NoteBook", 2);
        put("School", 1);
        put("Brand", 1);
        put("Business", 1);
        put("Gaming", 1);
        put("Powerful", 1);
    }};

    @BeforeAll
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
    }

    @AfterAll
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private void search(String query) {
        driver.get("https://kodilla.com/pl/test/store");

        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[placeholder='Search for products…']")));

        searchInput.clear();
        searchInput.sendKeys(query);
        searchInput.submit();
    }

    private int countResults() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".products-container .product")));

        return driver.findElements(By.cssSelector(".products-container .product")).size();
    }

    @Test
    public void testSearchResultsCount() {
        expectedResults.forEach((query, expectedCount) -> {
            search(query);
            int actualCount = countResults();
            assertEquals(expectedCount, actualCount, "Fraza: " + query);
        });
    }

    @Test
    public void testSearchIsCaseInsensitive() {
        expectedResults.forEach((query, expectedCount) -> {
            search(query);
            int countOriginal = countResults();

            search(query.toUpperCase());
            int countUpper = countResults();

            search(query.toLowerCase());
            int countLower = countResults();

            assertEquals(countOriginal, countUpper, "Fraza (UPPER): " + query);
            assertEquals(countOriginal, countLower, "Fraza (lower): " + query);
        });
    }
}
