package com.bridgelabz;

import java.text.ParseException;
import java.util.Scanner;

public class Application {
    HotelReservationService hotelReservationService = new HotelReservationService();
    private Scanner scanner;

    public void provideUserOptions() throws ParseException {
       Scanner scanner1 = new Scanner(System.in);
        boolean loop= true;
        while (loop) {
            System.out.println("Choose Options" + "\n1].Add Hotel" +
                    "\n2].Find CheapRate Hotel" +
                    "\n0].Exit");
            String userOption = scanner1.nextLine();
            switch (userOption) {
                case "1" :
                    addHotel();
                    break;
                case "2" :
                    findCheapestHotel();
                    break;
                case "0" :
                    loop=false;

            }
        }
    }

    public void findCheapestHotel() throws ParseException {
        scanner = new Scanner(System.in);
        System.out.println("Enter The Check-In-Date (dd-mm-yyyy)");
        String checkInDate = scanner.nextLine();
        System.out.println("Enter The Check-out-Date (dd-mm-yyyy)");
        String checkOutDate = scanner.nextLine();
        hotelReservationService.findRate(hotelReservationService.findDateDifference(checkInDate,checkOutDate));
    }

    public void addHotel(){
        Hotel hotel = new Hotel();
        System.out.println("Enter The Hotel Name");
        String name = scanner.nextLine();
        System.out.println("Enter The Hotel Rate");
        float rate = scanner.nextFloat();
        hotel.setHotelName(name);
        hotel.setRate(rate);
        hotelReservationService.hotellist.add(hotel);

    }

    public static void main(String[] args) throws ParseException {
        System.out.println("Welcome to Hotel Management");
        Application application = new Application();
        application.provideUserOptions();
    }
}
