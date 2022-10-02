package com.masai.bean;

import java.sql.Date;

public class Bus {

	private String busno;
	private String name;
	private String source;
	private String destination;
	private Date depaartureDate;
	private String departureTime;
	private int capacity;
	private int seatsAvailable;
	private String ac;
	public String getAc() {
        return ac;
    }
    public void setAc(String ac) {
        this.ac = ac;
    }
    private String username;
	private int fare;
	
	public int getFare() {
        return fare;
    }
    public void setFare(int fare) {
        this.fare = fare;
    }
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
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
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
	public Bus(String busno, String name, String source, String destination, Date depaartureDate, String departureTime,
			int capacity, int seatsAvailable, String username, int fair,String ac) {
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
		this.fare=fair;
		this.ac=ac;
	}
    @Override
    public String toString() {
        return "busno=" + busno + " | name=" + name 
                + " | depaartureDate=" + depaartureDate + " | departureTime=" + departureTime 
                + " | Available seats=" + seatsAvailable + " | " + ac + " | fare=" + fare;
    }
    
	
	
}
