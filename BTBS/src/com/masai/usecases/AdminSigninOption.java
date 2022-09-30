package com.masai.usecases;

import java.util.Scanner;

public class AdminSigninOption {

    public void AdminOptions() {
        Scanner input= new Scanner(System.in);
        System.out.println("******************************************");
        
        System.out.println("What would you like to do? \n"
               + "1. Add a new Bus \n"
               + "2. Remove Bus \n"
               + "3. Exit");
        
        int adminChoice=input.nextInt();
        
        switch(adminChoice) {
        
        case 1:
           AddBus adbus=new AddBus();
           adbus.registerBus();
            
        }
    }
}
