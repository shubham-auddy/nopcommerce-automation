package com.nopcommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header {
	
	WebDriver driver;
	
	@FindBy(id = "customerCurrency")
	WebElement customerCurrency;
	
	@FindBy(css = "a.ico-register")
	WebElement registerLink;
	
	@FindBy(css = "a.ico-login")
	WebElement loginLink;
	
	@FindBy(css = "a.ico-wishlist")
	WebElement wishlistLink;
	
	@FindBy(css = "a.ico-cart")
	WebElement cartLink;
	
	@FindBy(css = "div[class='header-logo'] img")
	WebElement companyLogo;
	
	@FindBy(id = "small-searchterms")
	WebElement searchBar;
	
	@FindBy(css = ".search-box button")
	WebElement searchButton;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/computers']")
	WebElement computersLink;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/electronics']")
	WebElement electronicssLink;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/apparel']")
	WebElement apparelLink;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/digital-downloads']")
	WebElement digitalDownloadsLink;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/books']")
	WebElement booksLink;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/jewelry']")
	WebElement jewelryLink;
	
	@FindBy(css = "ul[class='top-menu notmobile'] a[href='/gift-cards']")
	WebElement giftCardsLink;
}
