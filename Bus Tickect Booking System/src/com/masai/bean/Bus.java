package com.masai.bean;


import java.sql.Date;
import java.sql.Time;

public class Bus {

	private String busName;
	private String busNo;
	private boolean ac;
	private String source;
	private String destination;
	private String departure;
	private String arrival;
	private int totalSeats;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(String busName, String busNo, boolean ac, String source, String destination, String departure,
			String arrival, int totalSeats) {
		super();
		this.busName = busName;
		this.busNo = busNo;
		this.ac = ac;
		this.source = source;
		this.destination = destination;
		this.departure = departure;
		this.arrival = arrival;
		this.totalSeats = totalSeats;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	@Override
	public String toString() {
		return "Bus [busName=" + busName + ", busNo=" + busNo + ", ac=" + ac + ", source=" + source + ", destination="
				+ destination + ", departure=" + departure + ", arrival=" + arrival + ", totalSeats=" + totalSeats
				+ "]";
	}
	
	
}
