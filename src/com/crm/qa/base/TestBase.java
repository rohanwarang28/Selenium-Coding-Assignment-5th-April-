package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static  Properties prop;
	static String browser;
	
	public TestBase()  {
		prop=new Properties();
		
		try {
			FileInputStream ip=new FileInputStream("D:\\my_newworkspace\\FreeCRMFramework\\src\\com\\qa\\config\\config.properties");
		    try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initialization(){
		
		 browser=prop.getProperty("browsername");
		System.out.println(browser);
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver (2).exe");
			
			driver=new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
	}
	
		
}
