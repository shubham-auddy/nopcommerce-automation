package com.nopcommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class StandAlone extends BaseTest{
		
	@Test
	public void validateRegisterButtonFunctionality() {
		initializeDriver();
		navigateToRegister();
		assertTitle("nopCommerce demo store. Register");
		assertPageTitle("Register");
		validateLogoFunctionality();
		teardown();
	}
	
	@Test
	public void validateLoginButtonFunctionality() {
		initializeDriver();
		navigateToLogin();
		assertTitle("nopCommerce demo store. Login");
		assertPageTitle("Welcome, Please Sign In!");
		validateLogoFunctionality();
		teardown();
	}
	
	@Test (description = "When wishlist is empty")
	public void validateWishListButtonFunctionality() {
		initializeDriver();
		navigateToWishlist();
		assertTitle("nopCommerce demo store. Wishlist");
		assertPageTitle("Wishlist");
		assertEmptyTexts("The wishlist is empty!");
		validateLogoFunctionality();
		teardown();
	}
	
	@Test (description = "When cart is empty")
	public void validateCartButtonFunctionality() {
		initializeDriver();
		navigateToCart();
		assertTitle("nopCommerce demo store. Shopping Cart");
		assertPageTitle("Shopping cart");
		assertEmptyTexts("Your Shopping Cart is empty!");
		validateLogoFunctionality();
		teardown();
	}
	
	@Test
	public void validateCurrencyDropdown() {
		initializeDriver();
		String expectedValue = "Euro";
		changeCustomerCurrency(expectedValue);
		String actualValue =  new Select(driver.findElement(By.id("customerCurrency"))).getFirstSelectedOption().getText();
		Assert.assertEquals(actualValue, expectedValue);
		teardown();
		
	}
	
	
	public void changeCustomerCurrency(String currency) {
		Select select = new Select(driver.findElement(By.id("customerCurrency")));
		select.selectByVisibleText(currency);
	}
	
	public void navigateToHome() {
		driver.findElement(By.cssSelector("div[class='header-logo'] img")).click();
	}
	
	public void navigateToRegister() {
		driver.findElement(By.cssSelector("a.ico-register")).click();
	}
	
	public void navigateToLogin() {
		driver.findElement(By.cssSelector("a.ico-login")).click();
	}
	
	public void navigateToWishlist() {
		driver.findElement(By.cssSelector("a.ico-wishlist")).click();
	}
	
	public void navigateToCart() {
		driver.findElement(By.cssSelector("a.ico-cart")).click();
	}
	
	public void validateLogoFunctionality() {
		navigateToHome();
		assertTitle("nopCommerce demo store. Home page title");
	}
	
	public void assertTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public void assertPageTitle(String expectedPageTitle) {
		String actualPageTitle = driver.findElement(By.cssSelector("div[class='page-title'] h1")).getText();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
	}
	
	public void assertEmptyTexts(String expectedString) {
		String noDataText = driver.findElement(By.cssSelector("div[class='no-data']")).getText();
		Assert.assertEquals(noDataText, expectedString);
	}
}
