package com.kodilla.selenium.allegroCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingCSSApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://kodilla.com/pl/test/store");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='text']")));
        searchField.sendKeys("Laptop");

        WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
        searchButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section.products article")));

        List<WebElement> productCards = driver.findElements(By.cssSelector("section.products article"));

        for (WebElement product : productCards) {
            System.out.println("----- Produkt -----");
            System.out.println(product.getText());
        }
    }
}