package com.hotel.management;

import com.hotel.management.entity.Hotel;
import com.hotel.management.service.HotelManagementService;

import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hotel Management");
        HotelManagementService hotelManagementService =  new HotelManagementService();
        int loop = 1;
        while (loop == 1) {
            System.out.println("\nEnter The Choices"+ "\n1]. Add Hotel" +
                                                        "\n2]. Find Cheapest Hotel" +
                                                        "\n0]. Exit");
            String input = scanner.nextLine();
            switch (input){
                case "1":
                    addHotel(scanner, hotelManagementService);
                    break;

                case "2" :
                    findCheapestHotel(scanner, hotelManagementService);
                    break;
                case "0" :
                    System.out.println("Exit From Main");
                    loop = 0;
                    break;

            }
        }
    }

    private static void findCheapestHotel(Scanner scanner, HotelManagementService hotelManagementService) {
       try {
           System.out.println("Finding cheapest rated hotel : ");
           System.out.print("Enter From Date in (DD-MM-YYYY) : ");
           String fromDate = scanner.nextLine();
           System.out.print("Enter To Date in (DD-MM-YYYY) : ");
           String toDate = scanner.nextLine();
           Map.Entry<String, Double> result = hotelManagementService.findCheapestHotel(fromDate ,toDate);
           System.out.println("Hotel Name : "+result.getKey()+"  Total cost : "+result.getValue());
       } catch (Exception ex) {
           System.out.println("Please enter a valid date in format (DD-MM-YYYY)");
       }
    }

    private static void addHotel(Scanner scanner, HotelManagementService hotelManagementService) {
        System.out.println("Enter Hotel Details");
        System.out.print("HotelName : ");
        String hotelName = scanner.nextLine();
        System.out.print("RegularCustomerRate: ");
        String regularCustomerRate = scanner.nextLine();
        System.out.print("RewardsCustomerRate : ");
        String newCustomerRate = scanner.nextLine();
        System.out.print("RegularCustomerWeekendRate: ");
        String regularCustomerWeekendRate = scanner.nextLine();
        System.out.print("RewardsCustomerWeekendRate : ");
        String newCustomerWeekendRate = scanner.nextLine();
        Hotel hotel = hotelManagementService.addHotel(hotelName, regularCustomerRate, newCustomerRate, regularCustomerWeekendRate, newCustomerWeekendRate);
        System.out.println("\nHotels added : " + hotel);
    }
}
