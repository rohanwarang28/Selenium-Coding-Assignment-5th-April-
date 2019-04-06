package com.crm.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AgentPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.PropertyPage;
import com.crm.qa.pages.SearchPage;

public class AgentPageTest extends TestBase{

	HomePage homePage;
	SearchPage searchPage;
	PropertyPage propertyPage;
	AgentPage agentPage;
	String agentNamePropPage;
	
	public AgentPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage=new HomePage();
		searchPage = homePage.searchCity();
		propertyPage = searchPage.selectProperty(5);
		agentNamePropPage = propertyPage.captureAgentName();
		agentPage = propertyPage.selectAgent();
	}
	
	
	@Test
	 public void validateAgentName() {
		 String agentnameAgentPage = agentPage.captureAgentName();
		 Assert.assertEquals(agentNamePropPage, agentnameAgentPage);
		 
	 }
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
}
