package com.kodilla.selenium.homework;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStoreTest {
    private WebDriver driver;
    private KodillaStore kodillaStore;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://kodilla.com/pl/test/store");
        driver.manage().window().maximize();
        kodillaStore = new KodillaStore(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @ParameterizedTest
    @CsvSource({
            "NoteBook, 2",
            "School, 1",
            "Brand, 1",
            "Bussines, 1",
            "Gaming, 1",
            "Powerful, 0"
    })
    public void testSearchQuantityAndCaseSensitivity(String phrase, int expectedCount) {
        kodillaStore.searchFor(phrase);
        int actualCount = kodillaStore.getResultsCount();
        assertEquals(expectedCount, actualCount, "Błąd dla frazy: " + phrase);
    }
}

