package com.nopcommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasePage {
	private WebDriver driver;
	
	//----Elements Locator------
	
	@FindBy(css = "div[class='page-title'] h1")
	private WebElement pageTitle;
	
	@FindBy(css = "div[class='no-data']")
	private WebElement noDataText;
	
	//-----Constructor-------
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//------Actions----------
	public void assertTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public void assertPageTitle(String expectedPageTitle) {
		String actualPageTitle = pageTitle.getText();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
	}
	
	public void assertEmptyTexts(String expectedText) {
		String actualText = noDataText.getText();
		
		Assert.assertEquals(actualText, expectedText);
	}
	
	public void assertURL(String expectedURL) {
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}

}
