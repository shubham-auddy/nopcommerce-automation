package com.nopcommerce.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void initializeDriver() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com");
	}
	
	@AfterMethod
	public void teardown() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
