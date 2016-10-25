package com.epam.controls.pages.surrounding.pageBlocks;

import com.epam.controls.pages.StartPage;
import com.epam.controls.pages.surrounding.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMenu {
    private WebDriver driver;

    @FindBy(className = "navbar-right")
    private WebElement profileMenu;

    @FindBy(id = "Login")
    private WebElement loginFormElement;

    @FindBy(id = "Password")
    private WebElement passwordFormElement;

    @FindBy(className = "btn-login")
    private WebElement buttonLogin;

    @FindBy(className = "logout")
    public WebElement buttonLogout;

    public LoginMenu() {
        driver = StartPage.driverS;
        profileMenu = driver.findElement(By.className("navbar-right"));
        loginFormElement = driver.findElement(By.id("Login"));
        passwordFormElement = driver.findElement(By.id("Password"));
        buttonLogin = driver.findElement(By.className("btn-login"));
        buttonLogout = driver.findElement(By.className("logout"));
    }

    public void submitLogin() {
        buttonLogin.click();
    }

    public LoginMenu clickMenu() {
        profileMenu.click();
        return this;
    }

    public LoginMenu typeUsername(String username) {
        loginFormElement.click();
        loginFormElement.sendKeys(username);
        return this;
    }

    public LoginMenu typePassword(String password) {
        passwordFormElement.click();
        passwordFormElement.sendKeys(password);
        return this;
    }

}
