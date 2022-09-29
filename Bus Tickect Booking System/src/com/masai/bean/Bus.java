package com.masai.bean;


import java.sql.Date;
import java.sql.Time;

public class Bus {

	
	private int bus_no;
	private String bus_name;
	private String source;
	private String destination;
	private String departure_date;
	private String departure_time;
	private int total_seats;
	private int far;
	private boolean ac;
	

	public Bus() {
		// TODO Auto-generated constructor stub
	}


	public int getBus_no() {
		return bus_no;
	}


	public void setBus_no(int bus_no) {
		this.bus_no = bus_no;
	}


	public String getBus_name() {
		return bus_name;
	}


	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
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


	public String getDeparture_date() {
		return departure_date;
	}


	public void setDeparture_date(String departure_date) {
		this.departure_date = departure_date;
	}


	public String getDeparture_time() {
		return departure_time;
	}


	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}


	public int getTotal_seats() {
		return total_seats;
	}


	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}


	public int getFar() {
		return far;
	}


	public void setFar(int far) {
		this.far = far;
	}


	public boolean isAc() {
		return ac;
	}


	public void setAc(boolean ac) {
		this.ac = ac;
	}


	public Bus(int bus_no, String bus_name, String source, String destination, String departure_date,
			String departure_time, int total_seats, int far, boolean ac) {
		super();
		this.bus_no = bus_no;
		this.bus_name = bus_name;
		this.source = source;
		this.destination = destination;
		this.departure_date = departure_date;
		this.departure_time = departure_time;
		this.total_seats = total_seats;
		this.far = far;
		this.ac = ac;
	}


	@Override
	public String toString() {
		return "Bus [bus_no=" + bus_no + ", bus_name=" + bus_name + ", source=" + source + ", destination="
				+ destination + ", departure_date=" + departure_date + ", departure_time=" + departure_time
				+ ", total_seats=" + total_seats + ", far=" + far + ", ac=" + ac + "]";
	}


	

	
	
}
