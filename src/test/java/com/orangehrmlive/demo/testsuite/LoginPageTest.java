package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedText = "Dashboard";
        String actualText = loginPage.getTextVerify();
        Assert.assertEquals(actualText, expectedText, "Text not displayed");

    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        loginPage.clickOnForgotPasswordLink();
        String expectedText = "Reset Password";
        String actualText = loginPage.getResetPasswordTextVerify();
        Assert.assertEquals(actualText, expectedText, "Text not displayed");

    }

}
