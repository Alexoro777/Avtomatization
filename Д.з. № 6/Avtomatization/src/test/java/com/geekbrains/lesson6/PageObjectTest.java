package com.geekbrains.lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        driver.get("https://chikiriki.ru/");
    }

    @Test
    void putProductToFavoriteTest() {
        
        new MainPage(driver).clickQuickLoginButton()
                .login("alexoro2014@yandex.ru", "1234567")
                .clickPushPermissionDialog()
                .categoryBlock.clickGrownupButton()
                .clickCollectionCards()
                .clickFavoriteIcon()
                .clickBurgerMenu()
                .clickFavoriteProducts()
                .checkTextFavoriteProduct("Здесь собраны товары из действующих акций, которые отмечались сердечком");
    }

    @AfterEach
    void killBrowser() {
        driver.quit();
    }
}
