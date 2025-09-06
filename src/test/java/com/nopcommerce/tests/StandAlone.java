package com.nopcommerce.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class StandAlone extends BaseTest{
		
	@Test
	public void checkRegisterButton() {
		initializeDriver();
		driver.findElement(By.cssSelector("a.ico-register")).click();
		assertTitle("nopCommerce demo store. Register");
		assertPageTitle("Register");
		checkLogo();
		teardown();
	}
	
	@Test
	public void checkLoginButton() {
		initializeDriver();
		driver.findElement(By.cssSelector("a.ico-login")).click();
		assertTitle("nopCommerce demo store. Login");
		assertPageTitle("Welcome, Please Sign In!");
		checkLogo();
		teardown();
	}
	
	@Test
	public void checkEmptyWishList() {
		initializeDriver();
		driver.findElement(By.cssSelector("a.ico-wishlist")).click();
		assertTitle("nopCommerce demo store. Wishlist");
		assertPageTitle("Wishlist");
		assertEmptyTexts("The wishlist is empty!");
		checkLogo();
		teardown();
	}
	
	@Test
	public void checkEmptyCart() {
		initializeDriver();
		driver.findElement(By.cssSelector("a.ico-cart")).click();
		assertTitle("nopCommerce demo store. Shopping Cart");
		assertPageTitle("Shopping cart");
		assertEmptyTexts("Your Shopping Cart is empty!");
		checkLogo();
		teardown();
	}
	
	public void checkCurrencyDropdown() {
		initializeDriver();
		teardown();
		
	}
	
	public void checkLogo() {
		//check icon
		driver.findElement(By.cssSelector("div[class='header-logo'] img")).click();
		String homeTitle = driver.getTitle();
		Assert.assertEquals(homeTitle, "nopCommerce demo store. Home page title");
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
