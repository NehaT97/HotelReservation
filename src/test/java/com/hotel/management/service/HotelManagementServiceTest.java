package com.hotel.management.service;

import com.hotel.management.entity.Hotel;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;

public class HotelManagementServiceTest {

    HotelManagementService hotelManagementService = new HotelManagementService();

    @Test
    public void addHotelTest() throws ParseException {
        Hotel hotel1 = hotelManagementService.addHotel("Lakewood", "110","80","90","80");
        Hotel hotel2 = hotelManagementService.addHotel("Bridgewood", "160","110","60","50");
        Hotel hotel3 = hotelManagementService.addHotel("Ridgewood", "20","100","150","40");
        System.out.println(hotelManagementService.findCheapestHotel("05-12-2020", "09-12-2020"));

    }
}