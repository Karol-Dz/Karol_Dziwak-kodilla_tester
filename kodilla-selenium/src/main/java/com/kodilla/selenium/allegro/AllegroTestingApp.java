package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.allegro.pl/");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement categoryDropdown = driver.findElement(By.xpath("//select[contains(@data-role,'categories')]"));
        Select categorySelect = new Select(categoryDropdown);
        categorySelect.selectByVisibleText("Elektronika");

        WebElement searchField = driver.findElement(By.xpath("//input[@data-role='search-input']"));
        searchField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//button[@data-role='search-button']"));
        searchButton.click();
    }
}


