package com.geekbrains.lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PermissionDialogWindow extends BasePage {
    public PermissionDialogWindow(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pushPermissionDialogCancel")
    private WebElement permissionWindow;

    public MainPage clickPushPermissionDialog() {
        WebElement pushPermissionDialog = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pushPermissionDialog")));
        permissionWindow.click();
        return new MainPage(driver);
    }
}
