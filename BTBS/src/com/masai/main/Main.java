package com.masai.main;

import java.util.Scanner;


import com.masai.usecases.AdminSigninOption;
import com.masai.usecases.AdminSingin;
import com.masai.usecases.CustomerLogin;
import com.masai.usecases.CustomerSignUp;
import com.masai.usecases.CustomerSigninOption;
import com.masai.usecases.RegisterAdmin;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Bus Ticket Reservation System \n"
				+ "Select Any 1 option to continue \n"
				+ "1. Customer Signin \n"
				+ "2. Customer Signup \n"
				+ "3. Admin Login \n"
				+ "4. Admin SignUp");
		
		
		Scanner input= new Scanner(System.in);
		
		int choice=input.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("WELCOME TO CUSTOMER LOGIN PAGE");
			CustomerLogin cl= new CustomerLogin();
			if(cl.signin()) {
	            CustomerSigninOption cso1=new CustomerSigninOption();
	            cso1.CustomerOptions();   
			}else {
			    
			}
			
			
		case 2:
			System.out.println("WELCOME TO CUSTOMER SIGNUP PAGE");
			CustomerSignUp csu= new CustomerSignUp();
			String res2=csu.SignUp();
			System.out.println(res2);
			
			CustomerSigninOption cso=new CustomerSigninOption();
			cso.CustomerOptions();
			
			
			
		case 3:
		    System.out.println("WELCOME TO ADMIN LOGIN PAGE");
		    AdminSingin as= new AdminSingin();
		    String res1=as.signin();
		    System.out.println(res1);
		    
		    AdminSigninOption aso=new AdminSigninOption();
		    aso.AdminOptions();
			
			
			
		case 4:
		    System.out.println("WELCOME TO ADMIN SIGNUP PAGE");
		    
		    RegisterAdmin ra=new RegisterAdmin();
			String res=ra.signup();
			System.out.println(res);
			
			AdminSigninOption aso1=new AdminSigninOption();
			aso1.AdminOptions();
			
			
			
		}
		
		

	}

}
