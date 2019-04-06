package com.crm.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SearchPage extends TestBase{

	List<Integer> priceIntList = new ArrayList<Integer>();
	
	
    public SearchPage() {
		
		PageFactory.initElements(driver, this);
	}
	

	public List<Integer> storeprices() {
		String priceString;
		int priceInt;
		
		List<WebElement> Prices = driver.findElements(By.xpath("//a[@class='listing-results-price text-price']"));
		
		for(WebElement price : Prices) {
			
			priceString=price.getText();
			priceString = priceString.replaceAll("[^\\d]", "");
			priceInt=Integer.valueOf(priceString);
			priceIntList.add(priceInt);
		}
		
		return priceIntList;
	}
	
	public PropertyPage selectProperty(int i) {
		int j=i+3;
		driver.findElement(By.xpath("(//div[@class='agent_logo']/following-sibling::a)["+ j +"]" )).click();
		return new PropertyPage();
	}

	
}
