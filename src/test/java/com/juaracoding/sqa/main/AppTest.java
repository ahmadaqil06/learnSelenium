package com.juaracoding.sqa.main;

//import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void openBrowser() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        driver.manage().timeouts();
        driver.manage().window().maximize();
        driver.get("https://shopee.co.id/");
        // driver.click("product-variation product-variation--selected");

        // WebElement btnClose = driver.findElement(By.id("shopee-popup__close-btn"));
        // btnClose.click();

        // Untuk Scrolling
        // WebElement element = driver.findElement(By.id("shopee-button-no-outline"));
        // Actions actions = new Actions(driver);
        // actions.moveToElement(element);
        // actions.perform();

        // cara buat gulir atau scroll
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");

        // WebElement titleField = driver.findElement(By.xpath("//a[@class='css-4tikzq']"));
        // titleField.click();

        // Untuk Scrolling
        // WebElement element = driver.findElement(By.id("shopee-button-no-outline"));
        // Actions actions = new Actions(driver);
        // actions.moveToElement(element);
        // actions.perform();

        WebElement btnWarna = driver.findElement(By.xpath(""));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", btnWarna);

        // WebElement btnUkuran = driver.findElement(By.xpath("//a[text() = '41']"));
        // btnUkuran.click();

        // WebElement btnBeli = driver.findElement(By.xpath("//a[text() = 'Beli
        // Sekarang']"));
        // btnBeli.click();
    }
}
