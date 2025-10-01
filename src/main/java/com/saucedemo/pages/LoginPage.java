package com.saucedemo.pages;
import com.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("[data-test='error']");

    public void userNameField(String userName)
    {
        click(usernameField);
        set(usernameField, userName);
    }

    public void passwordField(String password)
    {
        click(passwordField);
        set(passwordField, password);
    }

    public ProductsPage clickLoginButton()
    {
        click(loginButton);
        return new ProductsPage();
    }

    public ProductsPage logIntoApplication(String username, String password)
    {
        userNameField(username);
        passwordField(password);
        return clickLoginButton();
    }

    public String errorMessage()
    {
        return find(errorMessage).getText();
    }
}
