package com.bitm.newtours.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bitm.newtours.DataProvider.FlightFinderDataProvider;
import com.bitm.newtours.Utils.XpathUtils;
import com.bitm.newtours.dto.FlightFinnderDTO;

public class FlightFinderTest {
	
	private WebDriver  driver = null;
	
	@Test(priority =1, dataProvider = "flightFinderData", dataProviderClass = FlightFinderDataProvider.class)
	public void flightFindermod(List<FlightFinnderDTO> flightfinderdata) throws InterruptedException {
		
		for (FlightFinnderDTO flightfinder: flightfinderdata){
		  
		navigate("http://newtours.demoaut.com/mercuryreservation.php");	
		driver.findElement(By.xpath(XpathUtils.flightfinder.FLIGHT_TYPE)).click();	
		driver.findElement(By.xpath(XpathUtils.flightfinder.PASSENGERS_NUMBER)).sendKeys(flightfinder.getPassengers());
		driver.findElement(By.xpath(XpathUtils.flightfinder.DEPARTING_FROM)).sendKeys(flightfinder.getDepartingFrom());
		driver.findElement(By.xpath(XpathUtils.flightfinder.DEPARTING_MONTH)).sendKeys(flightfinder.getDepartingOnMonth());
		driver.findElement(By.xpath(XpathUtils.flightfinder.DEPARTING_DATE)).sendKeys(flightfinder.getDepartingOnDate());
		driver.findElement(By.xpath(XpathUtils.flightfinder.ARRIVING_IN)).sendKeys(flightfinder.getArrivingIn());
		driver.findElement(By.xpath(XpathUtils.flightfinder.RETURNING_MONTH)).sendKeys(flightfinder.getReturningMonth());
		driver.findElement(By.xpath(XpathUtils.flightfinder.RETURNING_DATE)).sendKeys(flightfinder.getReturningDate());
		driver.findElement(By.xpath(XpathUtils.flightfinder.SERVICE_CLASS)).click();	
		driver.findElement(By.xpath(XpathUtils.flightfinder.AIRLINES_NAME)).sendKeys(flightfinder.getAirline());
		driver.findElement(By.xpath(XpathUtils.flightfinder.CONTINUE_NEXT)).submit();
		
		}
		
		System.out.println("Flight Finder done successfully");
	}

	private void navigate(String url) {
		// TODO Auto-generated method stub
		driver.navigate().to(url);
		driver.navigate().refresh();
	}

}
