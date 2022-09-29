package com.masai.bean;

import java.util.Date;

public class Bus {

	private String busno;
	private String name;
	private String source;
	private String destination;
	private Date depaartureDate;
	private Date departureTime;
	private int capacity;
	private int seatsAvailable;
	private String username;
	public String getBusno() {
		return busno;
	}
	public void setBusno(String busno) {
		this.busno = busno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Date getDepaartureDate() {
		return depaartureDate;
	}
	public void setDepaartureDate(Date depaartureDate) {
		this.depaartureDate = depaartureDate;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Bus(String busno, String name, String source, String destination, Date depaartureDate, Date departureTime,
			int capacity, int seatsAvailable, String username) {
		super();
		this.busno = busno;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.depaartureDate = depaartureDate;
		this.departureTime = departureTime;
		this.capacity = capacity;
		this.seatsAvailable = seatsAvailable;
		this.username = username;
	}
	@Override
	public String toString() {
		return "Bus [busno=" + busno + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ ", depaartureDate=" + depaartureDate + ", departureTime=" + departureTime + ", capacity=" + capacity
				+ ", seatsAvailable=" + seatsAvailable + ", username=" + username + "]";
	}
	
	
}
