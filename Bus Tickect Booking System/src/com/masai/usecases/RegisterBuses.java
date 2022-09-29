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
		int busNo=input.nextInt();
		
		System.out.println("Enter bus Name");
		String busname=input.next();
		
		System.out.println("Enter the Bus Source");
		String source=input.next();
		
		System.out.println("Enter the Bus Destination");
		String destination=input.next();
		
		input.nextLine();
		System.out.println("Enter the departure date (YYYY-MM-DD)");
		String departure_date=input.nextLine();
		
		System.out.println("Enter the departure time (hh:mm:ss)");
		String departure_time=input.nextLine();
		
		System.out.println("Enter total no of seats abailable");
		int total_seats=input.nextInt();
		
		System.out.println("Enter the fare per seats");
		int fare=input.nextInt();
		
		System.out.println("Is AC available");
		boolean ac=input.nextBoolean();
		
		AdminDAO adi=new AdminDAOimpl();
		String query=adi.registerBus(new Bus(busNo, busname, source, destination, departure_date, departure_time, total_seats, fare, ac));
		
		System.out.println(query);
		
	}
}
