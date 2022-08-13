package com.geekbrains.lesson4.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChikiRikiTest {
    WebDriver driver;
    WebDriverWait webDriverWait;

    private final static String CHIKIRIKI_BASE_URL = "https://chikiriki.ru/";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupBrowser(){
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(7));
        driver.get(CHIKIRIKI_BASE_URL);
    }
    @Test
    void authTest() {
        driver.findElement(By.xpath("//button[.='Быстрый вход']")).click();
        driver.findElement(By.id("auth-email")).sendKeys("alexoro2014@yandex.ru");
        driver.findElement(By.id("auth-login-button")).click();
        driver.findElement(By.id("auth-password")).sendKeys("1234567");
        driver.findElement(By.id("auth-password-button")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pushPermissionDialog")));
        driver.findElement(By.id("pushPermissionDialogCancel")).click();
        driver.findElement(By.xpath("//div[@class='tag'][4]//button[@data-action='feed-filter-item']")).click();
        //List<WebElement> cardsList = driver.findElements(By.xpath("//div[@class='cmp-image-mask']"));
        //cardsList.get(0).click();
        driver.findElement(By.id("cw-charuttimoda")).click();
        driver.findElement(By.xpath("//a[@class='snippet'][1]//div[@class='prd-like']")).click();
        driver.findElement(By.xpath("//*[@id='menuItemClub']/button/i")).click();
        driver.findElement(By.xpath("//a[@class='drop-menu-item  '][6]")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='prd-photo-img  ']")));
        Assertions.assertEquals(driver.findElement(By.xpath("//img[@class='prd-photo-img  ']")).isDisplayed(), true);
    }

    @AfterEach
    void quitBrowser() {
        driver.quit();
    }
}
