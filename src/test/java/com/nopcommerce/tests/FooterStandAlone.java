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
}
