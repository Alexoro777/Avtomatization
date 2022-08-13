package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryBlock extends BasePage{

    public CategoryBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='tag'][4]//button[@data-action='feed-filter-item']")
    private WebElement grownupButton;

    public GrownupPage clickGrownupButton() {
        grownupButton.click();
        return new GrownupPage(driver);
    }

}
