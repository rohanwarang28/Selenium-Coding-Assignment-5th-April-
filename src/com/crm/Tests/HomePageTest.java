package com.crm.Tests;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;


public class HomePageTest extends TestBase{

	
	
	HomePage homePage;
	
	public HomePageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage=new HomePage();
			
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
