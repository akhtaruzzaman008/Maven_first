package com.bitm.newtours.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	
	static{
		
		System.setProperty("webdriver.gecko.driver", "E:/Selenium 5th Batch/geckodriver-v0.18.0-win64/geckodriver.exe");
	}
	
	public static WebDriver  driver = new FirefoxDriver();
	
	public void driverexecution()
	{
		System.out.println("Driver Executed!!!");
	}
	
	private DriverManager(){
		
	}

}
