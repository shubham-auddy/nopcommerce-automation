package com.nopcommerce.tests;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HeaderSectionStandAloneTest extends BaseTest{
		
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
	
	@Test
	public void validateSearchBoxFunctionality() {
		
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("Apple MacBook Pro");
		expectedList.add("Apple iCam");
		expectedList.add("Apple iPhone 16 128GB");
		
		List<String> actuaList = new ArrayList<String>();
		
		initializeDriver();
		driver.findElement(By.id("small-searchterms")).sendKeys("Apple");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-id-1")));
		
		List<WebElement> suggestions = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		for(WebElement e: suggestions) {
			String s = e.findElement(By.tagName("span")).getText();
			actuaList.add(s);
		}
		
		Assert.assertEquals(actuaList, expectedList);
		teardown();
	}
	
	@Test
	public void validateComputersButtonFunctionality() {
		initializeDriver();
		navigateToComputers();
		assertTitle("nopCommerce demo store. Computers");
		assertPageTitle("Computers");
		validateLogoFunctionality();
		teardown();
	}
	
	@Test
	public void validateComputersButtonOptions() {
		initializeDriver();
		Actions a = new Actions(driver);
		WebElement target = driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/computers']"));
		a.moveToElement(target).build().perform();
		List<WebElement> items = driver.findElements(By.xpath("(//ul[@class='top-menu notmobile']//ul)[1]//li//a"));
		
		List<String> expectedOptions = new ArrayList<String>();
		expectedOptions.add("Desktops");
		expectedOptions.add("Notebooks");
		expectedOptions.add("Software");
		List<String> actualOptions = new ArrayList<String>();
		
		for(WebElement ele: items) {
			actualOptions.add(ele.getText());
		}
		
		Assert.assertEquals(actualOptions, expectedOptions);
		teardown();
	}
	
	@Test
	public void validateElectronicsButtonFunctionality() {
		initializeDriver();
		navigateToElectronics();
		assertTitle("nopCommerce demo store. Electronics");
		assertPageTitle("Electronics");
		validateLogoFunctionality();
		teardown();
	}
	
	@Test
	public void validateElectronicsButtonOptions() {
		initializeDriver();
		Actions a = new Actions(driver);
		WebElement target = driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/electronics']"));
		a.moveToElement(target).build().perform();
		List<WebElement> items = driver.findElements(By.xpath("(//ul[@class='top-menu notmobile']//ul)[2]//li//a"));
		
		List<String> expectedOptions = new ArrayList<String>();
		expectedOptions.add("Camera & photo");
		expectedOptions.add("Cell phones");
		expectedOptions.add("Others");
		List<String> actualOptions = new ArrayList<String>();
		
		for(WebElement ele: items) {
			actualOptions.add(ele.getText());
		}
		
		Assert.assertEquals(actualOptions, expectedOptions);
		teardown();
	}
	
	@Test
	public void validateApparelButtonFunctionality() {
		initializeDriver();
		navigateToApparel();
		assertTitle("nopCommerce demo store. Apparel");
		assertPageTitle("Apparel");
		validateLogoFunctionality();
		teardown();
	}
	
	@Test
	public void validateApparelButtonOption() {
		initializeDriver();
		Actions a = new Actions(driver);
		WebElement target = driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/apparel']"));
		a.moveToElement(target).build().perform();
		List<WebElement> items = driver.findElements(By.xpath("(//ul[@class='top-menu notmobile']//ul)[3]//li//a"));
		
		List<String> expectedOptions = new ArrayList<String>();
		expectedOptions.add("Shoes");
		expectedOptions.add("Clothing");
		expectedOptions.add("Accessories");
		List<String> actualOptions = new ArrayList<String>();
		
		for(WebElement ele: items) {
			actualOptions.add(ele.getText());
		}
		
		Assert.assertEquals(actualOptions, expectedOptions);
		teardown();
	}
	
	@Test
	public void validateDigitalDownloadsButtonFunctionality() {
		initializeDriver();
		navigateToDigitalDownloads();
		assertTitle("nopCommerce demo store. Digital downloads");
		assertPageTitle("Digital downloads");
		validateLogoFunctionality();
		teardown();
	}
	
	@Test
	public void validateBooksButtonFunctionality() {
		initializeDriver();
		navigateToBooks();
		assertTitle("nopCommerce demo store. Books");
		assertPageTitle("Books");
		validateLogoFunctionality();
		teardown();
	}
	
	@Test
	public void validateJewelryButtonFunctionality() {
		initializeDriver();
		navigateToJewelry();
		assertTitle("nopCommerce demo store. Jewelry");
		assertPageTitle("Jewelry");
		validateLogoFunctionality();
		teardown();
	}
	
	@Test
	public void validateGiftCardsButtonFunctionality() {
		initializeDriver();
		navigateToGiftCards();
		assertTitle("nopCommerce demo store. Gift Cards");
		assertPageTitle("Gift Cards");
		validateLogoFunctionality();
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
	
	public void navigateToComputers() {
		driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/computers']")).click();
	}
	
	public void navigateToElectronics() {
		driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/electronics']")).click();
	}
	
	public void navigateToApparel() {
		driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/apparel']")).click();
	}
	
	public void navigateToDigitalDownloads() {
		driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/digital-downloads']")).click();
	}
	
	public void navigateToBooks() {
		driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/books']")).click();
	}
	
	public void navigateToJewelry() {
		driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/jewelry']")).click();
	}
	
	public void navigateToGiftCards() {
		driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] a[href='/gift-cards']")).click();
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
