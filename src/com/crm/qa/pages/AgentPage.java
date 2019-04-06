package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class AgentPage extends TestBase{

	@FindBy(xpath="(//h1[@class='bottom-half']/b)[1]")
	WebElement agentName;
	
	
	
	 public AgentPage() {
			
			PageFactory.initElements(driver, this);
	}
	 
	 public String captureAgentName() {
		 
		  return agentName.getText();
		 
	 }

	 
}
