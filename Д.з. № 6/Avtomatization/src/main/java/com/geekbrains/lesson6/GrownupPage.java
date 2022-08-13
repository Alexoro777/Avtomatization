package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GrownupPage extends BasePage {
    public GrownupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "cw-charuttimoda")
    private WebElement collectionCards;

    public ProductOfCollectionPage clickCollectionCards() {
        collectionCards.click();
        return new ProductOfCollectionPage(driver);
    }
}
