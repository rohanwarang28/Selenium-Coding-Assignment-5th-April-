package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PropertyPage extends TestBase{
	
	
	@FindBy(xpath="(//h4[@class='ui-agent__name'])[1]")
	WebElement agentName;

	  public PropertyPage() {
			
			PageFactory.initElements(driver, this);
		}
	
	  
	  
	public String captureAgentName() {
		
		return agentName.getText();
	}
	
	public AgentPage selectAgent() {
		
		agentName.click();
		return new AgentPage();
	}
		
	
}
