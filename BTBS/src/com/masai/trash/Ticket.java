package com.masai;

import java.sql.Date;

public class Ticket {

//    select c.name, 
//    b.name, b.availableseats, b.source, b.destination, b.departuredate, b.departuretime, b.availableseats,
//    t.ticketid
//    from customer c INNER JOIN bus b INNER JOIN 
//    ticket t ON c.customerid = t.customerid AND b.busno=t.busno;
    
    private String cName;
    private String cID;
    private String bName;
    private String source;
    private String destination;
    private Date departureDate;
    private String time;
    private int tickedid;
    private String status;
    
   
    public Ticket(String cName, String cID, String bName, String source, String destination, Date departureDate,
            String time, int tickedid, String status) {
        super();
        this.cName = cName;
        this.cID = cID;
        this.bName = bName;
        this.source = source;
        this.destination = destination;
        this.departureDate = departureDate;
        this.time = time;
        this.tickedid = tickedid;
        this.status = status;
    }


    public String getcName() {
        return cName;
    }


    public void setcName(String cName) {
        this.cName = cName;
    }


    public String getcID() {
        return cID;
    }


    public void setcID(String cID) {
        this.cID = cID;
    }


    public String getbName() {
        return bName;
    }


    public void setbName(String bName) {
        this.bName = bName;
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


    public Date getDepartureDate() {
        return departureDate;
    }


    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }


    public String getTime() {
        return time;
    }


    public void setTime(String time) {
        this.time = time;
    }


    public int getTickedid() {
        return tickedid;
    }


    public void setTickedid(int tickedid) {
        this.tickedid = tickedid;
    }


    public String getStatus() {
        return status;
    }


   


    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "ticked Id=" + tickedid
                + "  Name=" + cName + "   Customer ID="+ cID+ ",  Bus Name=" + bName + ",  Source=" + source + "=====> Destination=" + destination
                + ", departureDate=" + departureDate + ", time=" + time + ", Booking Status=" + status
                + ", tickedid=" + tickedid;
    }
    
    
}
