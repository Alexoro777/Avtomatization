package com.geekbrains.lesson6;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessAddToFavoritePage extends BasePage {
    public SuccessAddToFavoritePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='campaign-subheader']")
    private WebElement textFavoriteProduct;

    public void checkTextFavoriteProduct(String expectedText) {
        Assertions.assertEquals(expectedText, textFavoriteProduct);
    }
}
