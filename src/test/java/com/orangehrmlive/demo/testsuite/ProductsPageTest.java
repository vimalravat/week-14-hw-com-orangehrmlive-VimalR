package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.ProductsPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class ProductsPageTest extends BaseTest {


    ProductsPage productsPage = new ProductsPage();

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        productsPage.enterUsername("standard_user");
        productsPage.enterPassword("secret_sauce");
        productsPage.clickOnLoginButton();
        productsPage.inventoryDisplay();

    }

}
