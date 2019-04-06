package com.crm.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(id="search-input-location")
	WebElement locationInput;
	
	@FindBy(id="search-submit")
	WebElement submitBtn;
	
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public SearchPage searchCity() {
		locationInput.sendKeys("London");
		submitBtn.click();
		return new SearchPage();		
	}
	
		
	
}
