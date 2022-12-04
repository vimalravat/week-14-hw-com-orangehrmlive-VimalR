package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
    By verifyMessage = By.xpath("//header/div[1]/div[1]/span[1]/h6[1]");
    By resetPasswordText = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']");

    By forgotPasswordLink = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");

    public void enterUsername(String text) {
        sendTextToElement(usernameField, text);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void clickOnForgotPasswordLink() {
        clickOnElement(forgotPasswordLink);
    }

    public String getTextVerify() {
        return getTextFromElement(verifyMessage);
    }

    public String getResetPasswordTextVerify() {
        return getTextFromElement(resetPasswordText);
    }
}
