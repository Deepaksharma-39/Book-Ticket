package com.masai.usecases;

import java.sql.Date;
import java.util.Scanner;

import com.masai.DAO.AdminDAO;
import com.masai.DAO.AdminDAOimpl;
import com.masai.bean.Bus;



public class RegisterBuses {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter Bus number");
		String busNo=input.next();
		
		System.out.println("Enter bus Name");
		String busname=input.next();
		
		System.out.println("Is Bus Equipped with AC(True/false)");
		boolean ac=input.nextBoolean();
		
		System.out.println("Enter the Bus Source");
		String source=input.next();
		
		System.out.println("Enter the Bus Destination");
		String destination=input.next();
		
		input.nextLine();
		System.out.println("Enter the departure time (YYYY-MM-DD hh: mm: ss)");
		String departure=input.nextLine();
		
		System.out.println("Enter the Arrival time (YYYY-MM-DD hh: mm: ss)");
		String arrival=input.nextLine();
		
		System.out.println("Enter no of seats available");
		int seats=input.nextInt();
		
		AdminDAO adi=new AdminDAOimpl();
		String query=adi.registerBus(new Bus(busNo, busname, ac, source, destination, departure, arrival, seats));
		
		System.out.println(query);
		
	}
}
