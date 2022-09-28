package com.practice;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String mainMenu = ("Select a choice from the menu: \n" 
	            + "1. Book a ticket\n" 
	            + "2. Agent Login\n"
	            + "3. New Agent Resistration\n"
				+ "4. Exit ");
		
		int option=0;

		System.out.println(mainMenu);

		 while (option !=4){

			option=input.nextInt();
			switch (option) {
				case 1: { 
					break;
				}
				case 2: {
					
					break;
				}
					
				case 3:{

					break;
				}
					
				case 4:{
					System.out.println("****************Thank You***********************");
					break;
				}
					
			
				default:
					break;
			}

		}


	
		
	}

}
