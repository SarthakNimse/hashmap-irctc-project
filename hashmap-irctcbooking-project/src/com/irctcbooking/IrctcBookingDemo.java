package com.irctcbooking;

import com.irctcbooking.service.TicketService;
import com.irctcbooking.service.TrainService;
import com.irctcbooking.service.UserService;

import java.util.Scanner;

public class IrctcBookingDemo {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        UserService userService = new UserService();
        TrainService trainService= new TrainService();
        TicketService ticketService = new TicketService();

        int option = 0;
        do {
            System.out.println("------------------------Welcome into IRCTC Booking System---------------");
            System.out.println("please choose the option you want to process: ");
            System.out.println("1. Fill the User information");
            System.out.println("2. Display User information");
            System.out.println("3. Fill the Train information");
            System.out.println("4. Display Train information");
            System.out.println("5. Fill Ticket information");
            System.out.println("6. Display Ticket information");
            System.out.println("0: Exit");
            option = Integer.parseInt(sc.nextLine());

            switch (option){
                case 1:
                    userService.acceptUserInfo();
                    break;

                case 2:
                    userService.displayUserInfo();
                    break;

                case 3:
                    trainService.acceptTrainInfo();
                    break;

                case 4:
                    trainService.displayTrainInfo();
                    break;

                case 5:ticketService.acceptTicketInfo();

                case 6:
                    ticketService.displayTicketInfo();
            }

        }
        while (option != 0);
        System.out.println("THANK YOU FOR USING IRCTC WEBSITE!");
    }



}

