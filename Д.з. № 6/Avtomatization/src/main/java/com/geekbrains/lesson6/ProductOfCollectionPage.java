package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductOfCollectionPage extends BasePage {

    public ProductOfCollectionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[11]/main/div[6]/a[1]/div[2]/div[3]")
    private WebElement favoriteIcon;

    public ProductOfCollectionPage clickFavoriteIcon() {
        favoriteIcon.click();
        return this;
    }

    @FindBy(xpath = "//*[@id='menuItemClub']/button/i")
    private WebElement burgerMenu;

    public BurgerMenu clickBurgerMenu() {
        burgerMenu.click();
        return new BurgerMenu(driver);
    }
}
