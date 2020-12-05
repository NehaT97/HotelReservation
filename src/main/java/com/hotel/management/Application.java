package com.hotel.management;

import com.hotel.management.service.HotelManagementService;

public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Management");
        HotelManagementService hotelManagementService =  new HotelManagementService();

        hotelManagementService.addHotel("Lakewood","80","110", "80", "90");
        hotelManagementService.addHotel("Bridgewood","110","160", "50", "60");
        hotelManagementService.addHotel("Ridgewood","100","220", "40", "150");

    }
}
