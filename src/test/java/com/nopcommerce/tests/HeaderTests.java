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

import com.nopcommerce.pages.HeaderComponent;

public class HeaderTests extends BaseTest{
	@Test
	public void verifyRegisterNavigation() {
		HeaderComponent header = new HeaderComponent(driver);
		header.clickRegister();
		header.assertTitle("nopCommerce demo store. Register");
		header.assertPageTitle("Register");
		header.assertURL("https://demo.nopcommerce.com/register?returnUrl=%2F");
		header.verifyLogoNavigationFromRegisterPage();
	}
	
	@Test
	public void verifyLoginNavigation() {
		HeaderComponent header = new HeaderComponent(driver);
		header.clickLogin();
		header.assertTitle("nopCommerce demo store. Login");
		header.assertPageTitle("Welcome, Please Sign In!");
		header.assertURL("https://demo.nopcommerce.com/login?returnUrl=%2F");
		header.verifyLogoNavigationFromRegisterPage();
	}
	
	@Test (description = "When wishlist is empty")
	public void verifyWishListNavigationWhenEmpty() {
		HeaderComponent header = new HeaderComponent(driver);
		header.openWishlist();
		header.assertTitle("nopCommerce demo store. Wishlist");
		header.assertPageTitle("Wishlist");
		header.assertURL("https://demo.nopcommerce.com/wishlist");
		header.assertEmptyTexts("The wishlist is empty!");
		header.verifyLogoNavigationFromRegisterPage();
	}
	
	@Test (description = "When cart is empty")
	public void verifyCartNavigationWhenEmpty() {
		HeaderComponent header = new HeaderComponent(driver);
		header.openCart();
		header.assertTitle("nopCommerce demo store. Shopping Cart");
		header.assertPageTitle("Shopping cart");
		header.assertURL("https://demo.nopcommerce.com/cart");
		header.assertEmptyTexts("Your Shopping Cart is empty!");
		header.verifyLogoNavigationFromRegisterPage();
	}
	
	@Test
	public void verifyCurrencyDropdown() {
		HeaderComponent header = new HeaderComponent(driver);
		String expectedValue = "Euro";
		header.changeCurrency(expectedValue);
		String actualValue =  new Select(driver.findElement(By.id("customerCurrency"))).getFirstSelectedOption().getText();
		Assert.assertEquals(actualValue, expectedValue);
	}
	
	@Test
	public void verifySearchFunctionality() {
		HeaderComponent header = new HeaderComponent(driver);
		String keyword = "Samsung";
		header.typeInSearchBox(keyword);
		header.clickSearchButton();
		header.assertPageTitle("Search");
		header.assertTitle("nopCommerce demo store. Search");
		header.assertURL("https://demo.nopcommerce.com/search?q="+keyword);
		String searchText = driver.findElement(By.id("q")).getAttribute("value");
		Assert.assertEquals(searchText, keyword);
		header.verifyLogoNavigationFromRegisterPage();
	}
	
	@Test
	public void verifySearchBoxSuggestions() {
		
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("Apple MacBook Pro");
		expectedList.add("Apple iCam");
		expectedList.add("Apple iPhone 16 128GB");
		
		List<String> actuaList = new ArrayList<String>();
		
		HeaderComponent header = new HeaderComponent(driver);
		header.typeInSearchBox("Apple");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-id-1")));
		
		List<WebElement> suggestions = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		for(WebElement e: suggestions) {
			String s = e.findElement(By.tagName("span")).getText();
			actuaList.add(s);
		}
		
		Assert.assertEquals(actuaList, expectedList);
	}
	
	@Test
	public void verifyComputersLinkNavigation() {
		HeaderComponent header = new HeaderComponent(driver);
		header.clickComputers();
		header.assertTitle("nopCommerce demo store. Computers");
		header.assertPageTitle("Computers");
		header.verifyLogoNavigationFromRegisterPage();
	}
	
	@Test
	public void verifyComputersHoverSuggestions() {
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
	}
	
	@Test
	public void verifyElectronicsLinkNavigation() {
		HeaderComponent header = new HeaderComponent(driver);
		header.clickElectronics();
		header.assertTitle("nopCommerce demo store. Electronics");
		header.assertPageTitle("Electronics");
		header.verifyLogoNavigationFromRegisterPage();
	}
	
	@Test
	public void verifyElectronicsHoverSuggestions() {
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
	}
	
	@Test
	public void verifyApparelLinkNavigation() {
		HeaderComponent header = new HeaderComponent(driver);
		header.clickApparel();
		header.assertTitle("nopCommerce demo store. Apparel");
		header.assertPageTitle("Apparel");
		header.verifyLogoNavigationFromRegisterPage();
	}
	
	@Test
	public void verifyApparelHoverSuggestions() {
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
	}
	
	@Test
	public void verifyDigitalDownloadsLinkNavigation() {
		HeaderComponent header = new HeaderComponent(driver);
		header.clickDigitalDownloads();
		header.assertTitle("nopCommerce demo store. Digital downloads");
		header.assertPageTitle("Digital downloads");
		header.verifyLogoNavigationFromRegisterPage();
	}
	
	@Test
	public void verifyBooksLinkNavigation() {
		HeaderComponent header = new HeaderComponent(driver);
		header.clickBooks();
		header.assertTitle("nopCommerce demo store. Books");
		header.assertPageTitle("Books");
		header.verifyLogoNavigationFromRegisterPage();
	}
	
	@Test
	public void verifyJewelryLinkNavigation() {
		HeaderComponent header = new HeaderComponent(driver);
		header.clickJewelry();
		header.assertTitle("nopCommerce demo store. Jewelry");
		header.assertPageTitle("Jewelry");
		header.verifyLogoNavigationFromRegisterPage();
	}
	
	@Test
	public void verifyGiftCardsLinkNavigation() {
		HeaderComponent header = new HeaderComponent(driver);
		header.clickGiftCards();
		header.assertTitle("nopCommerce demo store. Gift Cards");
		header.assertPageTitle("Gift Cards");
		header.verifyLogoNavigationFromRegisterPage();
	}
}
