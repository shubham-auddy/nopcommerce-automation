package com.nopcommerce.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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
		List<WebElement> myAccountLinks = driver.findElements(By.cssSelector("div[class='footer-block information'] li"));
		for(WebElement e: myAccountLinks) {
			System.out.println(e.getText());
		}
	}
}
