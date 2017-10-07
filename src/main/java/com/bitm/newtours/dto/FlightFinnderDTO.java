package com.bitm.newtours.dto;

public class FlightFinnderDTO {
	
	private String passengers;
	private String departingFrom;
	private String departingOnMonth;
	private String departingOnDate;
	private String arrivingIn;
	private String returningMonth;
	private String returningDate;
	private String serviceClass;
	private String airline;
	
		public String getPassengers() {
		return passengers;
	}

	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	
	public String getDepartingFrom() {
		return departingFrom;
	}
	public void setDepartingFrom(String departingFrom) {
		this.departingFrom = departingFrom;
	}
	
	public String getDepartingOnMonth() {
		return departingOnMonth;
	}
	public void setDepartingOnMonth(String departingOnMonth) {
		this.departingOnMonth = departingOnMonth;
	}

	public String getDepartingOnDate() {
		return departingOnDate;
	}

	public void setDepartingOnDate(String departingOnDate) {
		this.departingOnDate = departingOnDate;
	}

	public String getArrivingIn() {
		return arrivingIn;
	}

	public void setArrivingIn(String arrivingIn) {
		this.arrivingIn = arrivingIn;
	}

	public String getReturningMonth() {
		return returningMonth;
	}

	public void setReturningMonth(String returningMonth) {
		this.returningMonth = returningMonth;
	}

	public String getReturningDate() {
		return returningDate;
	}


	public void setReturningDate(String returningDate) {
		this.returningDate = returningDate;
	}


	public String getAirline() {
		return airline;
	}


	public void setAirline(String airline) {
		this.airline = airline;
	}
	
	
	
	@Override
	public String toString() {
		  return "FlightFinderDTO [passengers=" + passengers + ", departingFrom=" + departingFrom + ", departingOnMonth=" + departingOnMonth + ",departingOnDate=" + departingOnDate + ", arrivingIn=" + arrivingIn + ",returningMonth=" + returningMonth + ",returningDate=" + returningDate + ",serviceClass="+serviceClass+", airline=" + airline + ",]";
		 }
}
