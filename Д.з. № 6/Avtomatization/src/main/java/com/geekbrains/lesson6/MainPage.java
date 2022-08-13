package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

    @FindBy(xpath = "//button[.='Быстрый вход']")
    public WebElement quickLoginButton;

    public MainPage(WebDriver driver) {
        super(driver);
        categoryBlock = new CategoryBlock(driver);
    }

    public CategoryBlock categoryBlock;

    public LoginPage clickQuickLoginButton() {
        quickLoginButton.click();
        return new LoginPage(driver);
    }
}
