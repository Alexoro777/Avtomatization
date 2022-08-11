package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ChikiRikiFavorite {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://chikiriki.ru/");
     // driver.findElement(By.xpath("//button[.='Не сейчас']")).click();
        driver.findElement(By.xpath("//button[.='Быстрый вход']")).click();
        driver.findElement(By.id("auth-email")).sendKeys("alexoro2014@yandex.ru");
        driver.findElement(By.id("auth-login-button")).click();
        driver.findElement(By.id("auth-password")).sendKeys("1234567");
        driver.findElement(By.id("auth-password-button")).click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(7));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pushPermissionDialog")));
       // Thread.sleep(3000);
        driver.findElement(By.id("pushPermissionDialogCancel")).click();
        driver.findElement(By.xpath("//div[@class='tag'][4]//button[@data-action='feed-filter-item']")).click();
        //List<WebElement> cardsList = driver.findElements(By.xpath("//div[@class='cmp-image-mask']"));
        //cardsList.get(0).click();
        driver.findElement(By.id("cw-charuttimoda")).click();
        driver.findElement(By.xpath("//a[@class='snippet'][1]//div[@class='prd-like']")).click();
        driver.findElement(By.xpath("//*[@id='menuItemClub']/button/i")).click();
        driver.findElement(By.xpath("//a[@class='drop-menu-item  '][6]")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
