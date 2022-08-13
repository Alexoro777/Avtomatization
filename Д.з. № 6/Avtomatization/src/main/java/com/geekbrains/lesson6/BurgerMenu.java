package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BurgerMenu extends BasePage {
    public BurgerMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='drop-menu-item  '][6]")
    private WebElement favoriteProducts;

    public SuccessAddToFavoritePage clickFavoriteProducts() {
        favoriteProducts.click();
        return new SuccessAddToFavoritePage(driver);
    }
}
