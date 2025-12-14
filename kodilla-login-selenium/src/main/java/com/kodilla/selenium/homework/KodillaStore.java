package com.kodilla.selenium.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class KodillaStore {
    WebDriver driver;
        By searchInput = By.cssSelector("input[type='search']");
        By productItems = By.cssSelector(".products-grid li");

    public KodillaStore(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://kodilla.com/pl/test/store");
    }

    public void search(String query) {
        WebElement input = driver.findElement(searchInput);
        input.clear();
        input.sendKeys(query);
        input.submit();
    }

    public int getNumberOfResults() {
        List<WebElement> items = driver.findElements(productItems);
        return items.size();
    }
}