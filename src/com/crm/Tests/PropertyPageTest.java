package com.crm.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.PropertyPage;
import com.crm.qa.pages.SearchPage;

public class PropertyPageTest extends TestBase{
	
	HomePage homePage;
	SearchPage searchPage;
	PropertyPage propertyPage;

	public PropertyPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage=new HomePage();
		searchPage = homePage.searchCity();
		propertyPage=searchPage.selectProperty(5);
		
	}
	
		
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
