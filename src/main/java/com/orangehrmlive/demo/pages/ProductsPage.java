package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ProductsPage extends Utility {
    By usernameField= By.name("user-name");
    By passwordField= By.name("password");
    By loginButton= By.xpath("//input[@id='login-button']");
    public void enterUsername(String text){
        sendTextToElement(usernameField, text);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    By inventoryDisplayed = By.id("inventory_container");

    public void inventoryDisplay() {
        if (driver.findElement(inventoryDisplayed).isDisplayed() == true) {
            System.out.println("true");


        } else {
            System.out.println("no product displayed");
        }



    }}




