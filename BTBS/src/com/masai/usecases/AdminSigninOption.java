package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Bus;
import com.masai.main.Main;

public class AdminSigninOption {

    public void AdminOptions() {
        Scanner input= new Scanner(System.in);
        System.out.println("******************************************");
        
        System.out.println("What would you like to do? \n"
               + "1. Add a new Bus \n"
               + "2. Remove Bus \n"
               + "3. Show all Buses \n "
               + "4. Confirm bookings \n"
               + "5. Exit");
        
        int adminChoice=input.nextInt();
        
        AdminSigninOption aso=new AdminSigninOption();
        
        switch(adminChoice) {
        
        case 1:
            System.out.println("Enter New Bus Details");
           AddBus adbus=new AddBus();
           String res=adbus.registerBus();
           System.out.println(res);
           
           aso.AdminOptions();
           break;
           
        case 2:
            System.out.println("REMOVE BUS");
            RemoveBus rb=new RemoveBus();
            
            while(!rb.Removebus()) {
                rb.Removebus();
            }
            
            aso.AdminOptions();
            break;
            
            
        case 3:
            System.out.println("Enter username to show all the buses");
            ShowAdminBuses sab=new ShowAdminBuses();
            List<Bus> buses=sab.showBus();
            buses.forEach(b->System.out.println(b));
            aso.AdminOptions();
            break;
            
        case 4:
            System.out.println("CONFIRM TICKETS");
            Bookings con=new Bookings();
            con.confirmTicket();
            System.out.println("******************************************");
            aso.AdminOptions();
            break;
            
        case 5:
            break;
            
        }
    }
}
