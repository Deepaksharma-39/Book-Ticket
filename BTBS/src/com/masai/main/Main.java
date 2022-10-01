package com.masai.main;

import java.util.Scanner;

import com.masai.exceptions.CustomerException;
import com.masai.usecases.AdminSigninOption;
import com.masai.usecases.AdminSingin;
import com.masai.usecases.CustomerLogin;
import com.masai.usecases.CustomerSignUp;
import com.masai.usecases.CustomerSigninOption;
import com.masai.usecases.AdminSingUp;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to Bus Ticket Reservation System \n"
				+ "Select Any 1 option to continue \n"
				+ "1. Customer Signin \n"
				+ "2. Customer Signup \n"
				+ "3. Admin Login \n"
				+ "4. Admin SignUp");

		Scanner input = new Scanner(System.in);

		int choice = input.nextInt();

		switch (choice) {
			case 1:
				System.out.println("WELCOME TO CUSTOMER LOGIN PAGE");
				CustomerLogin cl = new CustomerLogin();
				int customerid = cl.signin();
				if (customerid > 0) {
					CustomerSigninOption cso1 = new CustomerSigninOption();
					cso1.CustomerOptions(customerid);
				}
				break;

			case 2:
				System.out.println("WELCOME TO CUSTOMER SIGNUP PAGE");
				CustomerSignUp csu = new CustomerSignUp();
				int res2 = 0;
				try {
					res2 = csu.SignUp();
				} catch (CustomerException e) {
					System.out.println(e.getMessage());
				}
				if (res2 > 0) {
					CustomerSigninOption cso = new CustomerSigninOption();
					cso.CustomerOptions(res2);
				}
				break;

			case 3:
				System.out.println("WELCOME TO ADMIN LOGIN PAGE");
				AdminSingin as = new AdminSingin();

				if (as.signin()) {
					AdminSigninOption aso = new AdminSigninOption();
					aso.AdminOptions();
				}
				break;

			case 4:
				System.out.println("WELCOME TO ADMIN SIGNUP PAGE");

				AdminSingUp ra = new AdminSingUp();
				String res = ra.signup();
				System.out.println(res);
				if (res.equals("REGISTRATION SUCCESSFUL")) {
					AdminSigninOption aso1 = new AdminSigninOption();
					aso1.AdminOptions();
				}
				break;

		}

	}

}
