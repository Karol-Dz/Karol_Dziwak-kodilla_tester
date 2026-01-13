package com.kodilla.selenium.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class KodillaStore {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(css = "input.form-control")
    private WebElement searchInput;

    @FindBy(css = "#elements-wrapper .element")
    private List<WebElement> allProducts;

    public KodillaStore(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void searchFor(String phrase) {
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        searchInput.clear();
        searchInput.sendKeys(phrase);
    }

    public int getResultsCount() {
        return (int) allProducts.stream()
                .filter(WebElement::isDisplayed)
                .count();
    }
}
