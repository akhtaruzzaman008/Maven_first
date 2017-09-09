package com.bitm.newtours.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DriverManager {
	
	static{
		
		System.setProperty("webdriver.gecko.driver", "E:/Selenium 5th Batch/geckodriver-v0.18.0-win64/geckodriver.exe");
	}
	
	public static WebDriver  driver = new FirefoxDriver();
	
	@Test
	public void driverexecution()
	{
		System.out.println("Driver Executed!!!");
	}
	
	private DriverManager(){
		
	}

}







