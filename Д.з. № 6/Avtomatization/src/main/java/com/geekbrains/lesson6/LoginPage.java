package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "auth-email")
    private WebElement emailField;

    @FindBy(id = "auth-login-button")
    private WebElement loginButton;

    @FindBy(id = "auth-password")
    private WebElement passwordField;

    @FindBy(id = "auth-password-button")
    private WebElement passwordButton;


    public PermissionDialogWindow login(String login, String password) {
        emailField.sendKeys(login);
        loginButton.click();
        passwordField.sendKeys(password);
        passwordButton.click();
        return new PermissionDialogWindow(driver);
    }
}
