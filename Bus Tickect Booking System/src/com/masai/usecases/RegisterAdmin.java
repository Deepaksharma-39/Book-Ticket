package com.masai.usecases;

import java.util.Scanner;

import com.masai.DAO.AdminDAO;
import com.masai.DAO.AdminDAOimpl;
import com.masai.bean.Admin;

public class RegisterAdmin {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter Admin Username");
		String username= input.next();
	
		System.out.println("Enter Password");
		String password=input.next();
		
		AdminDAO adi=new AdminDAOimpl();
		
		String query=adi.registerAdmin(new Admin(username,password));
		System.out.println(query);

	}

}
