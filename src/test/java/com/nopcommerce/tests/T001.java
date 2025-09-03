package com.nopcommerce.tests;

import org.testng.annotations.Test;

public class T001 extends BaseTest{
	
	@Test
	public void testcase1() {
		initializeDriver();
		String title = driver.getTitle();
		org.testng.Assert.assertEquals("nopCommerce demo store. Home page title", title);
		teardown();
	}

}
