package com.nopcommerce.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.utils.BrokenLinkUtil;

public class FooterStandAlone extends BaseTest{
	
	@Test
	public void verifyFotterBlockSections() {
		List<WebElement> footerSections = driver.findElements(By.cssSelector(".footer-block .title"));
		for(WebElement section: footerSections) {
			System.out.println(section.getText());
		}
	}
	
	@Test
	public void verifyInformationSectionLinks() {
		List<WebElement> informationLinks = driver.findElements(By.cssSelector("div[class='footer-block information'] li"));
		for(WebElement e: informationLinks) {
			System.out.println(e.getText());
		}
	}
	
	@Test
	public void verifyCustomerServiceSectionLinks() {
		List<WebElement> customerServiceLinks = driver.findElements(By.cssSelector("div[class='footer-block information'] li"));
		for(WebElement e: customerServiceLinks) {
			System.out.println(e.getText());
		}
	}
	
	@Test
	public void verifyMyAccountSectionLinks() {
		List<WebElement> myAccountLinks = driver.findElements(By.cssSelector("div[class='footer-block information'] li a"));
		for(WebElement e: myAccountLinks) {
			Assert.assertTrue(BrokenLinkUtil.isLinkBroken(e), "Broken URL - " + e.getAttribute("href"));
		}
	}
	
	public void verifyFacebookButton() {
		
	}
	
	public void verifyXButton() {
		
	}
	
	public void verifyRSSButton() {
		
	}
	
	public void verifyYoutubeButton() {
		
	}
	
	public void verifyInstagramButton() {
		
	}
	
	public void verifyCompanyLink() {
		
	}
	
	@Test
	public void verifyPositiveNewsLetterSubscription() {
		driver.findElement(By.id("newsletter-email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("newsletter-result-block"))));
		String expectedText = "Thank you for signing up! A verification email has been sent. We appreciate your interest";
		String actualText = driver.findElement(By.id("newsletter-result-block")).getText();
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test
	public void verifyNegetiveNewsLetterSubscription() {
		driver.findElement(By.id("newsletter-email")).sendKeys("abcd");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("newsletter-result-block"))));
		String expectedText = "Enter valid email";
		String actualText = driver.findElement(By.id("newsletter-result-block")).getText();
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test
	public void verifyCopyrightText() {
		String footerCopyrightText = driver.findElement(By.cssSelector(".footer-disclaimer")).getText();
		Assert.assertEquals(footerCopyrightText, "Copyright © 2025 nopCommerce demo store. All rights reserved.");
	}
}
