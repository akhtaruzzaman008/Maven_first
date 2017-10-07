package com.bitm.newtours.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.newtours.Utils.ExcelUtils;

public class FlightFinderDataProvider {
	
	@DataProvider(name="flightFinderData")
	public static Object[][] getFlightFinderData() {
	        try {
	   return new Object[][]{
	     {
	      ExcelUtils.getFlightFinderData()
	     },
	    };
	  } catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	   return null;
	  }         
	    }


}
