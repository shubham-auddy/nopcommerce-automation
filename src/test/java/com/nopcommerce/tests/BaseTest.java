package com.nopcommerce.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	
	public void initializeDriver() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com");
	}
	
	public void teardown() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
