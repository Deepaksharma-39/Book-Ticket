package com.masai.bean;

public class Tickect {

	private int ticketid;
	private int customerid;
	private String busno;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getBusno() {
		return busno;
	}
	public void setBusno(String busno) {
		this.busno = busno;
	}
	public Tickect(int ticketid, int customerid, String busno) {
		super();
		this.ticketid = ticketid;
		this.customerid = customerid;
		this.busno = busno;
	}
	@Override
	public String toString() {
		return "Tickect [ticketid=" + ticketid + ", customerid=" + customerid + ", busno=" + busno + "]";
	}
	
	
}
