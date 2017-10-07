package com.bitm.newtours.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.newtours.DataProvider.LoginDataProvider;
import com.bitm.newtours.Utils.DriverManager;
import com.bitm.newtours.Utils.UrlTextUtils;
import com.bitm.newtours.Utils.XpathUtils;
import com.bitm.newtours.Utils.XpathUtils.login;
import com.bitm.newtours.dto.LoginDTO;

public class LoginTest {
	
	private WebDriver  driver = null;
	
	@Test(priority = 1)
	public void checkloginpagetitle(){
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.BASE_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.LOGIN_PAGE_TITLE);
		
		System.out.println("Login Page Title checked Successfully");
	}
	
	@Test(priority = 2, dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
	public void logintest(List<LoginDTO> logindata) throws InterruptedException {
		
		for (LoginDTO login: logindata){
		
			navigate("http://newtours.demoaut.com/");
		driver.findElement(By.xpath(XpathUtils.login.INPUT_USER_NAME)).sendKeys(login.getUserName());
		driver.findElement(By.xpath(XpathUtils.login.INPUT_PASSWORD)).sendKeys(login.getPassword());
		driver.findElement(By.xpath(XpathUtils.login.BTN_SIGNIN)).submit();	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		System.out.println("Logged in Successfully");
	}

	private void navigate(String url) {
		// TODO Auto-generated method stub
		driver.navigate().to(url);
		driver.navigate().refresh();
	}
	

}
