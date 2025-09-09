package com.nopcommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HeaderComponent extends BasePage{
	
	// ------Locators for header elements-------
	
	@FindBy(id = "customerCurrency")
	private WebElement customerCurrency;
	
	@FindBy(css = "a.ico-register")
	private WebElement registerLink;
	
	@FindBy(css = "a.ico-login")
	private WebElement loginLink;
	
	@FindBy(css = "a.ico-wishlist")
	private WebElement wishlistLink;
	
	@FindBy(css = "a.ico-cart")
	private WebElement cartLink;
	
	@FindBy(css = "div[class='header-logo'] img")
	private WebElement companyLogo;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchBox;
	
	@FindBy(css = ".search-box button")
	private WebElement searchButton;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/computers']")
	private WebElement computersLink;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/electronics']")
	private WebElement electronicssLink;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/apparel']")
	private WebElement apparelLink;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/digital-downloads']")
	private WebElement digitalDownloadsLink;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/books']")
	private WebElement booksLink;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/jewelry']")
	private WebElement jewelryLink;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/gift-cards']")
	private WebElement giftCardsLink;
	
    @FindBy(css = "a.ico-logout")
    private WebElement logoutLink;

	
	//-------Constructor------
	public HeaderComponent(WebDriver driver) {
		super(driver);
	}
	
	//------Actions for Header-----
	public void changeCurrency(String currency) {
		Select select = new Select(customerCurrency);
		select.selectByVisibleText(currency);
	}
	
	public void clickRegister() {
		registerLink.click();
	}
	
	public void clickLogin() {
		loginLink.click();
	}
	
	public void openWishlist() {
		wishlistLink.click();
	}
	
	public void openCart() {
		cartLink.click();
	}
	
	public void clickLogo() {
		companyLogo.click();
	}
	
	public void typeInSearchBox(String keyword) {
		searchBox.clear();
		searchBox.sendKeys(keyword);
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public void clickComputers() {
		computersLink.click();
	}
	
	public void clickElectronics() {
		electronicssLink.click();
	}
	
	public void clickApparel() {
		apparelLink.click();
	}
	
	public void clickDigitalDownloads() {
		digitalDownloadsLink.click();
	}
	
	public void clickBooks() {
		booksLink.click();
	}
	
	public void clickJewelry() {
		jewelryLink.click();
	}
	
	public void clickGiftCards() {
		giftCardsLink.click();
	}
	
	  // ---- Verifications (optional) ----
    public boolean isUserLoggedIn() {
        return logoutLink.isDisplayed();
    }
    
	public void verifyLogoNavigationFromRegisterPage() {
		clickLogo();
		assertTitle("nopCommerce demo store. Home page title");
		assertURL("https://demo.nopcommerce.com/");
	}

}
