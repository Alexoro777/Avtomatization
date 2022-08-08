package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChikiRikiAuth {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://chikiriki.ru/");
        driver.findElement(By.xpath("//button[.='Быстрый вход']")).click();
        driver.findElement(By.id("auth-email")).sendKeys("alexoro2014@yandex.ru");
        driver.findElement(By.id("auth-login-button")).click();
        driver.findElement(By.id("auth-password")).sendKeys("1234567");
        driver.findElement(By.id("auth-password-button")).click();

        Thread.sleep(5000);

        driver.quit();

    }
}
