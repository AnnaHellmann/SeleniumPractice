package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTests extends BaseTest {

    @Test
    public void loginTest() {
        loginPage.userNameField("standard_user");
        loginPage.passwordField("abc123");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.errorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
