package com.crm.Tests;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.SearchPage;

public class SearchPageTest extends TestBase{

	SearchPage searchPage;
	HomePage homePage;
    
	
	
	public SearchPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage=new HomePage();
		searchPage = homePage.searchCity();	
	}
	
	
	
	@Test
	public void sortByPrice() {
		
		//homePage.searchCity();
		List<Integer> priceList =   searchPage.storeprices();
		Collections.sort(priceList, Collections.reverseOrder());
		
		for (int num :priceList )
			System.out.println(num);
				
	}
	
	@Test
	public void selectProperty() {
		
		searchPage.selectProperty(5);
	}
	
			
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
